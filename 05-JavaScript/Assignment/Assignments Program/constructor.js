function Student(name, roll, course) {
  this.name = name;
  this.roll = roll;
  this.course = course;
}

let s1 = new Student("Ram", 101, "AI");
let s2 = new Student("Shyam", 102, "DS");
console.log(s1, s2);
