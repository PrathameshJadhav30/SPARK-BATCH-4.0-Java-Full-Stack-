
// ─────────────────────────────────────────────
//  Declaring Variables using var, let, const
// ─────────────────────────────────────────────

var name = "Prathamesh";      // var is function-scoped
let age = 22;                 // let is block-scoped
const country = "India";      // const is block-scoped and cannot be reassigned

console.log("Name:", name);       // Prathamesh
console.log("Age:", age);         // 22
console.log("Country:", country); // India

// ─────────────────────────────────────────────
//  Re-declaration & Re-assignment
// ─────────────────────────────────────────────

var city = "Mumbai";
var city = "Pune";           //  Allowed with var (redeclaration)
console.log("City:", city);  // Pune

let college = "MIT";
// let college = "COEP";      Not allowed (SyntaxError: Identifier 'college' has already been declared)

college = "COEP";            //  Reassignment is allowed
console.log("College:", college);

const PI = 3.141;
// const PI = 3.14;           Not allowed (SyntaxError)
// PI = 3.14;                 Not allowed (TypeError)
console.log("PI:", PI);

// ─────────────────────────────────────────────
//  Scope (var - function, let/const - block)
// ─────────────────────────────────────────────

function scopeDemo() {
    if (true) {
        var a = 10;
        let b = 20;
        const c = 30;

        console.log("Inside block: a =", a); // 10
        console.log("Inside block: b =", b); // 20
        console.log("Inside block: c =", c); // 30
    }

    console.log("Outside block: a =", a); // 10
    // console.log(b);  //  Error: b is not defined
    // console.log(c);  //  Error: c is not defined
}
scopeDemo();

// ─────────────────────────────────────────────
//  Hoisting
// ─────────────────────────────────────────────

// Variable declarations are hoisted to the top of their scope
console.log("Hoisting with var:", hoistedVar); // undefined
var hoistedVar = "I am hoisted";

// console.log("Hoisting with let:", hoistedLet); //  ReferenceError
let hoistedLet = "Not hoisted like var";

// ─────────────────────────────────────────────
//  Global Variables
// ─────────────────────────────────────────────

var globalVar = "I'm global with var";
let globalLet = "I'm global with let";

console.log(window.globalVar); //  works in browser
// console.log(window.globalLet); //  undefined

// ─────────────────────────────────────────────
// Best Practices
// ─────────────────────────────────────────────

/*
 Always prefer:
  - `let` for variables that can change
  - `const` for constants (e.g., arrays, objects)
 Avoid `var` due to hoisting issues and scope confusion
*/

let student = {
    name: "Amit",
    age: 21
};
student.age = 22; //  Object properties can change even if declared with const

console.log("Student:", student);