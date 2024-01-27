# Dice Game

Welcome to the Dice Game! This Maven project implements a simple turn-based game where two players engage in magical battles.

## Table of Contents

- [Overview](#overview)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Building the Project](#building-the-project)
  - [Running the Game](#running-the-game)
- [Game Rules](#game-rules)
- [Contributing](#contributing)
- [License](#license)

## Overview

The Dice Game is implemented in Java using Maven. It consists of player classes, a dice class for rolling, and a magical arena class to orchestrate the game. Players take turns attacking and defending until one player's health reaches zero.

## Getting Started

### Prerequisites

Make sure you have the following tools installed:

- [Java](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)

Java Development Kit (JDK): Maven is a Java-based build tool, so you need to have Java installed on your system. Make sure you have a compatible version of the Java Development Kit (JDK) installed. You can check your Java version by running "java -version" in the command line.

Maven Installation: You need to have Maven installed on your machine. You can download Maven from the official Apache Maven website (https://maven.apache.org/download.cgi). Follow the installation instructions provided for your operating system.

Environment Variables: Ensure that the "JAVA_HOME" and "M2_HOME" environment variables are set correctly. Additionally, add the "bin" directories of both Java and Maven to your system's "PATH" variable.

Project Dependencies: This project has external dependencies specified in the pom.xml file, make sure that your machine has internet connectivity so that Maven can download these dependencies from remote repositories.

After ensuring these prerequisites, you should be able to build and run your Maven project using the "mvn clean install" or "mvn package" command.

### Building the Project

To build the project, open a terminal and navigate to the project directory. Run the following Maven command:

```bash
mvn clean install
```

or

```bash
mvn package
```

### Running the Game

After building the project, you can run the game using the provided `App` class. Execute the following command:

```bash
mvn exec:java
```

Upon running the game you will be asked to enter the health, strength & attack attributes fo both the players PlayerA and PlayerB. Upon providing these attributes you will be able to see the result of every turn/attack between the players, how much damage caused in that turn & the final result of the game.

The code coverage report can be found in the directory "/target/site/jacoco/index.html". The line coverage is 68% and branch coverage is 92%.

## Game Rules

- Each player has health, strength, and attack attributes.
- Players take turns attacking and defending.
- Damage is calculated based on dice rolls and player attributes.
- The game ends when a player's health reaches zero.

## Contributing

## License
