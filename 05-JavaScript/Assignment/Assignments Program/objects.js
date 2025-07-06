let person = {
  name: "Prathamesh",
  age: 25,
  greet() { console.log("Hello"); }
};

console.log(person.name);
console.log(person["age"]);
person.age = 30;

// Loop and Object methods
for (let key in person){
    console.log(key, person[key]);
} 
console.log(Object.keys(person));
console.log(Object.values(person));
console.log(Object.entries(person));

// Object destructuring
let {name, age} = person;
console.log(name, age);
// Object spread operator
let newPerson = {...person, city: "Pune"};
console.log(newPerson);
// Object methods
console.log(Object.keys(newPerson)); // Get keys
console.log(Object.values(newPerson)); // Get values
console.log(Object.entries(newPerson)); // Get entries
console.log(Object.assign({}, newPerson)); // Clone object
// Object prototype
console.log(Object.getPrototypeOf(newPerson)); // Get prototype
// Object creation
function createPerson(name, age) {
  return {
    name,
    age,
    greet() {
      console.log(`Hello, my name is ${this.name} and I am ${this.age} years old.`);
    }
  };
}
let person1 = createPerson("John", 28);
let person2 = createPerson("Jane", 32);
person1.greet(); // Hello, my name is John and I am 28 years old.


