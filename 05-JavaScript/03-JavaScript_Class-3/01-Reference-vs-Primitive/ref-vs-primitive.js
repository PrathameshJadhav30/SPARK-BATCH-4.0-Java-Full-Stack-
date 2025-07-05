//primitive vs reference types
// Primitive types: string, number, boolean, null, undefined, symbol
// Reference types: object, array, function
let primitiveValue = 42; // Primitive type
let referenceValue = { key: "value" }; // Reference type
console.log("Primitive Value:", primitiveValue);
console.log("Reference Value:", referenceValue);
// Modifying primitive value
primitiveValue = 100;
console.log("Modified Primitive Value:", primitiveValue);
// Modifying reference value
referenceValue.key = "newValue";
console.log("Modified Reference Value:", referenceValue);
// Comparing primitive and reference types
let anotherPrimitiveValue = primitiveValue; // Copying primitive value
let anotherReferenceValue = referenceValue; // Copying reference value
console.log("Another Primitive Value:", anotherPrimitiveValue);
console.log("Another Reference Value:", anotherReferenceValue);
