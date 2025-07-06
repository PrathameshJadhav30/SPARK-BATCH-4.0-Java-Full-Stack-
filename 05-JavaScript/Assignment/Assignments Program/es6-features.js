//Q.3 List 5 features of ES6
// 1. Arrow functions
// 2. Template literals
// 3. Destructuring assignment
// 4. Default parameters
// 5. Promises
// let & const - block-scoped variables
let a = 10;
const b = 20;

// Arrow function
const add = (x, y) => x + y;

// Template literal
const greeting = `The sum of ${a} and ${b} is ${add(a, b)}`;

// Destructuring assignment
const numbers = [10, 20];
const [x, y] = numbers;

// Default parameters
const multiply = (x, y = 1) => x * y;


