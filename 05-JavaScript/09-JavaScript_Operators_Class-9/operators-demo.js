
// ─────────────────────────────────────────────
//  Arithmetic Operators
// ─────────────────────────────────────────────

let a = 10, b = 3;
console.log("Addition:", a + b);           // 13
console.log("Subtraction:", a - b);        // 7
console.log("Multiplication:", a * b);     // 30
console.log("Division:", a / b);           // 3.333...
console.log("Modulus:", a % b);            // 1
console.log("Exponentiation:", a ** b);    // 1000
console.log("Increment:", ++a);            // 11
console.log("Decrement:", --b);            // 2

// ─────────────────────────────────────────────
//  Assignment Operators
// ─────────────────────────────────────────────

let x = 5;
x += 3; // x = x + 3
console.log("x += 3:", x); // 8

x -= 2;
console.log("x -= 2:", x); // 6

x *= 2;
console.log("x *= 2:", x); // 12

x /= 3;
console.log("x /= 3:", x); // 4

x %= 3;
console.log("x %= 3:", x); // 1

x **= 3;
console.log("x **= 3:", x); // 1

// ─────────────────────────────────────────────
//  Comparison Operators
// ─────────────────────────────────────────────

let p = 5, q = "5";
console.log("== (loose):", p == q);        // true
console.log("=== (strict):", p === q);     // false
console.log("!= (loose):", p != q);        // false
console.log("!== (strict):", p !== q);     // true
console.log(">", p > 3);                   // true
console.log("<", p < 3);                   // false
console.log(">=", p >= 5);                 // true
console.log("<=", p <= 4);                 // false

// ─────────────────────────────────────────────
//  Logical Operators
// ─────────────────────────────────────────────

let isLoggedIn = true;
let isAdmin = false;

console.log("AND (&&):", isLoggedIn && isAdmin); // false
console.log("OR (||):", isLoggedIn || isAdmin);  // true
console.log("NOT (!):", !isLoggedIn);            // false

// ─────────────────────────────────────────────
//  Unary Operators
// ─────────────────────────────────────────────

let num = 10;
console.log("Unary minus:", -num);        // -10
console.log("Unary plus:", +"123");       // 123 (converts to number)
console.log("Typeof:", typeof num);       // number

// ─────────────────────────────────────────────
//  Ternary Operator
// ─────────────────────────────────────────────

let age = 18;
let message = age >= 18 ? "Adult" : "Minor";
console.log("Ternary Result:", message); // Adult

// ─────────────────────────────────────────────
//  Bitwise Operators
// ─────────────────────────────────────────────

let bitA = 5;  // 0101
let bitB = 3;  // 0011

console.log("Bitwise AND (&):", bitA & bitB);   // 1
console.log("Bitwise OR (|):", bitA | bitB);    // 7
console.log("Bitwise XOR (^):", bitA ^ bitB);   // 6
console.log("Bitwise NOT (~):", ~bitA);         // -6
console.log("Left Shift (<<):", bitA << 1);     // 10
console.log("Right Shift (>>):", bitA >> 1);    // 2

// ─────────────────────────────────────────────
//  String Concatenation Operator
// ─────────────────────────────────────────────

let first = "Java";
let second = "Script";
console.log("Concatenated:", first + second); // JavaScript

// ─────────────────────────────────────────────
//  Type Coercion in Operators
// ─────────────────────────────────────────────

console.log("'5' + 2:", '5' + 2);   // "52"
console.log("'5' - 2:", '5' - 2);   // 3
console.log("'5' * 2:", '5' * 2);   // 10
console.log("'5' / 2:", '5' / 2);   // 2.5

// ─────────────────────────────────────────────
//  Operator Precedence
// ─────────────────────────────────────────────

let result = 10 + 5 * 2;   // 10 + (5*2) = 20
console.log("Precedence:", result);

result = (10 + 5) * 2;     // (10+5)*2 = 30
console.log("With parentheses:", result);