# 🎓 Student Management System

A full-stack **Spring Boot web application** that performs **CRUD (Create, Read, Update, Delete)** operations on student records using **Spring MVC**, **Thymeleaf**, and **Spring Data JPA** with a MySQL database.

This project follows a clean **MVC architecture** and demonstrates backend fundamentals suitable for **college projects, internships, and resume showcase**.

---

## 🔗 Repository
**GitHub:**  
https://github.com/Rohit-more-05/Student-Management-System

---

## 🚀 Features
- ➕ Add new students  
- 📄 View all enrolled students  
- ✏️ Update student details  
- ❌ Delete student records  
- 🧩 MVC layered architecture  
- 🎨 Responsive UI using Bootstrap  
- 🗄️ Database persistence using JPA  

---

## 🛠️ Tech Stack

### Backend
- Java  
- Spring Boot  
- Spring MVC  
- Spring Data JPA  
- Hibernate  

### Frontend
- Thymeleaf  
- HTML5  
- CSS3  
- Bootstrap 4  

### Database
- MySQL  

### Tools
- Maven  
- Git & GitHub  

---

## 🏗️ Architecture Overview

```
Controller  →  Service  →  Repository  →  Database
     ↓            ↓           ↓
  Thymeleaf     Business     JPA
   Views         Logic
```

---

## 📁 Project Structure

```
StudManager
 ├── src
 │   ├── main
 │   │   ├── java/com/projectum/StudManager
 │   │   │   ├── controller
 │   │   │   ├── service
 │   │   │   ├── repository
 │   │   │   └── entity
 │   │   └── resources
 │   │       ├── templates
 │   │       └── application.properties
 │   └── test
 ├── pom.xml
 ├── mvnw
 └── README.md
```

---

## ⚙️ Prerequisites

Before running this project, make sure you have:
- Java 17 or later
- Maven
- MySQL Server
- Git

---

## 🗄️ Database Setup (IMPORTANT)

⚠️ **The database must be created manually before running the application.**  
Spring Boot will create/update tables automatically, but **it will NOT create the database itself**.

### 1️⃣ Create Database
```sql
CREATE DATABASE resume;
```

---

## ⚙️ Application Configuration

Update `src/main/resources/application.properties`:

```properties
spring.application.name=StudManager
server.port=8080

spring.datasource.url=jdbc:mysql://localhost:3306/resume
spring.datasource.username=root (your user name)
spring.datasource.password= (your password)
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶️ How to Run the Application

### 1️⃣ Clone Repository
```bash
git clone https://github.com/Rohit-more-05/Student-Management-System.git
```

### 2️⃣ Open Project in IDE
- IntelliJ IDEA (Recommended)
- Eclipse
- VS Code

### 3️⃣ Run the Application
```bash
mvn spring-boot:run
```
OR  
Run `StudManagerApplication.java` directly from your IDE.

---

## 🌐 Access the Application

```
http://localhost:8080/enrolled
```

---

## 🖥️ Application Pages
- 🏠 Home Page  
- 📄 Student List Page  
- ➕ Add Student Page  
- ✏️ Edit Student Page  

---

## 🧠 Learning Outcomes
- Spring Boot MVC architecture
- CRUD operations using JPA
- Thymeleaf server-side rendering
- MySQL database integration
- Maven dependency management
- Git & GitHub workflow

---

## 🔮 Future Enhancements
- Pagination and search
- REST API version
- Spring Security (Authentication & Authorization)
- Validation & exception handling
- Docker deployment

---

## 📌 Resume-Ready Description
> Developed a Spring Boot based Student Management System implementing CRUD operations using MVC architecture, Thymeleaf for server-side rendering, and Spring Data JPA with MySQL for persistence.

---

## 👨‍💻 Author
**Rohit More**  
Computer Science Student  
Aspiring Backend Developer (Spring Boot & APIs)

---

## ⭐ Support
If you find this project helpful:
- ⭐ Star the repository  
- 🍴 Fork it  
- 📚 Learn and build upon it  

---
