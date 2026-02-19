# 🤖 AI-Powered Helpdesk Ticketing System

An intelligent **full-stack helpdesk platform** that automates customer support workflows using **AI, LLM tools, and semantic search**.
The system allows users to raise support tickets, interact with an AI assistant, and automatically notify the support team via email.

---

## 📌 Overview

The **AI-Powered Helpdesk Ticketing System** combines traditional ticket management with modern AI capabilities.
Instead of manually handling every request, an AI assistant can:

* Understand user issues conversationally
* Search internal documentation using vector embeddings
* Generate summaries and responses
* Automatically create and escalate support tickets
* Notify support teams via email

This project demonstrates **real-world AI integration** with a production-style full-stack architecture.

---

## 🚀 Key Features

### 🎫 Ticket Management

* Create and manage helpdesk tickets
* Track ticket summaries and user details
* Automated ticket creation via AI tools

### 🤖 AI Assistant (Spring AI + LLM)

* Conversational chatbot for support queries
* Context-aware responses using chat memory
* Tool calling for real-world actions


### 📧 Automated Support Email Tool

* AI triggers email notifications to support teams
* Structured ticket summaries sent automatically


### 💻 Modern Full Stack Architecture

* Secure backend APIs
* Responsive React frontend
* Clean modular service design

---

## 🏗️ Tech Stack

### Backend

* **Java 22**
* **Spring Boot**
* **Spring AI**
* **Spring Data JPA**
* **PostgreSQL**
* **JavaMailSender (Email Service)**

### AI & LLM

* **Gemini AI**
* Tool Calling via `@Tool`
* Chat Memory Advisors
* Streaming responses

### Frontend

* **ReactJS**
* Modern UI with animations
* REST API integration

### Database

* PostgreSQL

---

## 🧩 System Architecture

```
User (React UI)
        │
        ▼
Spring Boot Backend (REST APIs)
        │
        ├── Spring AI Chat Client
        │       ├── LLM (Gemini)
        │       ├── Tools (Email Sender)
        │       └── Chat Memory
        │
        └── PostgreSQL Database
```

---

## ⚙️ Setup Instructions

### 1️⃣ Clone Repository

```bash
git clone https://github.com/your-username/ai-helpdesk-ticketing-system.git
cd ai-helpdesk-ticketing-system
```

---



### 4️⃣ Backend Configuration

Update `application.properties`:

```properties
# PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/helpdesk_db
spring.datasource.username=postgres
spring.datasource.password=postgres

# Gemini
spring.ai.google.genai.api-key=${GEMINI_API_KEY}
spring.ai.google.genai.chat.options.model=gemini-3-flash-preview

# Email (App Password required)
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your-email@gmail.com
spring.mail.password=${MAIL_APP_PASSWORD}
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

---

### 5️⃣ Run Backend

```bash
./mvnw spring-boot:run
```

Backend starts at:

```
http://localhost:8080
```

---

### 6️⃣ Run Frontend

```bash
cd frontend
npm install
npm start
```

Frontend runs at:

```
http://localhost:3000
```

---

## 🧠 AI Workflow

1. User asks a support question
2. AI checks conversation context
3. Generates grounded response
4. If needed → invokes **Support Email Tool**
5. Ticket email is sent automatically

---

## 🛠️ Example Tool (AI Action)

The AI can execute real backend logic:

```java
@Tool(description = "Send email to support team for new ticket")
public String sendEmailToSupportTeam(String email, String message)
```

The LLM decides **when** to call this tool based on user intent.

---



## 🔐 Environment Variables (Recommended)

```bash
MAIL_APP_PASSWORD=your_app_password
```

---

## ✅ Future Enhancements

* JWT Authentication & Role-based access
* Ticket status workflow (Open → In Progress → Resolved)
* Admin dashboard analytics
* Multi-agent AI workflows
* Async email queue (Kafka/RabbitMQ)
* Cloud deployment (AWS/GCP)

---

## 🎯 Learning Outcomes

This project demonstrates:

* Real-world **LLM integration with Java**
* Tool calling using Spring AI
* AI + traditional backend integration
* Production-ready system design

---

## 🤝 Contributing

Contributions are welcome!

1. Fork the repository
2. Create a feature branch
3. Commit changes
4. Open a Pull Request

---

## 📜 License

This project is licensed under the MIT License.

---

## 👨‍💻 Author

Built as a full-stack AI engineering project to explore practical applications of LLMs in enterprise systems.

---

⭐ If you found this project useful, consider giving it a star!
