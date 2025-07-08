// Promise with async operation using setTimeout
function fetchData() {
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve(" Data fetched after 2 seconds");
    }, 2000);
  });
}

fetchData().then((data) => {
  console.log(data);
});
