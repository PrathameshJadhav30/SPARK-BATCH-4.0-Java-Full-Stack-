function greet(city) {
  console.log(this.name + " from " + city);
}

let user = { name: "Ravi" };
greet.call(user, "Mumbai");
greet.apply(user, ["Pune"]);
let boundGreet = greet.bind(user);
boundGreet("Delhi");
