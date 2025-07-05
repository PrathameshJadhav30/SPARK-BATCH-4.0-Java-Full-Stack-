let user = {
  name: "Prathamesh",
  age: 22,
  greet: function() {
    console.log("Hello " + this.name);
  }
};
user.greet();
