#  OrangeHRM Automation Framework

This project automates test scenarios for the [OrangeHRM Demo](https://opensource-demo.orangehrmlive.com/) web application using:

- **Java 21**
- **Selenium WebDriver 4.20.0**
- **TestNG 7.10.2**
- **WebDriverManager 5.9.2**
- **Maven**
- **Page Object Model (POM)** design pattern

---

## 📁 Project Structure

```

src/
├── main/
│   └── java/
│       └── Pages/
│           ├── BasePage.java
│           ├── LoginPage.java
│           ├── DashboardPage.java
│           └── AdminPage.java
├── test/
│   └── java/
│       └── Tests/
│           ├── BaseTest.java
│           └── AdminTest.java

````

---

## ⚙️ Setup Instructions

1. **Clone the project**:

   ```bash
   git clone https://github.com/your-username/OrangeHRM.git
   cd OrangeHRM
````

2. **Import into IntelliJ IDEA or Eclipse** as a Maven project.

3. **Make sure you have Java 21** installed and set up in your IDE.

4. **Maven will automatically download dependencies** from the `pom.xml`.

---

## 🧪 How to Run the Tests

### ✅ From your IDE (IntelliJ / Eclipse)

* Open `AdminTest.java`
* Right-click > Run


## 🛠 Tools Used

| Tool               | Purpose                         |
| ------------------ | ------------------------------- |
| Java 21            | Programming language            |
| Selenium WebDriver | Browser automation              |
| TestNG             | Test framework                  |
| Maven              | Dependency & project management |
| WebDriverManager   | Auto-manages browser drivers    |
| Git + GitHub       | Version control & repo hosting  |

---

## ✔️ Test Scenarios Covered

* ✅ Login with valid Admin credentials
* ✅ Navigate to Admin tab
* ✅ Search users by username
* ✅ Assert: username, role, and status are correct
* ✅ Attempt deleting Admin user and assert it fails

---

## 📎 Notes

* Design pattern used: **Page Object Model (POM)**
* Uses **explicit waits** for stable element interaction
* Well-structured and easy to maintain for future test cases

---



