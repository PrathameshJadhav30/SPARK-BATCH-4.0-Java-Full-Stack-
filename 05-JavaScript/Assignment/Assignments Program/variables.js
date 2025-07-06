var x = 10;
let y = 20;
const z = 30;

//Scope demonstration
function scopeDemo() {
    var a = 40; // function-scoped
    let b = 50; // block-scoped
    const c = 60; // block-scoped

    console.log("Inside function scope:");
    console.log("var a:", a);
    console.log("let b:", b);
    console.log("const c:", c);
}

scopeDemo();
console.log("Outside function scope:");
console.log("var x:", x); // accessible 
console.log("let y:", y); // accessible
console.log("const z:", z); // accessible