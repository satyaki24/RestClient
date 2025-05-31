# Spring Boot REST Client

A simple Spring Boot application that demonstrates how to consume a REST API (JSONPlaceholder) using Spring's `RestClient`.

## Features
- Makes HTTP GET requests to [JSONPlaceholder](https://jsonplaceholder.typicode.com)
- Retrieves TODO items by ID
- Demonstrates Spring Boot configuration for REST clients

## Technologies
- Java 21
- Spring Boot 3.5.0
- Spring Web
- Lombok

## Setup

### Prerequisites
- JDK 21+
- Maven 3.6+ or Gradle 7.6+
- Your favorite IDE (IntelliJ, Eclipse, etc.)

### Installation
```bash
git clone https://github.com/your-username/spring-boot-rest-client.git
cd spring-boot-rest-client
mvn clean install
```
### Running the Application
```bash
mvn spring-boot:run
```
Access at: http://localhost:8080

### Project Structure

- src/
- ├── main/
- │   ├── java/
- │   │   └── com/springBootPractice/RestClient/
- │   │       ├── config/TestClient.java
- │   │       ├── controllers/TodoController.java
- │   │       ├── model/Todo.java
- │   │       ├── services/TodoServices.java
- │   │       └── RestClientApplication.java
- └── resources/
 -    └── application.properties

### Dependencies
- Spring Boot Starter Web
- Lombok
- Spring Framework 6.2.7

