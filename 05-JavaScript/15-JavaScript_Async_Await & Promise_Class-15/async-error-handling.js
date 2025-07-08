// Handling errors in async/await
function faultyFetch() {
  return new Promise((_, reject) => {
    setTimeout(() => {
      reject(" Something went wrong while fetching!");
    }, 1000);
  });
}

async function loadData() {
  try {
    const result = await faultyFetch();
    console.log(result);
  } catch (error) {
    console.error("Caught Error:", error);
  }
}

loadData();
