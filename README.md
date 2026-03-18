# Biblioteca CRUD

[![Java](https://img.shields.io/badge/Java-25.0.2-blue)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0.3-green)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-8.0.45-orange)](https://www.mysql.com/)

## Descrição

O **Biblioteca CRUD** é uma aplicação backend desenvolvida em **Spring Boot** que gerencia uma biblioteca de livros, usuários e carteiras digitais.  
O projeto permite criar, ler, atualizar e deletar registros de usuários, livros e suas carteiras associadas, utilizando **Spring Data JPA** e **MySQL**.

---

## Funcionalidades

- Gerenciar usuários da biblioteca (CRUD completo)
- Gerenciar carteiras de usuários (CRUD completo)
- Relacionamento **One-to-One** entre usuários e carteiras
- Persistência de dados com **MySQL**
- APIs RESTful para integração com frontend ou outros sistemas

---

## Tecnologias Utilizadas

- Java 25
- Spring Boot 4.0.3
- Spring Data JPA
- Hibernate ORM
- MySQL 8
- Maven
- Tomcat embutido

---

## Requisitos

- Java 25 ou superior
- MySQL 8 ou superior
- Maven
- IDE recomendada: IntelliJ IDEA, Eclipse ou VS Code

---

## Instalação

1. Clone o repositório:

```bash
git clone https://github.com/GabrielLFM/biblioteca-crud.git
cd biblioteca-crud
```
2. Configure o banco de dados MySQL:

    CREATE DATABASE biblioteca;

3. Configure as credenciais no application.properties:

    spring.datasource.url=jdbc:mysql://localhost:3306/biblioteca
    spring.datasource.username=SEU_USUARIO
    spring.datasource.password=SUA_SENHA
    spring.jpa.hibernate.ddl-auto=update

4. Compile e rode o projeto com Maven:

    mvn clean install
    mvn spring-boot:run

O backend estará disponível em: http://localhost:8080/    


## Endpoints Principais

### Usuários

| Método | URL | Descrição |
|--------|-----|-----------|
| GET    | /usuario            | Lista todos os usuários |
| GET    | /usuario/{id}       | Busca usuário por ID |
| POST   | /usuario            | Cria um novo usuário |
| PUT    | /usuario/{id}       | Atualiza um usuário existente |
| DELETE | /usuario/{id}       | Deleta um usuário |

---

### Carteira

| Método | URL | Descrição |
|--------|-----|-----------|
| POST   | /carteira/{idUsuario} | Cria carteira para um usuário |
| GET    | /carteira/{id}        | Busca carteira por ID |
| PUT    | /carteira/{id}        | Atualiza carteira existente |
| DELETE | /carteira/{id}        | Deleta carteira |

---

> **Nota:** `{idUsuario}` é o ID do usuário ao qual a carteira será associada.

## Estrutura do Projeto

```
biblioteca-crud
    ├── src/main/java/com/senai/biblioteca
    │   ├── controller
    │   ├── dto
    │   ├── entity
    │   ├── repository
    │   └── service
    ├── src/main/resources
    │   └── application.properties
    ├── pom.xml
    └── README.md
    
```

## Observações

- O relacionamento entre **Usuário** e **Carteira** é **One-to-One**, sendo necessário corrigir o atributo `mappedBy` para que o Hibernate funcione corretamente.  
- Este projeto é focado no **backend**, podendo ser integrado a qualquer frontend ou aplicação mobile que consuma APIs REST.  

---

## Contribuição

Contribuições são bem-vindas! Para contribuir:

1. Faça um fork deste repositório  

2. Crie uma branch:  
   ```bash
   git checkout -b feature/nova-funcionalidade
   ```
3. Faça suas alterações

4. Commit:
```bash
git commit -m "Adiciona nova funcionalidade"
```

5. Push:
```bash
git push origin feature/nova-funcionalidade
```

6. Abra um Pull Request

## Autor

**Gabriel LFM**  
GitHub: [https://github.com/GabrielLFM](https://github.com/GabrielLFM)
