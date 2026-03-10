# Employee Management System (Hibernate + JPA)

A **console-based Java application** that performs **CRUD operations (Create, Read, Update, Delete)** on employee records using **Hibernate ORM and JPA** with a MySQL database.
This project demonstrates how Java applications interact with relational databases using **Object Relational Mapping (ORM)**.

---

## 🚀 Features

* Insert Employee Data
* Update Employee Information
* Fetch All Employees
* Fetch Employee by ID
* Delete Employee Record
* Console-based interactive menu

---

## 🛠 Technologies Used

* Java
* Hibernate ORM
* JPA (Java Persistence API)
* MySQL
* Maven
* Object-Oriented Programming (OOP)

---

## 📁 Project Structure

```
employee-management-hibernate
│
├── src/main/java
│   └── com.hibernate
│       ├── controller
│       │      EmpController.java
│       │
│       ├── dao
│       │      EmpDao.java
│       │
│       └── entity
│             Employee.java
│
├── src/main/resources
│   └── META-INF
│        └── persistence.xml
│
├── pom.xml
└── README.md
```

### Package Explanation

* **controller** → Handles user interaction and menu logic
* **dao** → Performs database CRUD operations
* **entity** → Represents database table as Java class
* **META-INF** → Contains JPA configuration file (`persistence.xml`)

---

## ⚙️ Database Configuration

Database configuration is defined in:

```
src/main/resources/META-INF/persistence.xml
```

Example configuration:

```
jdbc:mysql://localhost:3306/hibernate_db
```

Make sure to update:

* database username
* database password

---

## ▶️ How to Run the Project

### 1️⃣ Create Database

```
CREATE DATABASE hibernate_db;
```

### 2️⃣ Update Database Credentials

Edit `persistence.xml` and configure:

```
username
password
database url
```

### 3️⃣ Build the Project

If using Maven:

```
mvn clean install
```

### 4️⃣ Run the Application

Run:

```
EmpController.java
```

---

## 📌 Example Console Menu

```
1) Insert Data
2) Update Data
3) Fetch All Data
4) Fetch By Id
5) Delete Data
6) Exit
```

---

## 📚 Learning Outcomes

This project demonstrates:

* Hibernate ORM mapping
* JPA EntityManager usage
* CRUD operations using Hibernate
* DAO design pattern
* Database interaction in Java
* Maven project structure

---

⭐ This project is part of my **Java Backend Development learning journey** focusing on **Hibernate and database integration**.
