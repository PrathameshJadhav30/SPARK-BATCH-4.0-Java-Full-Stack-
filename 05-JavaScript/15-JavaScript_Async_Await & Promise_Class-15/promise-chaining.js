// Chaining multiple .then() calls
new Promise((resolve) => {
  setTimeout(() => {
    resolve("Step 1");
  }, 1000);
})
  .then((result) => {
    console.log(result);
    return "Step 2";
  })
  .then((result) => {
    console.log(result);
    return "Step 3";
  })
  .then((result) => {
    console.log(result);
  });
