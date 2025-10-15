import { fetchMembers, createMember } from './api.js';

const tableBody = document.querySelector('#membersTable tbody');
const form = document.querySelector('#memberForm');

async function loadMembers() {
  const members = await fetchMembers();
  renderTable(members);
}

function renderTable(members) {
  tableBody.innerHTML = '';
  members.forEach(member => {
    const row = document.createElement('tr');
    row.innerHTML = `
      <td>${member.id}</td>
      <td>${member.name}</td>
      <td>${member.email}</td>
      <td>${member.phone}</td>`;
    tableBody.appendChild(row);
  });
}

form.addEventListener('submit', async (e) => {
  e.preventDefault();
  const member = {
    name: form.name.value.trim(),
    email: form.email.value.trim(),
    phone: form.phone.value.trim()
  };
  await createMember(member);
  form.reset();
  loadMembers();
});

document.addEventListener('DOMContentLoaded', loadMembers);
