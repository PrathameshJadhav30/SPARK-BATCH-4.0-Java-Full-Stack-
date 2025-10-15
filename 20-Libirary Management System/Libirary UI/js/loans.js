import { fetchActiveLoans, borrowBook, returnLoan, fetchBooks, fetchMembers } from './api.js';

const loansTable = document.querySelector('#loansTable tbody');
const borrowForm = document.querySelector('#borrowForm');
const bookSelect = document.querySelector('#bookSelect');
const memberSelect = document.querySelector('#memberSelect');

async function loadDropdowns() {
  const books = await fetchBooks();
  const members = await fetchMembers();

  bookSelect.innerHTML = books.map(b => `<option value="${b.id}">${b.title} (${b.availableCopies} left)</option>`).join('');
  memberSelect.innerHTML = members.map(m => `<option value="${m.id}">${m.name}</option>`).join('');
}

async function loadLoans() {
  const loans = await fetchActiveLoans();
  loansTable.innerHTML = '';
  loans.forEach(loan => {
    const row = document.createElement('tr');
    row.innerHTML = `
      <td>${loan.id}</td>
      <td>${loan.book.title}</td>
      <td>${loan.member.name}</td>
      <td>${loan.borrowDate}</td>
      <td>${loan.dueDate}</td>
      <td>${loan.returned ? 'Yes' : 'No'}</td>
      <td>${!loan.returned ? `<button class="return-btn btn btn-success btn-sm" data-id="${loan.id}">Return</button>` : ''}</td>`;
    loansTable.appendChild(row);
  });
}

borrowForm.addEventListener('submit', async (e) => {
  e.preventDefault();
  const bookId = bookSelect.value;
  const memberId = memberSelect.value;
  const days = borrowForm.days.value || 14;

  const result = await borrowBook(bookId, memberId, days);
  if (result.error) {
    alert('Error: ' + result.error);
  } else {
    alert('Book borrowed successfully!');
    loadLoans();
    loadDropdowns();
  }
});

loansTable.addEventListener('click', async (e) => {
  if (e.target.classList.contains('return-btn')) {
    const id = e.target.dataset.id;
    await returnLoan(id);
    alert('Book returned successfully!');
    loadLoans();
    loadDropdowns();
  }
});

document.addEventListener('DOMContentLoaded', () => {
  loadDropdowns();
  loadLoans();
});
