// ─────────────────────────────────────────────
//  Primitive Data Types (Immutable)
// ─────────────────────────────────────────────

//  String
let name = "Prathamesh";
console.log("String:", name, "| Type:", typeof name); // string

//  Number (includes integers & floating-point)
let age = 22;
let pi = 3.14159;
console.log("Number (int):", age, "| Type:", typeof age);
console.log("Number (float):", pi, "| Type:", typeof pi);

//  Boolean
let isStudent = true;
console.log("Boolean:", isStudent, "| Type:", typeof isStudent);

//  Undefined (declared but not assigned)
let address;
console.log("Undefined:", address, "| Type:", typeof address);

//  Null (represents no value but typeof returns 'object' — JS quirk)
let marks = null;
console.log("Null:", marks, "| Type:", typeof marks); // object

//  Symbol (used for unique identifiers)
let sym1 = Symbol("id");
let sym2 = Symbol("id");
console.log("Symbol:", sym1, "| Type:", typeof sym1);
console.log("sym1 === sym2:", sym1 === sym2); // false (unique)

//  BigInt (for integers beyond 2^53 - 1)
let bigNumber = 1234567890123456789012345678901234567890n;
console.log("BigInt:", bigNumber, "| Type:", typeof bigNumber);

// ─────────────────────────────────────────────
//  Reference (Non-Primitive) Types (Mutable)
// ─────────────────────────────────────────────

//  Object
let student = {
  name: "Amit",
  age: 21
};
console.log("Object:", student, "| Type:", typeof student);

//  Array (typeof returns 'object')
let scores = [85, 90, 78];
console.log("Array:", scores, "| Type:", typeof scores);

//  Function (typeof returns 'function')
function greet() {
  return "Hello!";
}
console.log("Function:", greet, "| Type:", typeof greet);

// ─────────────────────────────────────────────
//  typeof Operator Summary
// ─────────────────────────────────────────────

/*
| Value             | typeof       |
|------------------|--------------|
| "text"           | string       |
| 123              | number       |
| true/false       | boolean      |
| undefined        | undefined    |
| null             | object (quirk)|
| Symbol()         | symbol       |
| BigInt           | bigint       |
| [1,2,3]          | object        |
| {a:1}            | object        |
| function(){}     | function      |
*/

// ─────────────────────────────────────────────
//  Dynamic Typing
// ─────────────────────────────────────────────

let dynamic = "Hello";     // string
console.log(dynamic, "|", typeof dynamic);

dynamic = 100;             // number
console.log(dynamic, "|", typeof dynamic);

dynamic = true;            // boolean
console.log(dynamic, "|", typeof dynamic);

// ─────────────────────────────────────────────
//  Special Cases
// ─────────────────────────────────────────────

// NaN (Not a Number)
let invalid = "abc" / 3;
console.log("NaN example:", invalid, "| Type:", typeof invalid); // NaN, number

// null vs undefined
let a;
let b = null;
console.log("a (undefined):", a);
console.log("b (null):", b);

// ─────────────────────────────────────────────
//  Best Practices
// ─────────────────────────────────────────────

/*
 Use `typeof` to check primitive types
 Use `Array.isArray()` to check arrays
Use strict equality (===) to avoid type coercion
*/

console.log("Is array?", Array.isArray(scores)); // true
console.log("Strict equality:", 1 === "1"); // false