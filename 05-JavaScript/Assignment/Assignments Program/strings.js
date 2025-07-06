let str = "JavaScript is awesome";
console.log(str.slice(0, 10));
console.log(str.split(" "));
console.log(str.replace("awesome", "powerful"));
console.log(str.toUpperCase());

// Template literals
let user = "Prathamesh";
console.log(`Welcome, ${user}`);
// String methods
console.log(str.length); // Length of the string
console.log(str.indexOf("awesome")); // Index of a substring
console.log(str.lastIndexOf("is")); // Last index of a substring
console.log(str.charAt(0)); // Character at a specific index
console.log(str.startsWith("Java")); // Check if string starts with a substring
console.log(str.endsWith("awesome")); // Check if string ends with a substring
console.log(str.includes("is")); // Check if string contains a substring
// String concatenation
let str1 = "Hello";
let str2 = "World";
let concatenatedStr = str1 + " " + str2; // Using + operator
console.log(concatenatedStr);
