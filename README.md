
### 160923733311 Mohammed Sameer
# Task Manager Spring Boot Project


A brief description of what this project does and who it's for.

Spring Boot Task Manager project with CRUD operations, enums, and REST APIs
# Task Manager Spring Boot Project

## 📌 Requirements
- Java 17 (or compatible version)
- Maven
- Spring Boot

---

## 🚀 How to Run

1️⃣ Clone the Repository
```bash
git clone https://github.com/MohammedFarhan313/160923733310-Mohammed-Farhan
```

2️⃣ Navigate into the Project
```bash
cd <160923733310-Mohammed-Farhan>
```

3️⃣ Run the Application  
Using Maven:
```bash
mvn spring-boot:run
```
Or run `DemoApplication.java` directly in IntelliJ.

The app will start on:
```
http://localhost:8080
```

---

## 🛠️ API Endpoints

➕ Create a Task
```http
POST http://localhost:8080/task/create
Content-Type: application/json

{
  "id": 1,
  "name": "Test Task",
  "status": "TODO"
}
```

📌 Get a Task by ID
```http
GET http://localhost:8080/task/1
```

🔄 Update a Task
```http
PUT http://localhost:8080/task/1
Content-Type: application/json

{
  "id": 1,
  "name": "Updated Task",
  "status": "IN_PROGRESS"
}
```

⏭️ Move Task to Next Stage
```http
PUT http://localhost:8080/task/next/1
```

⏮️ Move Task to Previous Stage
```http
PUT http://localhost:8080/task/previous/1
```

❌ Delete a Task
```http
DELETE http://localhost:8080/task/1
```

---