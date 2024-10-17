# Musical Chairs Simulation

A Java application simulating the classic game of Musical Chairs using a circular doubly linked list. This project demonstrates the implementation of advanced data structures and algorithms, suitable for inclusion in a data science student portfolio.

## Table of Contents
- [Introduction](#introduction)
- [Game Mechanics](#game-mechanics)
- [Project Structure](#project-structure)
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Code Explanation](#code-explanation)
- [Sample Output](#sample-output)
- [Skills Demonstrated](#skills-demonstrated)
- [Potential Extensions](#potential-extensions)
- [License](#license)
- [Contact](#contact)

## Introduction

The Musical Chairs Simulation is a Java program that models the popular children's game where players move around a circle of chairs to music. When the music stops, they attempt to sit on the available chairs. This simulation uses a circular doubly linked list to represent the circle of players, showcasing proficiency in data structures and algorithm design.

## Game Mechanics

- **Players**: Represented as nodes in a circular doubly linked list.
- **Movement**: Simulated by traversing the list.
- **Music Stop**: A random player is selected for elimination when the music stops.
- **Elimination**: The selected player is removed from the list.
- **Winner Determination**: The last remaining player is declared the winner.

## Project Structure

```css
Musical-Chairs/
├── src/
│   └── musicalChairs/
│       ├── Node.java
│       ├── DoublyLinkedList.java
│       ├── MusicalChairs.java
│       └── Main.java
├── README.md
└── LICENSE
```
- **Node.java**: Represents a player in the game.
- **DoublyLinkedList.java**: Manages the circular doubly linked list of players.
- **MusicalChairs.java**: Contains the game logic and simulation.
- **Main.java**: Entry point of the application.

## Features

- **Circular Doubly Linked List Implementation**: Efficiently models the circle of players.
- **Randomized Elimination**: Uses randomization to simulate the unpredictability of music stopping.
- **Modular Code Design**: Separation of concerns through different classes.
- **Console Output**: Displays each elimination and the winner.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) version 8 or higher.
- A Java IDE or text editor (e.g., IntelliJ IDEA, Eclipse, VS Code).

### Installation

1. **Clone the Repository**
```bash
   git clone https://github.com/Princeu3/Musical-Chairs.git
```
2. **Navigate to the Project Directory**
```bash
   cd musical-chairs
```
## Usage

### Compile the Code
Navigate to the `src` directory and compile the Java files:
cd src
javac musicalChairs/*.java

### Run the Program
Execute the `Main` class:
java musicalChairs.Main

## Code Explanation

### 1. Node.java

Represents each player in the game.

- **Fields**:
  - `data`: The name of the player.
  - `next`: Reference to the next player.
  - `prev`: Reference to the previous player.

### 2. DoublyLinkedList.java

Manages the collection of players.

- **Key Methods**:
  - `insert(String data)`: Adds a new player to the circle.
  - `remove(Node currentNode)`: Eliminates a player from the game.
  - `toString()`: Provides a string representation of the current players.

### 3. MusicalChairs.java

Contains the logic for simulating the game.

- **Key Methods**:
  - `playRound()`: Simulates a single round where a player is eliminated.
  - `getPlayerCount()`: Returns the number of remaining players.
  - `playGame()`: Runs the game until a winner is determined.

### 4. Main.java

Entry point to start the simulation.

- **Functionality**:
  - Initializes the list of players.
  - Creates a `MusicalChairs` instance.
  - Starts the game simulation.

## Sample Output

When you run the program, you might see output similar to:
```markdown
Eliminated: Charlie
Remaining players: Alice Bob David Eva Frank
---------------------------------
Eliminated: Eva
Remaining players: Alice Bob David Frank
---------------------------------
Eliminated: Bob
Remaining players: Alice David Frank
---------------------------------
Eliminated: Frank
Remaining players: Alice David
---------------------------------
Eliminated: Alice
Remaining players: David
---------------------------------
The winner is: David
```
Note: Due to the random nature of the simulation, the output may vary with each execution.

## Skills Demonstrated

- **Data Structures**: Implementation of circular doubly linked lists.
- **Algorithm Design**: Simulation of game logic using randomness.
- **Object-Oriented Programming**: Use of classes, objects, and encapsulation.
- **Problem Solving**: Translating real-world game rules into code.
- **Code Optimization**: Efficient management of nodes and memory.

## Potential Extensions

- **User Interaction**: Modify the program to accept custom player names or the number of players from user input.
- **Graphical Interface**: Implement a GUI to visualize the game.
- **Data Analysis**: Run multiple simulations to collect data on player win rates and analyze patterns.
- **AI Strategies**: Introduce different strategies for players and analyze their effectiveness.

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Contact

**Prince Upadhyay**

- Email: princeupadhyay1401@Gmail.com
- GitHub: [Princeu3](https://github.com/Princeu3)
- LinkedIn: www.linkedin.com/in/princeu

