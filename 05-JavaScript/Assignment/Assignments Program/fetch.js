fetch("https://jsonplaceholder.typicode.com/posts/1")
  .then(res => res.json())
  .then(data => console.log(data.title))
  .catch(err => console.error("Error:", err));
// This code fetches a post from the JSONPlaceholder API and logs the title of the post to the console. 
// If there's an error during the fetch operation, it logs the error message to the console.
