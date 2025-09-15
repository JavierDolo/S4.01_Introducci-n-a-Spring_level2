# 🛠️ S04T01N02 - Spring Boot REST API with Gradle

This project is a basic Spring Boot application using **Gradle** as the build tool. It demonstrates how to expose simple REST API endpoints using Spring Web.

## 📦 Project Metadata

- **Group:** `cat.itacademy.s04.t01.n02`
- **Artifact:** `S04T01N02`
- **Name:** `S04T01N02`
- **Description:** Spring Boot Gradle API example
- **Java Version:** 17+
- **Dependencies:**
    - Spring Web
    - Spring Boot DevTools

## 🚀 Running the Project

Make sure you have Java 11+ and Gradle installed.  
You can run the project via IntelliJ IDEA or terminal.

### Terminal commands (from project root)

```bash
# Clean previous builds
./gradlew clean

# Compile the project
./gradlew build

# Assemble the JAR file
./gradlew assemble

# Run the Spring Boot application
./gradlew bootRun
```

> If you're on Windows, use `gradlew.bat` instead of `./gradlew`.

---

## 🌐 API Endpoints

The server runs on port `9001` (configured in `application.properties`).

### 1. `/HelloWorld`

- **Method:** GET
- **Description:** Returns a greeting message using a query parameter.
- **Parameters:** `name` (optional, defaults to `UNKNOWN`)
- **Example:**

```
GET http://localhost:9001/HelloWorld
GET http://localhost:9001/HelloWorld?name=javier
```

### 2. `/HelloWorld2/{name}`

- **Method:** GET
- **Description:** Returns a greeting message using a path variable.
- **Parameters:** `name` (optional)
- **Example:**

```
GET http://localhost:9001/HelloWorld2
GET http://localhost:9001/HelloWorld2/javier
```

---

## 🗂️ Project Structure

```
src
└── main
    ├── java
    │   └── cat.itacademy.s04.t01.n02
    │       ├── S04T01N02Application.java
    │       └── controller
    │           └── HelloWorldController.java
    └── resources
        └── application.properties
```

---

## 📚 Resources Used

- https://docs.gradle.org/current/userguide/userguide.html
- https://www.youtube.com/watch?v=9SGDpanrc8U
- 
```

---
