# API de Livraria - Spring Boot Demo

## Endpoints

### GET /books
- Retorna a lista de livros disponíveis.
- **Exemplo de Requisição no Postman**:
![image](https://github.com/user-attachments/assets/8f3be953-841d-4091-b595-f75bc7c1862e)


### POST /books
- Cria um novo livro.
- { "id": "4", "title": "Skyhunter", "author": "Marie Lu" }
- **Exemplo de Requisição no Postman**:
![image](https://github.com/user-attachments/assets/a6a9aea3-fef6-4fbf-8bb8-62c88d2b39c9)


### **GET /books/{id}**
 Retorna os detalhes de um livro específico pelo seu ID.
- **Exemplo de Requisição no Postman:**
- ![image](https://github.com/user-attachments/assets/85dca55f-123d-4455-809f-736e381b5ddf)


### **PUT /books/{id}**
- *Atualiza os detalhes de um livro existente.
- **Exemplo de Requisição no Postman:**
  ![image](https://github.com/user-attachments/assets/668a7c3e-3e0b-4677-8f34-0d1eba5ab592)


### **DELETE /books/{id}**
 Remove um livro da livraria pelo seu ID.
- **Exemplo de Requisição no Postman:**
    ![image](https://github.com/user-attachments/assets/cdbd031c-5c1f-46c9-b23c-378f267515fb)

---


