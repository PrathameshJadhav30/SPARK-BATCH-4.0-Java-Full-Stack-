// ─────────────────────────────────────────────
//  Creating Strings
// ─────────────────────────────────────────────

let str1 = "Hello";               // String literal
let str2 = 'World';
let str3 = `Prathamesh`;          // Template literal
let str4 = new String("JavaScript"); // Object type (rarely used)

console.log("str1:", str1);
console.log("str4 (object):", str4);

// ─────────────────────────────────────────────
//  Escape Characters
// ─────────────────────────────────────────────

let quote = "She said, \"Learn JS!\"";
console.log("Escaped quote:", quote);

let multiLine = "Line1\nLine2\tTabbed";
console.log(multiLine);

// ─────────────────────────────────────────────
//  String Properties
// ─────────────────────────────────────────────

console.log("Length:", str1.length); // 5

// ─────────────────────────────────────────────
// Common String Methods
// ─────────────────────────────────────────────

let text = "   JavaScript is Awesome!   ";

console.log("Lowercase:", text.toLowerCase());
console.log("Uppercase:", text.toUpperCase());
console.log("Trimmed:", text.trim());
console.log("Substring (0,10):", text.substring(0, 10));
console.log("Slice (4,14):", text.slice(4, 14));
console.log("Includes 'Awesome':", text.includes("Awesome"));
console.log("Index of 'is':", text.indexOf("is"));
console.log("Replace 'Awesome' with 'Cool':", text.replace("Awesome", "Cool"));
console.log("Repeat:", str1.repeat(3)); // HelloHelloHello

// ─────────────────────────────────────────────
//  Concatenation
// ─────────────────────────────────────────────

let first = "Hello";
let second = "World";

console.log("Using +:", first + " " + second);
console.log("Using concat():", first.concat(" ", second));

// ─────────────────────────────────────────────
//  Template Literals (Backticks)
// ─────────────────────────────────────────────

let name = "Prathamesh";
let course = "JavaScript";

let intro = `My name is ${name} and I love ${course}.`;
console.log(intro);

// ─────────────────────────────────────────────
// Comparison
// ─────────────────────────────────────────────

let s1 = "apple";
let s2 = "banana";

console.log("s1 === s2:", s1 === s2);     // false
console.log("s1 < s2:", s1 < s2);         // true (alphabetical)
console.log("s1.localeCompare(s2):", s1.localeCompare(s2)); // -1

// ─────────────────────────────────────────────
//  Converting to Array
// ─────────────────────────────────────────────

let sentence = "This is JavaScript";
let words = sentence.split(" "); // split by space
console.log("Words:", words);

// ─────────────────────────────────────────────
//  Immutability of Strings
// ─────────────────────────────────────────────

let original = "hello";
original[0] = "H"; //  Does not change
console.log("Original (unchanged):", original);

// ─────────────────────────────────────────────
//  Looping through Strings
// ─────────────────────────────────────────────

let loopStr = "JS";
for (let char of loopStr) {
  console.log("Char:", char);
}

// ─────────────────────────────────────────────
//  Best Practices
// ─────────────────────────────────────────────

/*
 Use template literals for readability and dynamic strings
 Use `trim()` to clean input strings
 Prefer `includes()` over `indexOf() > -1` for clarity
 Avoid using `new String()` constructor
 Strings are immutable – operations return new strings
*/