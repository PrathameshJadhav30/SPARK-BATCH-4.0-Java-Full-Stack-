// ─────────────────────────────────────────────
//  if, else if, else
// ─────────────────────────────────────────────

let marks = 85;

if (marks >= 90) {
    console.log("Grade: A");
} else if (marks >= 75) {
    console.log("Grade: B");
} else if (marks >= 60) {
    console.log("Grade: C");
} else {
    console.log("Grade: Fail");
}

// ─────────────────────────────────────────────
// switch statement
// ─────────────────────────────────────────────

let day = 3;
switch (day) {
    case 1:
        console.log("Monday");
        break;
    case 2:
        console.log("Tuesday");
        break;
    case 3:
        console.log("Wednesday");
        break;
    case 4:
        console.log("Thursday");
        break;
    case 5:
        console.log("Friday");
        break;
    default:
        console.log("Weekend");
        break;
}

// ─────────────────────────────────────────────
//  break and continue
// ─────────────────────────────────────────────

console.log("Break example:");
for (let i = 1; i <= 5; i++) {
    if (i === 3) break; // exits loop at 3
    console.log(i);     // 1, 2
}

console.log("Continue example:");
for (let i = 1; i <= 5; i++) {
    if (i === 3) continue; // skips 3
    console.log(i);        // 1, 2, 4, 5
}

// ─────────────────────────────────────────────
//  return statement (used inside functions)
// ─────────────────────────────────────────────

function isEven(num) {
    if (num % 2 === 0) {
        return true; // exits function immediately
    }
    return false;
}
console.log("isEven(4):", isEven(4)); // true
console.log("isEven(5):", isEven(5)); // false

// ─────────────────────────────────────────────
//  try-catch-finally (error handling)
// ─────────────────────────────────────────────

try {
    let result = 10 / 2;
    console.log("Result:", result);

    // Uncomment to test error
    // throw new Error("Something went wrong!");
} catch (error) {
    console.error("Caught Error:", error.message);
} finally {
    console.log("This block always runs (finally).");
}

// ─────────────────────────────────────────────
//  Nested Control Flow
// ─────────────────────────────────────────────

let loggedIn = true;
let isAdmin = false;

if (loggedIn) {
    if (isAdmin) {
        console.log("Welcome, Admin!");
    } else {
        console.log("Welcome, User!");
    }
} else {
    console.log("Please log in.");
}

// ─────────────────────────────────────────────
// 7Best Practices
// ─────────────────────────────────────────────

/*
 Use `if-else` for range-based conditions
 Use `switch` for fixed value matching
 Always add `break` in `switch` unless fall-through is intended
 Use `return` in functions to exit early
 Always handle errors using try-catch when using APIs or dynamic input
 Avoid deeply nested if-else; prefer early returns
*/
// ─────────────────────────────────────────────