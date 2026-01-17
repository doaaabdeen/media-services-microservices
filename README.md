# Media Services Microservices System

## Project Overview
This project is a microservices-based system developed as part of the **Running Project** for the **Advanced Software Engineering (ICTS 6302)** course. The system is designed using **Spring Boot** and follows the Microservices Architecture principles.

The application includes multiple independent services, where each service manages its own data and communicates with other services using RESTful APIs.

---

## Microservices Architecture Components

The system consists of the following main components:

* **Discovery Server (Netflix Eureka)**: Used for service registration and discovery, allowing all microservices to find and communicate with each other (Port: 8761)..
* **API Gateway (Spring Cloud Gateway)**: Acts as a single entry point for all client requests, routing them to the appropriate backend microservices (Port: 8080).
* **Product Service**: Responsible for managing media product information, categories, and details.
* **Inventory Service**: Manages the stock levels and availability of media products in the system.

## Technologies Used

- **Java**: Amazon Corretto 17/21
- **Spring Cloud**: Eureka & Gateway
- **Communication**: RESTful APIs
- **Containerization**: Docker & Docker Desktop
- **Orchestration**: Docker Compose
- **Version Control**: Git & GitHub

## Deployment
The system is fully containerized to ensure environment consistency:

**Dockerfile:** Created for each microservice to package the application with its dependencies.

**Docker Compose:** Used to orchestrate the entire ecosystem. With a single command, the Discovery Server, Gateway, and business services start in a dedicated virtual network.
   
## Architecture & Technologies:
* **Spring Boot**: For building individual services.
* **Netflix Eureka**: Service Discovery Server.
* **Spring Cloud Gateway**: API Gateway for routing.
* **Docker & Docker Compose**: For containerization and easy deployment.

## How to Run:
1. Ensure **Docker Desktop** is running.
2. Navigate to the project root folder.
3. Run the following command in your terminal:
   ```bash
   docker-compose up --build

## Conclusion: 
The project demonstrates a complete microservices lifecycle from development to containerized deployment.



---

## Author
**Name:** Doaa Abdeen  
**ID:** 220243072  

**Course:** Advanced Software Engineering (ICTS 6302)

**To:** Dr. Abdelkareem Alashqar

**Semester:** January 2026
