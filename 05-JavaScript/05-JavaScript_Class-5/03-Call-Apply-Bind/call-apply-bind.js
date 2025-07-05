const person = { name: "Prathamesh" };

function greet(greeting) {
  console.log(greeting + ", " + this.name);
}

greet.call(person, "Hi");
greet.apply(person, ["Hello"]);

const bound = greet.bind(person, "Namaste");
bound();
// The `call` method calls the function with a specified `this` value and arguments.
// The `apply` method is similar, but takes an array of arguments.
// The `bind` method returns a new function with a bound `this` value.  