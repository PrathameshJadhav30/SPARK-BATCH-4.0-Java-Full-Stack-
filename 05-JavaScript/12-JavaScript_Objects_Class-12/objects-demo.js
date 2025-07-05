// ─────────────────────────────────────────────
//  Creating Objects
// ─────────────────────────────────────────────

//  Using object literal
const student = {
  name: "Prathamesh",
  age: 22,
  course: "AI & DS"
};

console.log("Student:", student);

//  Using object constructor
const employee = new Object();
employee.name = "Amit";
employee.id = 101;
employee.department = "IT";

console.log("Employee:", employee);

// ─────────────────────────────────────────────
//  Accessing Properties
// ─────────────────────────────────────────────

console.log("Name (dot):", student.name);
console.log("Age (bracket):", student["age"]);

// ─────────────────────────────────────────────
//  Adding, Updating, Deleting Properties
// ─────────────────────────────────────────────

student.year = 2025;            // add
student.age = 23;               // update
delete student.course;          // delete

console.log("Updated Student:", student);

// ─────────────────────────────────────────────
//  Nested Objects
// ─────────────────────────────────────────────

const user = {
  username: "pjadhav",
  details: {
    email: "pj@gmail.com",
    location: {
      city: "Sangli",
      state: "Maharashtra"
    }
  }
};

console.log("City:", user.details.location.city);

// ─────────────────────────────────────────────
//  Methods inside Object
// ─────────────────────────────────────────────

const calculator = {
  add(a, b) {
    return a + b;
  },
  subtract: function (a, b) {
    return a - b;
  }
};

console.log("Add:", calculator.add(10, 5));         // 15
console.log("Subtract:", calculator.subtract(10, 5)); // 5

// ─────────────────────────────────────────────
//  this Keyword
// ─────────────────────────────────────────────

const person = {
  firstName: "Prathamesh",
  lastName: "Jadhav",
  fullName() {
    return this.firstName + " " + this.lastName;
  }
};
console.log("Full Name:", person.fullName());

// ─────────────────────────────────────────────
//  Looping through Object Properties
// ─────────────────────────────────────────────

for (let key in student) {
  console.log(`${key}: ${student[key]}`);
}

// ─────────────────────────────────────────────
//  Object.keys(), values(), entries()
// ─────────────────────────────────────────────

console.log("Keys:", Object.keys(student));
console.log("Values:", Object.values(student));
console.log("Entries:", Object.entries(student));

// ─────────────────────────────────────────────
//  Object Destructuring
// ─────────────────────────────────────────────

const laptop = {
  brand: "HP",
  model: "Pavilion",
  price: 55000
};

const { brand, price } = laptop;
console.log("Brand:", brand);
console.log("Price:", price);

// ─────────────────────────────────────────────
//  Object Cloning (Shallow Copy)
// ─────────────────────────────────────────────

const original = { x: 1, y: 2 };
const clone = { ...original }; // Spread operator

clone.x = 100;
console.log("Original:", original); // x: 1
console.log("Clone:", clone);       // x: 100

// Alternative: Object.assign
const copy = Object.assign({}, original);
console.log("Copy:", copy);

// ─────────────────────────────────────────────
//  Best Practices
// ─────────────────────────────────────────────

/*
- Use dot notation for known property access
- Use bracket notation when dynamic keys
- Use `this` carefully (especially in arrow functions – they do NOT bind `this`)
- Use `Object.keys/values/entries` for iteration & utility
- Prefer `...spread` for cloning
*/