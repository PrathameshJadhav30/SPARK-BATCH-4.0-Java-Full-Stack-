// Simulating data fetch using async/await
function getUser() {
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve({ id: 1, name: "Prathamesh" });
    }, 1000);
  });
}

async function displayUser() {
  console.log("Fetching user...");
  const user = await getUser();
  console.log(" User fetched:", user);
}

displayUser();
