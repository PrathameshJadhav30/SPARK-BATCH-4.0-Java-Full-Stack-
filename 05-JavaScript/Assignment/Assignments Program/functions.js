//Normal Functions

function add(a, b) {    
    return a + b;
}
add(5, 10); // returns 15

//Expression & Arrow Functions
const addExpression = function(a, b) {
    return a + b;
}
addExpression(5, 10); // returns 15

const addArrow = (a, b) => {
    return a + b;
}
addArrow(5, 10); // returns 15

//default parameters
function multiply(a, b = 1) {
    return a * b;
}
multiply(5); // returns 5   

//callback functions
function processArray(arr, callback) {
    return arr.map(callback);
}
const numbers = [1, 2, 3, 4, 5];
const doubled = processArray(numbers, (num) => num * 2);
console.log(doubled); // returns [2, 4, 6, 8, 10]