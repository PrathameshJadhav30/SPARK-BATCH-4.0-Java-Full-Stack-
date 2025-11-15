const socket = new WebSocket("ws://localhost:8080/chat");

const chatBox = document.getElementById("chat-box");
const input = document.getElementById("messageInput");
const sendBtn = document.getElementById("sendBtn");

// Add message to chat UI
function addMessage(text, sender) {
    const div = document.createElement("div");
    div.classList.add("message", sender === "user" ? "user-message" : "bot-message");
    div.textContent = text;
    chatBox.appendChild(div);
    chatBox.scrollTop = chatBox.scrollHeight;
}

socket.onopen = () => {
    addMessage("Connected to Gemini WebSocket ✔", "bot");
};

socket.onmessage = (event) => {
    addMessage(event.data, "bot");
};

socket.onclose = () => {
    addMessage("Chat disconnected ❌", "bot");
};

// Send message
sendBtn.addEventListener("click", () => {
    const text = input.value.trim();
    if (text === "") return;

    addMessage(text, "user");
    socket.send(text);

    input.value = "";
});

// Send on Enter Key
input.addEventListener("keypress", (e) => {
    if (e.key === "Enter") sendBtn.click();
});
