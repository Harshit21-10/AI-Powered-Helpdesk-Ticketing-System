# 🤖 AI-Powered Helpdesk Ticketing System

An intelligent full-stack helpdesk platform that automates customer support workflows using **Spring AI**, **Google Gemini**, and **tool calling**. The system enables users to raise support tickets, interact with an AI assistant, and automatically notify support teams via email.

---

## 🚀 Live Demo

🔗 **Frontend:** Coming Soon
🔗 **Backend API:** Coming Soon

> Deploying soon using Docker and cloud hosting.



# ✨ Features

### 🎫 Intelligent Ticket Management

* Create and manage support tickets
* Auto-generate ticket summaries
* Store and retrieve tickets from PostgreSQL
* AI-assisted ticket creation

### 🤖 AI-Powered Support Assistant

* Conversational chatbot using Google Gemini
* Context-aware responses with chat memory
* Tool calling for real-world actions
* Streaming responses support

### 📧 Automated Email Notifications

* AI-triggered support emails
* Automatic ticket escalation
* Structured ticket summaries

### 🐳 Dockerized Deployment

* Containerized backend and frontend
* Docker Compose orchestration
* Production-ready deployment setup

### 💻 Modern Full-Stack Architecture

* Spring Boot REST APIs
* React frontend
* PostgreSQL database
* Clean modular architecture

---

# 🏗️ System Architecture

```text
                ┌──────────────────┐
                │   React Frontend │
                └────────┬─────────┘
                         │ REST API
                         ▼
                ┌──────────────────┐
                │ Spring Boot API  │
                └────────┬─────────┘
                         │
        ┌────────────────┴────────────────┐
        │                                 │
        ▼                                 ▼
┌──────────────────┐          ┌──────────────────┐
│    Gemini AI     │          │   PostgreSQL DB  │
│  (Spring AI)     │          │  Ticket Storage  │
└──────────────────┘          └──────────────────┘
        │
        ▼
┌──────────────────┐
│  Email Tool API  │
└──────────────────┘
```

---

# 🛠️ Tech Stack

## Backend

* Java 22
* Spring Boot 3
* Spring AI
* Spring Data JPA
* Hibernate
* Maven
* JavaMailSender

## Frontend

* ReactJS
* JavaScript
* Axios
* Tailwind CSS
* ShadCN UI

## Database

* PostgreSQL

## AI & LLM

* Google Gemini API
* Spring AI Tool Calling
* Chat Memory

## DevOps

* Docker
* Docker Compose
* Nginx
* Git & GitHub

---

# 📂 Project Structure

```text
AI-Powered-Helpdesk-Ticketing-System
│
├── helpdesk-backend
│   ├── src
│   ├── Dockerfile
│   └── pom.xml
│
├── helpdesk-frontend
│   ├── src
│   ├── Dockerfile
│   └── nginx.conf
│
├── docker-compose.yml
├── .env
└── README.md
```

---

# ⚙️ Environment Variables

Create a `.env` file in the project root:

```env
DB_NAME=helpdesk_db
DB_USERNAME=postgres
DB_PASSWORD=your_password

GEMINI_API_KEY=your_gemini_api_key

E_USERNAME=your_email@gmail.com
E_PASS=your_app_password
```

---

# 🚀 Running with Docker

### Clone Repository

```bash
git clone https://github.com/your-username/AI-Powered-Helpdesk-Ticketing-System.git
cd AI-Powered-Helpdesk-Ticketing-System
```

### Start Containers

```bash
docker compose up --build
```

### Services

| Service    | Port |
| ---------- | ---- |
| Frontend   | 3000 |
| Backend    | 8080 |
| PostgreSQL | 5432 |

### Access Application

Frontend:

```text
http://localhost:3000
```

Backend:

```text
http://localhost:8080
```

---

# ▶️ Running Without Docker

## Backend

```bash
cd helpdesk-backend
./mvnw spring-boot:run
```

## Frontend

```bash
cd helpdesk-frontend
npm install
npm run dev
```

---

# 🔌 API Endpoints

## AI Chat Response

```http
POST /api/ai/helpdesk
```

Headers:

```http
conversationId: <uuid>
```

Body:

```text
How can I reset my password?
```

---

## Streaming Response

```http
POST /api/ai/stream
```

Headers:

```http
conversationId: <uuid>
```

---

# 🧠 AI Workflow

1. User submits a support query.
2. AI processes the request.
3. Chat memory provides context.
4. AI generates a response.
5. AI may invoke tools:

   * Create ticket
   * Send support email
6. Ticket information is stored in PostgreSQL.

---

# 🎯 Resume Highlights

* Built an AI-powered enterprise helpdesk system using Spring AI and Google Gemini.
* Designed a full-stack architecture using React, Spring Boot, and PostgreSQL.
* Implemented AI tool calling and automated email workflows.
* Dockerized the complete application using Docker Compose.
* Applied production concepts including environment variables, CORS handling, and container networking.

---

# 🚀 Future Enhancements

* JWT Authentication
* Role-Based Access Control
* Admin Dashboard
* Kafka Event Processing
* Redis Caching
* Vector Database for RAG
* CI/CD with GitHub Actions
* AWS/GCP Deployment

---

# 🤝 Contributing

1. Fork the repository.
2. Create a feature branch.

```bash
git checkout -b feature-name
```

3. Commit changes.

```bash
git commit -m "Add new feature"
```

4. Push changes.

```bash
git push origin feature-name
```

5. Open a Pull Request.

---

# 📜 License

This project is licensed under the MIT License.

---

# 👨‍💻 Author

**Harshit Raj**

* GitHub: https://github.com/Harshit21-10
* LinkedIn: https://linkedin.com/in/harshit-raj-492869258

---

⭐ If you found this project useful, consider giving it a star!
