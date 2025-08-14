# Devxhub Spring Boot Intern Assignment

## Description
This is a Spring Boot 3.x application that demonstrates basic authentication and role-based access control using PostgreSQL as the database.  
It includes:
- **User authentication** from a database (no in-memory users).
- **Role-based authorization** using an enum (USER, ADMIN).
- **Default Spring Security login and logout pages with username and password from database**.
- **Secured REST endpoints** with access restrictions based on roles.

## Features
- **Public Endpoint** → Accessible by anyone without login.
- **User Endpoint** → Accessible by authenticated users (`USER` & `ADMIN`).
- **Admin Endpoint** → Accessible only by `ADMIN` users.
- **Create User Endpoint** → Allows `ADMIN` to add new users with encrypted passwords.
- **Database Integration** → PostgreSQL with JPA & Hibernate.

## Tech Stack
- Java 24
- Spring Boot 3.5.4
- Spring Security
- Spring Data JPA
- PostgreSQL
- Maven

## Setup
1. Create PostgreSQL DB:
   ```bash
   CREATE DATABASE intern_db;
3. Create Table:
   ```bash
   CREATE TABLE users(id SERIAL PRIMARY KEY, username VARCHAR(50) UNIQUE NOT NULL, password VARCHAR(250) NOT NULL, role VARCHAR(20) DEFAULT 'USER' NOT NULL CHECK(role IN ('USER','ADMIN')));
5. Create predefined user: `INSERT command are in the data.sql file`
7. Update `application.properties` with your DB credentials:
8. Open the project in IDE (Intellij IDEA).
9. Run the application.

## Endpoints
- **GET /public** → No auth
- **GET /user** → USER & ADMIN
- **GET /admin** → ADMIN only
- **POST /users** → ADMIN only

## Predefined Users

- User: `intern` / Password: `password123` / Role: USER
- User: `admin` / Password: `admin123` / Role: ADMIN

