const para = document.getElementById("para");
para.textContent = "Changed Text!";
para.style.color = "blue";
para.classList.add("highlight");
const btn = document.getElementById("btn");
btn.addEventListener("click", function() {
  alert("Button clicked!");
});
const newElement = document.createElement("p");
newElement.textContent = "This is a new paragraph.";
document.body.appendChild(newElement);
const list = document.getElementById("list");