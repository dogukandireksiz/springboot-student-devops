Spring Boot Student DevOps Backend

This project is a Spring Boot backend application designed to practice RESTful API development, Layered Architecture, and DevOps practices (Docker, Containerization).

It provides basic CRUD operations for student management and works with a **PostgreSQL** database. The project is ready to run both in a local development environment and as a containerized application using Docker and Docker Compose.

🚀 Technologies

* Language: Java (JDK 17+)
* Framework: Spring Boot
* Database: PostgreSQL
* ORM: Spring Data JPA
* Build Tool: Maven
* DevOps & Containerization: Docker, Docker Compose

📂 Project Architecture

The project follows a clean layered architecture:


src/main/java/com/example/demo
│
├── controller      # REST API Endpoints
├── services        # Business Logic Interfaces
├── services/impl   # Service Implementations
├── repository      # Data Access Layer (JPA)
├── entities        # Database Entities
└── dto             # Data Transfer Objects


⚙️ Installation & Running

You can run the project using two methods: **Via Docker (Recommended)** or **Local Installation**.

Method 1: Run with Docker Compose (Quick & Easy)

If you have Docker and Docker Compose installed, you can spin up the application and database with a single command without manual configuration.

1. Clone the repository:
bash
git clone https://github.com/dogukandireksiz/springboot-student-devops.git
cd springboot-student-devops



2. Start the application and database:
bash
docker-compose up -d --build



(This command prepares and starts both PostgreSQL and the Spring Boot application in containers.)
3. Access the application:
* API Base URL: http://localhost:8080


Method 2: Local Installation

If you prefer to run it directly via your IDE or terminal without Docker:

1. Ensure you have a running **PostgreSQL** instance.
2. Open src/main/resources/application.properties and update it with your database credentials:
properties
spring.datasource.url=jdbc:postgresql://localhost:5432/studentdb
spring.datasource.username=your_username
spring.datasource.password=your_password




3. Run the application:
bash
./mvnw spring-boot:run





🔌 API Usage

Once the application is running, you can test the endpoints using Postman or cURL:

Method,     Endpoint,                       Description
GET         /rest/api/student/get           List all students
GET         /rest/api/student/get/{id}      Get a student by ID
POST        /rest/api/student/save          Add a new student
PUT         /rest/api/student/put/{id}      Update an existing student
DELETE      /rest/api/student/delete/{id}   Delete a student

(Note: Check the `StudentController` class if your base path differs, e.g., `/api/v1/students`.)

🔮 Roadmap & Future Plans

[x] Docker integration (Completed)
[x] PostgreSQL connection via Docker Compose (Completed)
[ ] CI/CD Pipeline integration (GitHub Actions / Jenkins)
[ ] API Documentation with Swagger / OpenAPI
[ ] Unit and Integration testing

👤 Author

Doğukan Direksiz

GitHub: [dogukandireksiz](https://github.com/dogukandireksiz)

This project is part of a DevOps and Backend learning journey. Contributions and feedback are welcome.*





