const chatBox = document.getElementById("chat-box");
const userInput = document.getElementById("user-input");
const sendBtn = document.getElementById("send-btn");

const API_URL = "http://localhost:8080/api/chat"; 

function appendMessage(message, sender) {
  const msg = document.createElement("div");
  msg.classList.add("message", sender === "user" ? "user-message" : "bot-message");
  msg.textContent = message;
  chatBox.appendChild(msg);
  chatBox.scrollTop = chatBox.scrollHeight;
}

async function sendMessage() {
  const question = userInput.value.trim();
  if (!question) return;

  appendMessage(question, "user");
  userInput.value = "";

  const typing = document.createElement("div");
  typing.classList.add("message", "bot-message");
  typing.textContent = "Thinking...";
  chatBox.appendChild(typing);
  chatBox.scrollTop = chatBox.scrollHeight;

  try {
    const res = await fetch(API_URL, {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ question }),
    });

    const data = await res.json();
    typing.remove();
    appendMessage(data.answer, "bot");
  } catch (err) {
    typing.remove();
    appendMessage("⚠️ Could not reach server. Try again later.", "bot");
  }
}

sendBtn.addEventListener("click", sendMessage);
userInput.addEventListener("keypress", (e) => {
  if (e.key === "Enter") sendMessage();
});
