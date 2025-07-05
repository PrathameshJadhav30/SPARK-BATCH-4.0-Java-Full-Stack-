// ─────────────────────────────────────────────
//  Function Declaration
// ─────────────────────────────────────────────

function greet(name) {
  console.log("Hello, " + name);
}
greet("Prathamesh"); // Hello, Prathamesh

// ─────────────────────────────────────────────
//  Function Expression (Anonymous Function)
// ─────────────────────────────────────────────

const add = function (a, b) {
  return a + b;
};
console.log("Sum:", add(3, 5)); // 8

// ─────────────────────────────────────────────
//  Arrow Function (ES6+)
// ─────────────────────────────────────────────

const multiply = (a, b) => a * b;
console.log("Product:", multiply(4, 6)); // 24

// ─────────────────────────────────────────────
//  Parameters vs Arguments
// ─────────────────────────────────────────────

function introduce(name, age) {
  console.log(`I am ${name}, and I am ${age} years old.`);
}
introduce("Amit", 22);

// ─────────────────────────────────────────────
//  Default Parameters
// ─────────────────────────────────────────────

function power(base, exponent = 2) {
  return base ** exponent;
}
console.log("Power:", power(3));     // 9
console.log("Power:", power(2, 3));  // 8

// ─────────────────────────────────────────────
//  Return Statement
// ─────────────────────────────────────────────

function getGreeting(name) {
  return "Welcome, " + name + "!";
}
let msg = getGreeting("Jadhav");
console.log(msg);

// ─────────────────────────────────────────────
//  Function Scope
// ─────────────────────────────────────────────

function outerFunction() {
  let outerVar = "I'm outside";

  function innerFunction() {
    console.log("Accessing:", outerVar);
  }

  innerFunction();
}
outerFunction();

// ─────────────────────────────────────────────
//  Function Hoisting (Only for declarations)
// ─────────────────────────────────────────────

hoistedFunc(); //  Works because it's hoisted

function hoistedFunc() {
  console.log("This function is hoisted!");
}

// notHoisted();  Error: Cannot access before initialization
const notHoisted = function () {
  console.log("This is not hoisted.");
};

// ─────────────────────────────────────────────
//  Callback Functions (functions passed as arguments)
// ─────────────────────────────────────────────

function processUserInput(callback) {
  let name = "Prathamesh";
  callback(name);
}
processUserInput(function (user) {
  console.log("Hello from callback, " + user);
});

// ─────────────────────────────────────────────
// IIFE - Immediately Invoked Function Expression
// ─────────────────────────────────────────────

(function () {
  console.log("IIFE runs immediately!");
})();

// ─────────────────────────────────────────────
//  Recursive Function
// ─────────────────────────────────────────────

function factorial(n) {
  if (n === 0) return 1;
  return n * factorial(n - 1);
}
console.log("Factorial of 5:", factorial(5)); // 120

// ─────────────────────────────────────────────
//  Best Practices
// ─────────────────────────────────────────────

/*
- Use arrow functions for short, simple logic
- Use named functions for readability
- Always return a value if needed
- Keep functions small and focused (single responsibility)
- Use default parameters to handle undefined inputs
*/