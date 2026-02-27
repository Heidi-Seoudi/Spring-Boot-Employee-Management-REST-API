# Spring Boot Employee Management REST API

## 📌 Project Description

A secure and production-ready **Spring Boot REST API** for managing
employees.\
This project demonstrates modern backend development practices using:

-   Spring Boot
-   Spring Data JPA
-   Spring Security (JDBC Authentication)
-   Role-Based Authorization
-   Swagger / OpenAPI Documentation
-   H2 Database
-   RESTful Architecture

This API allows authorized users to perform CRUD operations on employees
with proper role-based access control.

------------------------------------------------------------------------

## 🏗️ Architecture Overview

This project follows a layered architecture:

Controller → Service → Repository → Database

### Layers:

-   **Controller Layer**
    -   Handles HTTP requests and responses.
    -   Validates input.
    -   Exposes REST endpoints.
-   **Service Layer**
    -   Contains business logic.
    -   Converts request objects into entities.
    -   Handles transactional operations.
-   **Repository Layer**
    -   Uses Spring Data JPA.
    -   Provides automatic CRUD operations.
-   **Security Layer**
    -   JDBC-based authentication.
    -   Role-based authorization.
    -   Custom authentication entry point.
    -   Swagger integration with Basic Auth.

------------------------------------------------------------------------

## 🛠️ Technologies Used

-   Java 17+
-   Spring Boot
-   Spring Web
-   Spring Data JPA
-   Spring Security
-   H2 Database
-   Swagger (OpenAPI 3)
-   Maven

------------------------------------------------------------------------

## 📂 Project Structure

    com.luv2code.springboot.employees
    │
    ├── controller
    │   └── EmployeeRestController
    │
    ├── service
    │   ├── EmployeeService
    │   └── EmployeeServiceImpl
    │
    ├── dao
    │   └── EmployeeRepository
    │
    ├── entity
    │   └── Employee
    │
    ├── request
    │   └── EmployeeRequest
    │
    └── security
        ├── SecurityConfig
        └── SwaggerConfig

------------------------------------------------------------------------

## 🔐 Security Configuration

This project uses **JDBC Authentication** with:

### Database Tables

-   `system_users`
-   `roles`

### Role-Based Access Control

  HTTP Method   Endpoint              Required Role
  ------------- --------------------- ---------------
  GET           /api/employees        EMPLOYEE
  GET           /api/employees/{id}   EMPLOYEE
  POST          /api/employees        MANAGER
  PUT           /api/employees/{id}   MANAGER
  DELETE        /api/employees/{id}   ADMIN

### Security Features

-   Basic Authentication
-   Custom AuthenticationEntryPoint (prevents browser pop-up)
-   CSRF Disabled (for REST API)
-   H2 Console Enabled
-   Swagger Public Access

------------------------------------------------------------------------

## 📖 API Endpoints

### 1️⃣ Get All Employees

    GET /api/employees

### 2️⃣ Get Employee By ID

    GET /api/employees/{employeeId}

### 3️⃣ Create Employee

    POST /api/employees

### 4️⃣ Update Employee

    PUT /api/employees/{employeeId}

### 5️⃣ Delete Employee

    DELETE /api/employees/{employeeId}

------------------------------------------------------------------------

## 📘 Swagger Documentation

After running the application:

Swagger UI:

    http://localhost:8080/swagger-ui.html

OpenAPI Docs:

    http://localhost:8080/v3/api-docs

------------------------------------------------------------------------

## 🗄️ H2 Database Console

Access the in-memory database:

    http://localhost:8080/h2-console

------------------------------------------------------------------------

## ▶️ How to Run the Project

### 1️⃣ Clone the repository

    git clone https://github.com/your-username/springboot-employee-management-api.git

### 2️⃣ Navigate into project

    cd springboot-employee-management-api

### 3️⃣ Run the application

Using Maven:

    mvn spring-boot:run

Or run the main Spring Boot application class from your IDE.

------------------------------------------------------------------------

## 🧪 Testing the API

You can test using:

-   Swagger UI
-   Postman
-   cURL
-   IntelliJ HTTP Client

------------------------------------------------------------------------

## 📈 Future Improvements

-   Add DTO mapping with MapStruct
-   Implement Global Exception Handling
-   Add Pagination & Sorting
-   Add Unit and Integration Tests
-   Replace H2 with MySQL or PostgreSQL
-   Add JWT Authentication

------------------------------------------------------------------------

## ⭐ Summary

This project demonstrates:

✔ Clean Architecture\
✔ RESTful Design\
✔ Role-Based Authorization\
✔ JDBC Security\
✔ Swagger Documentation\
✔ Production-Ready Structure

Perfect for showcasing Spring Boot skills in a professional portfolio.
