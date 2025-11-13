const API_BASE = "http://localhost:8081/api/resume";

// ===== Utility: Pretty Print JSON with Colors =====
function syntaxHighlight(json) {
  if (typeof json !== "string") {
    json = JSON.stringify(json, undefined, 2);
  }
  json = json.replace(/&/g, "&amp;").replace(/</g, "&lt;").replace(/>/g, "&gt;");
  return json.replace(
    /("(\\u[a-zA-Z0-9]{4}|\\[^u]|[^\\"])*"(\s*:)?|\b(true|false|null)\b|\b\d+\b)/g,
    function (match) {
      let cls = "json-number";
      if (/^"/.test(match)) {
        cls = /:$/.test(match) ? "json-key" : "json-string";
      } else if (/true|false/.test(match)) {
        cls = "json-boolean";
      } else if (/null/.test(match)) {
        cls = "json-null";
      }
      return `<span class="${cls}">${match}</span>`;
    }
  );
}

// ===== Utility: Format JSON Result Card =====
function formatJSON(data) {
  try {
    const formatted = syntaxHighlight(data);
    return `
      <div class="json-card fade-in">
        <pre>${formatted}</pre>
      </div>
    `;
  } catch (e) {
    return `<div class="json-card"><pre>${data}</pre></div>`;
  }
}

// ===== Resume Analyzer =====
document.getElementById("resumeForm").addEventListener("submit", async (e) => {
  e.preventDefault();

  const fileInput = document.getElementById("resumeFile");
  const resultDiv = document.getElementById("resumeResult");

  if (!fileInput.files[0]) {
    alert("Please upload a resume file.");
    return;
  }

  const formData = new FormData();
  formData.append("file", fileInput.files[0]);

  resultDiv.innerHTML = `
    <div class="loading-box">
      <div class="spinner"></div>
      <p>Analyzing your resume... please wait ⏳</p>
    </div>
  `;

  try {
    const response = await fetch(`${API_BASE}/analyze`, {
      method: "POST",
      body: formData,
    });

    if (!response.ok) throw new Error(`Server responded with ${response.status}`);

    const data = await response.json();
    const analysis = data.analysis || data;

    resultDiv.innerHTML = `
      <h3>📄 Resume Analysis Result</h3>
      ${formatJSON(analysis)}
    `;
  } catch (error) {
    resultDiv.innerHTML = `<div class="error">❌ Error: ${error.message}</div>`;
  }
});

// ===== ATS Checker =====
document.getElementById("atsForm").addEventListener("submit", async (e) => {
  e.preventDefault();

  const fileInput = document.getElementById("atsFile");
  const jobDescription = document.getElementById("jobDescription").value.trim();
  const resultDiv = document.getElementById("atsResult");

  if (!fileInput.files[0] || !jobDescription) {
    alert("Please upload a resume and enter a job description.");
    return;
  }

  const formData = new FormData();
  formData.append("file", fileInput.files[0]);
  formData.append("jd", jobDescription);

  resultDiv.innerHTML = `
    <div class="loading-box">
      <div class="spinner"></div>
      <p>Checking ATS compatibility... 🔍</p>
    </div>
  `;

  try {
    const response = await fetch(`${API_BASE}/ats-check`, {
      method: "POST",
      body: formData,
    });

    if (!response.ok) throw new Error(`Server responded with ${response.status}`);

    const data = await response.json();
    const report = data.atsReport || data;

    resultDiv.innerHTML = `
      <h3>🧾 ATS Compatibility Report</h3>
      ${formatJSON(report)}
    `;
  } catch (error) {
    resultDiv.innerHTML = `<div class="error">❌ Error: ${error.message}</div>`;
  }
});
