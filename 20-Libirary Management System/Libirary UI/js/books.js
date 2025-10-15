import { fetchBooks, createBook, deleteBook, updateBook, searchBooks } from './api.js';

const tableBody = document.querySelector('#booksTable tbody');
const form = document.querySelector('#bookForm');
const searchInput = document.querySelector('#searchInput');

async function loadBooks() {
  const books = await fetchBooks();
  renderTable(books);
}

function renderTable(books) {
  tableBody.innerHTML = '';
  books.forEach(book => {
    const row = document.createElement('tr');
    row.innerHTML = `
      <td>${book.id}</td>
      <td>${book.title}</td>
      <td>${book.author}</td>
      <td>${book.isbn}</td>
      <td>${book.totalCopies}</td>
      <td>${book.availableCopies}</td>
      <td>
        <button class="edit-btn btn btn-sm btn-primary" data-id="${book.id}">Edit</button>
        <button class="delete-btn btn btn-sm btn-danger" data-id="${book.id}">Delete</button>
      </td>`;
    tableBody.appendChild(row);
  });
}

form.addEventListener('submit', async (e) => {
  e.preventDefault();
  const book = {
    title: form.title.value.trim(),
    author: form.author.value.trim(),
    isbn: form.isbn.value.trim(),
    totalCopies: parseInt(form.totalCopies.value, 10)
  };
  await createBook(book);
  form.reset();
  loadBooks();
});

tableBody.addEventListener('click', async (e) => {
  if (e.target.classList.contains('delete-btn')) {
    const id = e.target.dataset.id;
    if (confirm('Are you sure you want to delete this book?')) {
      await deleteBook(id);
      loadBooks();
    }
  }
});

searchInput.addEventListener('input', async () => {
  const query = searchInput.value.trim();
  if (query === '') {
    loadBooks();
  } else {
    const results = await searchBooks(query);
    renderTable(results);
  }
});

document.addEventListener('DOMContentLoaded', loadBooks);
