let arr = [1, 2, 3, 4, 5];
arr.push(6); // Adds 6 to the end of the array
console.log(arr); // returns [1, 2, 3, 4, 5, 6]
arr.pop(); // Removes the last element (6)
console.log(arr); // returns [1, 2, 3, 4, 5]
arr.unshift(0); // Adds 0 to the beginning of the array
console.log(arr); // returns [0, 1, 2, 3, 4, 5]
arr.shift(); // Removes the first element (0)
console.log(arr); // returns [1, 2, 3, 4, 5]    
arr.splice(2, 1); // Removes the element at index 2 (3)
console.log(arr); // returns [1, 2, 4, 5]
arr = arr.concat([6, 7]); // Concatenates [6, 7] to the array
console.log(arr); // returns [1, 2, 4, 5, 6, 7]
let slicedArr = arr.slice(1, 4); // Slices the array from index 1 to 3
console.log(slicedArr); // returns [2, 4, 5]

// Iterating through the array
for (let i = 0; i < arr.length; i++) {
    console.log(arr[i]);
}

// Using forEach
arr.forEach((element) => {
    console.log(element);
});

// Finding an element
let foundElement = arr.find((element) => element > 4);
console.log(foundElement); // returns 5

// Filtering elements
let filteredArr = arr.filter((element) => element > 2);
console.log(filteredArr); // returns [4, 5, 6, 7]

// Mapping elements
let mappedArr = arr.map((element) => element * 2);
console.log(mappedArr); // returns [2, 4, 8, 10, 12, 14]
// Reducing the array
let reducedValue = arr.reduce((accumulator, currentValue) => accumulator + currentValue, 0);
console.log(reducedValue); // returns 27

// Checking if an element exists
let exists = arr.includes(3);
console.log(exists); // returns false

// Finding the index of an element
let index = arr.indexOf(4);
console.log(index); // returns 2

// Reversing the array
arr.reverse();
console.log(arr); // returns [7, 6, 5, 4, 2, 1]
// Sorting the array
arr.sort((a, b) => a - b); // Sorts in ascending order
console.log(arr); // returns [1, 2, 4, 5, 6, 7]
// Joining the array into a string
let joinedString = arr.join(", ");
console.log(joinedString); // returns "1, 2, 4, 5, 6, 7"
// Finding the last index of an element
let lastIndex = arr.lastIndexOf(4);
console.log(lastIndex); // returns 2

// Filling the array with a value
arr.fill(0, 1, 4); // Fills elements from index 1 to 3 with 0
console.log(arr); // returns [1, 0, 0, 0, 6, 7]

// Copying the array
let copiedArr = arr.slice(); // Creates a shallow copy of the array
console.log(copiedArr); // returns [1, 0, 0, 0, 6, 7]

// Flattening a nested array
let nestedArr = [1, 2, [3, 4], 5];
let flattenedArr = nestedArr.flat();
console.log(flattenedArr); // returns [1, 2, 3, 4, 5]