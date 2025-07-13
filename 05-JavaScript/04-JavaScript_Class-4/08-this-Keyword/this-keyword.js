const obj = {
  num: 5,
  show: function() {
    console.log(this.num);
  }
};
obj.show();
// In this example, `this` refers to the `obj` object, and `this.num` accesses the `num` property of that object.