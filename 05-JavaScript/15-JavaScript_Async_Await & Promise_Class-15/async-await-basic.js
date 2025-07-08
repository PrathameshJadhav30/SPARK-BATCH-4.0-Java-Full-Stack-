
function delay(ms) {
  return new Promise((resolve) => setTimeout(resolve, ms));
}

async function run() {
  console.log(" Waiting...");
  await delay(2000);
  console.log(" Finished after 2 seconds");
}

run();
