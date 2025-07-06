let car = {
  brand: "Toyota",
  show() {
    console.log(this.brand);
  }
};
car.show();

const arrow = () => console.log(this);
function regular() { console.log(this); }
arrow();
regular();
// In the context of an object method, 'this' refers to the object itself.
// In the context of a regular function, 'this' refers to the global object (or undefined in strict mode).
// In the context of an arrow function, 'this' is lexically bound, meaning it refers to the surrounding context where the arrow function was defined.