# Media Services Microservices System

## Project Overview
This project is a microservices-based system developed as part of the **Running Project** for the **Advanced Software Engineering (ICTS 6302)** course. The system is designed using **Spring Boot** and follows the Microservices Architecture principles.

The application includes multiple independent services, where each service manages its own data and communicates with other services using RESTful APIs.

---

## Microservices Architecture Components

The system consists of the following main components:

* **Discovery Server (Netflix Eureka)**: Used for service registration and discovery, allowing all microservices to find and communicate with each other.
* **API Gateway (Spring Cloud Gateway)**: Acts as a single entry point for all client requests, routing them to the appropriate backend microservices.
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
The application is fully containerized and deployed using **Docker Desktop**.  
By using `docker-compose`, all services are orchestrated to run together in a private virtual network.

   
## Architecture & Technologies:
* **Spring Boot**: For building individual services.
* **Netflix Eureka**: Service Discovery Server.
* **Spring Cloud Gateway**: API Gateway for routing.
* **Docker & Docker Compose**: For containerization and easy deployment.

## Services:
1. **Discovery Server**: Runs on port `8761`.
2. **API Gateway**: Runs on port `8080`.
3. **Product Service**: Manages media products.
4. **Inventory Service**: Manages stock levels.

## How to Run:
1. Ensure **Docker Desktop** is running.
2. Navigate to the project root folder.
3. Run the following command in your terminal:
   ```bash
   docker-compose up --build

## Deployment
The application is deployed using Docker Desktop.  
Each microservice runs in its own Docker container.

---

## Author
**Name:** Doaa Abdeen  
**ID:** 220243072  

**Course:** Advanced Software Engineering (ICTS 6302)

**To:** Dr. Abdelkareem Alashqar

**Semester:** January 2026
