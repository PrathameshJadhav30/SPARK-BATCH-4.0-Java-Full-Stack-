// Comparing promise vs async/await style
function apiCall() {
  return new Promise((resolve) => setTimeout(() => resolve("API Response"), 1000));
}

// Using Promise
apiCall().then((data) => console.log("Promise:", data));

// Using async/await
async function fetchApi() {
  const data = await apiCall();
  console.log("Async/Await:", data);
}

fetchApi();
