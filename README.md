# 🚀 Advanced Java Assignments

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?size=25&duration=3000&color=00FFCC&center=true&vCenter=true&width=600&lines=Advanced+Java+Lab+Assignments;Servlets+%7C+JDBC+%7C+Swing+%7C+Collections;Built+with+Java+%F0%9F%94%A5" />
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/IDE-Eclipse-blue?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Server-Tomcat%209-green?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Database-MySQL-blue?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge"/>
</p>

---

## 📊 GitHub Stats

<p align="center">
  <img src="https://github-readme-stats.vercel.app/api?username=GaneshPrasad&show_icons=true&theme=tokyonight" height="150"/>
</p>


---

## 🎬 Project Preview

<p align="center">
  <img src="https://media.giphy.com/media/ZVik7pBtu9dNS/giphy.gif" width="400"/>
  <img src="https://media.giphy.com/media/f3iwJFOVOwuy7K6FFw/giphy.gif" width="400"/>
</p>

---

## 📌 Overview

This repository contains a complete set of **Advanced Java assignments** covering:

* Strings
* Collections Framework
* Swing GUI
* Servlets (Web Development)
* JDBC (Database Connectivity)

All assignments include code, outputs, and explanations.

---

## 🧑‍💻 Student Details

* **Name:** Ganesh Prasad
* **USN:** 4MW23CS040
* **Section:** A

---

## 📂 Project Structure

```bash
Advanced-Java-Assignments/
│
├── Assignment1-Strings/
├── Assignment2-Collections/
├── Assignment3-Swing/
├── Assignment4-Servlet/
├── Assignment5-JDBC/
│
└── Report.pdf
```

---

# 📘 Assignment 1: Strings

🎯 **Aim:** Perform String operations and StringBuffer usage

💡 **Concepts Covered:**

* String immutability
* Substring & comparison
* StringBuffer (mutable operations)

```java
String str1 = "Hello";
String str2 = new String("Hello");

System.out.println(str1.equals(str2));
System.out.println(str1.length());
System.out.println(str1.substring(0, 3));
System.out.println(str1.toUpperCase());

StringBuffer sb = new StringBuffer("Java");
sb.append(" Programming");
System.out.println(sb);
```

---

# 📘 Assignment 2: Collections

🎯 **Aim:** Store and sort objects using ArrayList

💡 **Concepts Covered:**

* Collections Framework
* Comparator sorting

```java
Collections.sort(list, new NameComparator());
```

---

# 📘 Assignment 3: Swing GUI

🎯 **Aim:** Build a GUI application

💡 **Concepts Covered:**

* Event handling
* User input via components

```java
button.addActionListener(e -> {
    String name = textField.getText();
    result.setText("Hello " + name);
});
```

---

# 📘 Assignment 4: Servlet

🎯 **Aim:** Develop and deploy a servlet

💡 **Concepts Covered:**

* HTTP request handling
* Web deployment on Tomcat

```java
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.getWriter().println("Welcome to Advanced Java Lab");
    }
}
```

🌐 **URL:**
http://localhost:8080/Assignment4/hello

---

# 📘 Assignment 5: JDBC

🎯 **Aim:** Connect Java with MySQL

💡 **Concepts Covered:**

* JDBC API
* SQL query execution

```java
Connection con = DriverManager.getConnection(url, user, password);
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM student");

while(rs.next()){
    System.out.println(rs.getString("usn"));
}
```

---

## 🛠️ Tech Stack

<p align="center">
  <img src="https://skillicons.dev/icons?i=java,mysql" />
</p>

---



---

## 🎯 Learning Outcomes

✔ Java Core Mastery
✔ GUI Development
✔ Web Applications
✔ Database Connectivity
✔ OOP Concepts

---

## 🏁 Conclusion

All assignments were successfully implemented and tested.
This repository demonstrates strong understanding of **Advanced Java concepts**.

---

## ⭐ Support

If you like this project:

👉 Star the repo
👉 Fork it
👉 Share it

---
