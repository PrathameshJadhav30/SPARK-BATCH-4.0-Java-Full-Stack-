fetch("https://jsonplaceholder.typicode.com/users")
  .then(response => response.json())
  .then(data => console.log(data));
// This code fetches user data from a public API and logs it to the console.