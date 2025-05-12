# Xeno Backend

## Overview
This repository contains the backend code for the Xeno project, built using Spring Boot. It includes essential components such as controllers, models, repositories, services, configuration files, and dependencies managed via Maven. The backend is designed to interact with a MySQL database and can be tested using Postman.

## Project Structure
The backend is organized into the following main directories:
- **src/main/java/com/pranjali/xeno/**: Contains all the Java source code.
  - **controller**: REST API controllers.
  - **model**: Data models and entities.
  - **repository**: Data access repositories.
  - **service**: Business logic services.
  - **config**: Configuration classes for Spring components.
- **src/main/resources**: Contains configuration files.
  - **application.properties**: Spring Boot application properties.
- **pom.xml**: Maven project configuration file.

## Dependencies
The project uses the following key dependencies:
- **Spring Web**: For building RESTful APIs.
- **Spring Data JPA**: For database access.
- **Spring Security**: For authentication and authorization.
- **MySQL Driver**: For connecting to MySQL databases.
- **Spring Boot DevTools**: For enhanced development experience.

## Getting Started
### Prerequisites
- Java Development Kit (JDK) 11 or higher.
- Maven 3.6 or higher.
- MySQL database server.
- Postman for API testing.
- MySQL Workbench for database management.

### Installation
1. Clone the repository:

   git clone https://github.com/Pranjali784/xeno-backend.git

2.Navigate to the project directory:

  cd xeno-backend

3.Build the project using Maven

  mvn clean install

Database Setup

Open MySQL Workbench and create a new database.

Update the application.properties file with your database credentials:

  spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
  spring.datasource.username=your_database_username
  spring.datasource.password=your_database_password

Running the Application

Start the application using Maven:

  mvn spring-boot:run

The application will be available at 

  http://localhost:8080

API Testing with Postman

Open Postman and create a new collection for your API tests.
Import the API endpoints from the src/main/resources/api-docs.json file (if available).
Test the endpoints by sending HTTP requests to http://localhost:8080.

Example Endpoints:

GET /api/items: Retrieve a list of items.
POST /api/items: Create a new item.
GET /api/items/{id}: Retrieve an item by ID.
PUT /api/items/{id}: Update an item by ID.
DELETE /api/items/{id}: Delete an item by ID.
