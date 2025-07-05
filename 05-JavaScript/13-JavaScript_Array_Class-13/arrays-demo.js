// ─────────────────────────────────────────────
//  Creating Arrays
// ─────────────────────────────────────────────

let fruits = ["apple", "banana", "mango"];
let numbers = new Array(1, 2, 3, 4);

console.log("Fruits:", fruits);
console.log("Numbers:", numbers);

// ─────────────────────────────────────────────
//  Accessing & Modifying Elements
// ─────────────────────────────────────────────

console.log("First fruit:", fruits[0]);  // apple
fruits[1] = "grape";                    // modifying
console.log("Updated fruits:", fruits); // [apple, grape, mango]

// ─────────────────────────────────────────────
//  Array Properties & Length
// ─────────────────────────────────────────────

console.log("Length:", fruits.length);

// ─────────────────────────────────────────────
//  Looping through Arrays
// ─────────────────────────────────────────────

console.log("Using for loop:");
for (let i = 0; i < fruits.length; i++) {
  console.log(fruits[i]);
}

console.log("Using for...of:");
for (let fruit of fruits) {
  console.log(fruit);
}

// ─────────────────────────────────────────────
//  Array Methods: push, pop, shift, unshift
// ─────────────────────────────────────────────

let colors = ["red", "blue"];

colors.push("green");       // Add to end
colors.pop();               // Remove from end
colors.unshift("yellow");   // Add to beginning
colors.shift();             // Remove from beginning

console.log("Colors:", colors); // [blue]

// ─────────────────────────────────────────────
//  slice vs splice
// ─────────────────────────────────────────────

let nums = [1, 2, 3, 4, 5];

let sliced = nums.slice(1, 4);  // [2, 3, 4] - does NOT change original
console.log("Sliced:", sliced);
console.log("Original:", nums);

let spliced = nums.splice(2, 2); // remove 2 elements from index 2
console.log("Spliced:", spliced); // [3, 4]
console.log("Modified:", nums);   // [1, 2, 5]

// ─────────────────────────────────────────────
//  Searching in Arrays
// ─────────────────────────────────────────────

let arr = [10, 20, 30, 40];
console.log("Includes 20?", arr.includes(20)); // true
console.log("Index of 30:", arr.indexOf(30));  // 2
console.log("Find > 25:", arr.find(x => x > 25)); // 30

// ─────────────────────────────────────────────
//  Higher Order Functions: forEach, map, filter, reduce
// ─────────────────────────────────────────────

arr.forEach(x => console.log("Element:", x));

let doubled = arr.map(x => x * 2);
console.log("Doubled:", doubled); // [20, 40, 60, 80]

let filtered = arr.filter(x => x > 20);
console.log("Filtered:", filtered); // [30, 40]

let sum = arr.reduce((acc, val) => acc + val, 0);
console.log("Sum:", sum); // 100

// ─────────────────────────────────────────────
//  Sorting & Reversing
// ─────────────────────────────────────────────

let nums2 = [40, 10, 100, 50];
nums2.sort((a, b) => a - b); // Ascending
console.log("Sorted:", nums2);

nums2.reverse();
console.log("Reversed:", nums2);

// ─────────────────────────────────────────────
// Multidimensional Arrays
// ────────────────────────────────────────────

let matrix = [
  [1, 2],
  [3, 4],
  [5, 6]
];
console.log("Matrix[1][0]:", matrix[1][0]); // 3

// ─────────────────────────────────────────────
//  Spread Operator & Destructuring
// ─────────────────────────────────────────────

let moreFruits = ["pineapple", ...fruits]; // spread
console.log("More Fruits:", moreFruits);

let [f1, f2, f3] = fruits; // destructure
console.log("f1:", f1, "f2:", f2, "f3:", f3);

// ─────────────────────────────────────────────
//  Best Practices
// ─────────────────────────────────────────────

/*
 Prefer const for arrays if not reassigning
Use array methods instead of manual loops when possible
 Avoid using delete on arrays (use splice)
 Use spread (...) to copy or merge arrays
 Use arrow functions for concise transformations
*/
