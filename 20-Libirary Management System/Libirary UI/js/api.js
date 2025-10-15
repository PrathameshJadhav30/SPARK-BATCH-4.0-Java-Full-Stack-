const API_BASE = 'http://localhost:8080/api';

/* BOOKS */
async function fetchBooks() {
  const res = await fetch(`${API_BASE}/books`);
  return res.json();
}

async function createBook(book) {
  const res = await fetch(`${API_BASE}/books`, {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(book)
  });
  return res.json();
}

async function deleteBook(id) {
  await fetch(`${API_BASE}/books/${id}`, { method: 'DELETE' });
}

/* MEMBERS */
async function fetchMembers() {
  const res = await fetch(`${API_BASE}/members`);
  return res.json();
}

async function createMember(member) {
  const res = await fetch(`${API_BASE}/members`, {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(member)
  });
  return res.json();
}

/* LOANS */
async function fetchLoans() {
  const res = await fetch(`${API_BASE}/loans`);
  return res.json();
}

async function borrowBook(bookId, memberId, days = 14) {
  const res = await fetch(`${API_BASE}/loans/borrow?bookId=${bookId}&memberId=${memberId}&days=${days}`, {
    method: 'POST'
  });
  return res.json();
}

async function returnLoan(id) {
  const res = await fetch(`${API_BASE}/loans/return/${id}`, { method: 'POST' });
  return res.json();
}
