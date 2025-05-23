# Snake Game Project

This was a project of a new developer who wanted to learn Java and game development. The project was created as a learning exercise to understand the basics of Java programming, object-oriented design, and game mechanics. He needed some advice to find the bug. I forgot his name, but this was *some* of the remaining code after we got his project to work.

**NOTE** The description below was automatically generated by GPT-4o.

---

This project is a Java-based implementation of the classic Snake game. It demonstrates the use of the Java 2D API to create a simple yet functional game. The project is structured to showcase object-oriented programming principles and design patterns.

## Features
- **Snake Movement**: The snake moves in a grid-based field and can change direction based on user input.
- **Apple Collection**: The snake collects apples to grow in size and increase the score.
- **Game Over**: The game ends when the snake collides with itself or the boundaries.
- **Score Tracking**: The game tracks the player's score based on the apples collected.
- **Modular Design**: The project is designed with modularity in mind, making it easy to extend or modify.

## Technical Details
- **Java 2D API**: Used for rendering the game graphics.
- **Observer Pattern**: Implements the observer pattern to update the game view whenever the game state changes.
- **Game Logic**: Encapsulated in a separate logic layer for better separation of concerns.
- **Customizable Components**: Includes different views for game objects like the snake, apple, and score.

## How to Run
1. Clone the repository to your local machine.
2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).
3. Run the `main` class located in `src/com/cs/snakeGame/main.java`.

## Project Structure
- **GameObjects**: Contains the core game entities like the snake, apple, and score.
- **gameInterface**: Defines the graphical representation of game objects.
- **gameLogic**: Handles the game rules and logic.
- **gameController**: Manages user input and game flow.
- **common**: Includes shared utilities and constants.
