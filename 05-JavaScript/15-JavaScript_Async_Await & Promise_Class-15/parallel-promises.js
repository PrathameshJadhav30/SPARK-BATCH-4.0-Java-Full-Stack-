// Running multiple promises in parallel
function fetch1() {
  return new Promise((resolve) => setTimeout(() => resolve("Data 1"), 1000));
}

function fetch2() {
  return new Promise((resolve) => setTimeout(() => resolve("Data 2"), 1500));
}

async function fetchAll() {
  const [res1, res2] = await Promise.all([fetch1(), fetch2()]);
  console.log(" Results:", res1, res2);
}

fetchAll();
