# CIT300 Data Structure & Graph Performance Analyzer

## 1. Project Title

**Data Structure & Graph Performance Analyzer**

---

## 2. Project Description

This project is a Java-based console application developed for the CIT300 Data Structures and Algorithms module.

The main purpose of this system is to demonstrate the practical use of different data structures, searching algorithms, graph algorithms, and algorithmic complexity.

The application provides a menu-based system where users can perform operations on:

* Array
* Stack
* Queue
* Linked List
* Searching Algorithms
* Graph
* BFS Traversal
* DFS Traversal
* Performance and Complexity

The system also provides input validation and handles invalid operations such as attempting to remove an item from an empty stack or queue.

---

## 3. Group Members

| No. | Student Name  | Student ID  | Responsibility                         |
| --- | ------------- | ----------- | -------------------------------------- |
| 1   | W A Duneesha Nethmi    | 22UG3-0580     | Array and Searching                    |
| 2   | W.M.N.H.ABERATHNA | 22UG3-0685 | Stack and Queue                        |
| 3   | W.M.H.S.ABERATHNA  | 22UG3-0719 | Linked List                            |
| 4   | N.P.S.I.PIYATHILAKA | 22UG3-0244 | Graph, BFS and DFS                     |
| 5   | S.S.SOMATHILAKA | 22UG3-0683 | Main Menu, Integration and Performance |

---

## 4. Individual Contributions

### Member 1 - Array and Searching

**Contribution:**

* Implemented the `ArrayManager` class.
* Implemented array insertion.
* Implemented array deletion.
* Implemented array searching.
* Implemented array display.
* Implemented the `SearchManager` class.
* Implemented Linear Search.
* Implemented Binary Search.
* Implemented sorting functionality.
* Tested array and searching operations.
* Integrated the searching component with the main system.

---

### Member 2 - Stack and Queue

**Contribution:**

* Implemented the `StackManager` class.
* Implemented Push operation.
* Implemented Pop operation.
* Implemented Peek operation.
* Implemented Stack Display.
* Implemented empty stack handling.
* Implemented the `QueueManager` class.
* Implemented Enqueue operation.
* Implemented Dequeue operation.
* Implemented Queue Peek operation.
* Implemented Queue Display.
* Implemented empty queue handling.
* Tested Stack and Queue functionality.

---

### Member 3 - Linked List

**Contribution:**

* Implemented the `Node` class.
* Implemented the `LinkedListManager` class.
* Implemented Linked List insertion.
* Implemented Linked List deletion.
* Implemented Linked List searching.
* Implemented Linked List display.
* Handled empty Linked List conditions.
* Tested Linked List operations.
* Integrated the Linked List component with the main application.

---

### Member 4 - Graph

**Contribution:**

* Implemented the `GraphManager` class.
* Implemented Add Vertex operation.
* Implemented Add Edge operation.
* Implemented Graph Display.
* Implemented Breadth First Search (BFS).
* Implemented Depth First Search (DFS).
* Implemented graph traversal.
* Handled invalid starting vertices.
* Tested graph functionality.
* Integrated the Graph component with the main application.

---

### Member 5 - Integration and Performance

**Contribution:**

* Implemented the `Main` class.
* Created the main menu.
* Created submenus for all components.
* Integrated all group members' components.
* Implemented input validation.
* Implemented the `PerformanceManager` class.
* Added algorithm complexity information.
* Added searching performance comparison.
* Tested the complete application.
* Helped with final GitHub integration.
* Prepared the final project structure and README.

---

## 5. Technologies Used

### Programming Language

**Java**

### Development Environment

**Visual Studio Code**

### Version Control

**Git and GitHub**

### Application Type

**Console-Based Application**

---

## 6. Main System Features

### 6.1 Array Operations

The Array component provides:

* Insert
* Delete
* Search
* Display

---

### 6.2 Stack Operations

The Stack component provides:

* Push
* Pop
* Peek
* Display
* Empty stack handling

---

### 6.3 Queue Operations

The Queue component provides:

* Enqueue
* Dequeue
* Peek
* Display
* Empty queue handling

---

### 6.4 Linked List Operations

The Linked List component provides:

* Insert
* Delete
* Search
* Display

---

### 6.5 Searching Operations

The system provides:

* Linear Search
* Binary Search

The program also displays search execution time to provide a basic performance comparison.

---

### 6.6 Graph Operations

The Graph component provides:

* Add Vertex
* Add Edge
* Display Graph
* BFS Traversal
* DFS Traversal

---

### 6.7 Performance and Complexity

The system demonstrates the time complexity of selected operations.

Examples:

| Operation          | Complexity |
| ------------------ | ---------- |
| Linear Search      | O(n)       |
| Binary Search      | O(log n)   |
| Stack Push         | O(1)       |
| Stack Pop          | O(1)       |
| Stack Peek         | O(1)       |
| Queue Enqueue      | O(1)       |
| Queue Dequeue      | O(1)       |
| Queue Peek         | O(1)       |
| Linked List Search | O(n)       |
| BFS                | O(V + E)   |
| DFS                | O(V + E)   |

The system also provides execution-time information for searching operations.

---

## 7. Project Structure

```text
CIT300-DataStructureAnalyzer
│
├── src
│   │
│   ├── Main.java
│   ├── ArrayManager.java
│   ├── SearchManager.java
│   ├── StackManager.java
│   ├── QueueManager.java
│   ├── Node.java
│   ├── LinkedListManager.java
│   ├── GraphManager.java
│   └── PerformanceManager.java
│
├── README.md
│
└── .gitignore
```

---

## 8. Main Menu

The application provides the following main menu:

```text
=============================================
      DATA STRUCTURE & GRAPH ANALYZER
=============================================
1. Array Operations
2. Stack Operations
3. Queue Operations
4. Linked List Operations
5. Searching Operations
6. Graph Operations
7. Performance Comparison
8. Display All Results
9. Exit
=============================================
Enter your choice:
```

---

## 9. How to Run the Project

### Step 1 - Install Java

Install the Java Development Kit (JDK).

Check the Java installation using:

```bash
java -version
```

Also check the Java compiler:

```bash
javac -version
```

---

### Step 2 - Open the Project

Open the project folder in Visual Studio Code.

Open the VS Code terminal.

---

### Step 3 - Go to the Source Folder

Run:

```bash
cd src
```

---

### Step 4 - Compile the Java Files

Run:

```bash
javac *.java
```

If there are no errors, the Java files have been compiled successfully.

---

### Step 5 - Run the Application

Run:

```bash
java Main
```

---

## 10. Testing

The following operations were tested:

### Array

* Insert value
* Delete value
* Search value
* Display values
* Search for a value that does not exist

### Stack

* Push values
* Pop values
* Peek top value
* Display stack
* Pop from an empty stack

### Queue

* Enqueue values
* Dequeue values
* Peek front value
* Display queue
* Dequeue from an empty queue

### Linked List

* Insert values
* Delete values
* Search values
* Display linked list
* Search for a value that does not exist

### Graph

* Add vertices
* Add edges
* Display graph
* BFS traversal
* DFS traversal
* Test invalid starting vertex

### Searching

* Linear Search
* Binary Search
* Search execution time comparison

---

## 11. GitHub Collaboration

The project was developed collaboratively using GitHub.

Each group member worked on their assigned component.

The project uses:

* Git branches
* Git commits
* Pull requests
* Merging
* GitHub repository

Suggested branches:

```text
main
member1-array-search
member2-stack-queue
member3-linked-list
member4-graph
member5-integration
```

Each member's work was committed to their assigned branch before integration into the main project.

---

## 12. Team Information

**Module:** CIT300 Data Structures and Algorithms

**Assignment:** Graded Practical Assignment 2

**Application Type:** Console-Based Java Application

**Programming Language:** Java
