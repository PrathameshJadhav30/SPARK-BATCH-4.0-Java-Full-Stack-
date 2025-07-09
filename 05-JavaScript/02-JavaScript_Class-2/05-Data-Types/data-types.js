let name = "Prathamesh";  //string
let age = 25;  //number
let isStudent = true;  //boolean
let hobbies = ["reading", "coding", "gaming"];  //array
let address = { city: "Pune", state: "Maharashtra" };  //object
let nullValue = null;  //null
let undefinedValue;  //undefined
let symbolValue = Symbol("unique");  //symbol
let bigIntValue = BigInt(123456789012345678901234567890);  //bigint
console.log("Name:", name);
console.log("Age:", age);
console.log("Is Student:", isStudent);
console.log("Hobbies:", hobbies);
console.log("Address:", address);
console.log("Null Value:", nullValue);
console.log("Undefined Value:", undefinedValue);
console.log("Symbol Value:", symbolValue);
console.log("BigInt Value:", bigIntValue);
// Type checking
console.log("Type of name:", typeof name);
console.log("Type of age:", typeof age);
console.log("Type of isStudent:", typeof isStudent);
console.log("Type of hobbies:", typeof hobbies);
console.log("Type of address:", typeof address);
console.log("Type of nullValue:", typeof nullValue);
console.log("Type of undefinedValue:", typeof undefinedValue);
console.log("Type of symbolValue:", typeof symbolValue);
console.log("Type of bigIntValue:", typeof bigIntValue);
// Type conversion
let numString = "123";
let num = Number(numString);
let strNum = String(num);
let boolValue = Boolean(1);  // converts number to boolean
console.log("Converted Number:", num);
console.log("Converted String:", strNum);
console.log("Converted Boolean:", boolValue);
// Checking for NaN
let notANumber = "abc";
let isNaNValue = isNaN(notANumber);
console.log("Is 'abc' NaN?:", isNaNValue);  // true, because "abc" cannot be converted to a number
// Checking for Infinity
let positiveInfinity = Infinity;
let negativeInfinity = -Infinity;
console.log("Is Positive Infinity:", isFinite(positiveInfinity));
console.log("Is Negative Infinity:", isFinite(negativeInfinity));
// Checking for null and undefined
console.log("Is nullValue null?:", nullValue === null);  // true
console.log("Is undefinedValue undefined?:", typeof undefinedValue === "undefined");  // true
// Checking for empty values
let emptyString = "";
let isEmptyString = emptyString === "";
console.log("Is emptyString empty?:", isEmptyString);  // true
// Checking for empty array
let emptyArray = [];
let isEmptyArray = Array.isArray(emptyArray) && emptyArray.length === 0;
console.log("Is emptyArray empty?:", isEmptyArray);  // true
// Checking for empty object
let emptyObject = {};
let isEmptyObject = Object.keys(emptyObject).length === 0;
console.log("Is emptyObject empty?:", isEmptyObject);  // true
