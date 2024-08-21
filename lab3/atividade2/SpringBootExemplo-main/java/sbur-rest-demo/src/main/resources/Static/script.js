const apiUrl = 'http://localhost:8080/books';

document.addEventListener('DOMContentLoaded', () => {
    loadBooks();

    document.getElementById('addBookForm').addEventListener('submit', (event) => {
        event.preventDefault();
        const title = document.getElementById('title').value;
        const author = document.getElementById('author').value;
        addBook({ title, author });
    });

    document.getElementById('updateBookButton').addEventListener('click', () => {
        const id = document.getElementById('updateId').value;
        const title = document.getElementById('updateTitle').value;
        const author = document.getElementById('updateAuthor').value;
        updateBook(id, { title, author });
    });
});

function loadBooks() {
    fetch(apiUrl)
        .then(response => response.json())
        .then(books => {
            const tableBody = document.querySelector('#booksTable tbody');
            tableBody.innerHTML = '';
            books.forEach(book => {
                const row = document.createElement('tr');
                row.dataset.id = book.id;
                row.innerHTML = `
                    <td>${book.title}</td>
                    <td>${book.author}</td>
                    <td>
                        <button class="selectBookButton">Selecionar</button>
                        <button class="deleteBookButton">Excluir</button>
                    </td>
                `;
                tableBody.appendChild(row);
            });

            document.querySelectorAll('.selectBookButton').forEach(button => {
                button.addEventListener('click', (event) => {
                    const row = event.target.closest('tr');
                    const id = row.dataset.id;
                    const title = row.children[0].textContent;
                    const author = row.children[1].textContent;
                    document.getElementById('updateId').value = id;
                    document.getElementById('updateTitle').value = title;
                    document.getElementById('updateAuthor').value = author;
                });
            });

            document.querySelectorAll('.deleteBookButton').forEach(button => {
                button.addEventListener('click', (event) => {
                    const row = event.target.closest('tr');
                    const id = row.dataset.id;
                    deleteBook(id);
                });
            });
        })
        .catch(error => console.error('Erro ao carregar livros:', error));
}

function addBook(book) {
    fetch(apiUrl, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(book)
    })
    .then(response => response.json())
    .then(() => {
        loadBooks();
        document.getElementById('title').value = '';
        document.getElementById('author').value = '';
    })
    .catch(error => console.error('Erro ao adicionar livro:', error));
}

function updateBook(id, book) {
    fetch(`${apiUrl}/${id}`, {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(book)
    })
    .then(response => response.json())
    .then(() => {
        loadBooks();
        document.getElementById('updateId').value = '';
        document.getElementById('updateTitle').value = '';
        document.getElementById('updateAuthor').value = '';
    })
    .catch(error => console.error('Erro ao atualizar livro:', error));
}

function deleteBook(id) {
    fetch(`${apiUrl}/${id}`, {
        method: 'DELETE'
    })
    .then(() => {
        loadBooks();
    })
    .catch(error => console.error('Erro ao excluir livro:', error));
}
