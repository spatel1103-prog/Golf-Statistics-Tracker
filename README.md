# Golf Statistics Tracker

A Java desktop application for recording, managing, and analyzing golf performance data. Built with Java Swing, the application provides a graphical user interface for tracking rounds, viewing performance statistics, searching round history, and managing saved golf data.

Round data is stored locally using file I/O, allowing statistics and round history to persist across application sessions.

## Application Preview

### Main Menu
<img width="472" height="449" alt="image" src="https://github.com/user-attachments/assets/4716cce0-8e4a-4f31-9618-db65ab587d6f" />

### Add Round Window
<img width="522" height="493" alt="image" src="https://github.com/user-attachments/assets/83fec190-283e-4c0d-ada9-47e71990df2b" />

## Features

- Add golf rounds with detailed performance statistics
- View all previously recorded rounds
- Calculate overall golf performance statistics
- Search rounds by course name
- Delete saved rounds
- Validate user input and handle invalid data
- Automatically save round data to local storage
- Load saved rounds when the application starts
- Graphical user interface built with Java Swing

## Statistics Tracked

Each golf round records:

- Course name
- Date
- Score
- Putts
- Fairways hit
- Greens in regulation
- Penalty strokes

The application calculates performance statistics including:

- Best round
- Worst round
- Average score
- Average putts
- Average fairways hit
- Average greens in regulation
- Average penalty strokes

## Technologies Used

- Java
- Java Swing
- Object-Oriented Programming
- Java Collections
- File I/O
- Exception Handling
- Git and GitHub

## Project Structure

```text
src/
├── MainWindow.java          // Main application window and navigation
├── AddRoundWindow.java      // Handles adding new golf rounds
├── ViewRoundsWindow.java    // Displays recorded rounds
├── ViewStatistics.java      // Displays calculated performance statistics
├── DeleteRound.java         // Handles deleting saved rounds
├── SearchRound.java         // Searches rounds by course name
├── GolfRound.java           // Represents an individual golf round
├── GolfTracker.java         // Stores rounds and calculates statistics
└── FileManager.java         // Handles persistent data storage
```

## Persistent Storage

Round data is automatically saved to a local text file using Java file I/O. When the application starts, previously saved rounds are loaded into the tracker.

Adding or deleting a round automatically updates the stored data, allowing round history to persist between application sessions.

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA or another Java IDE.
3. Compile the Java source files.
4. Run `MainWindow.java`.
5. Use the graphical interface to add and manage golf rounds.

## Future Improvements

- Add performance trend visualizations and charts
- Support editing existing rounds
- Add sorting and filtering options
- Improve data storage using a database
- Export golf statistics to CSV

## About the Project

I built this project to combine my interest in golf with my experience learning Java and object-oriented programming. The project began as a command-line application and was later expanded into a Java Swing desktop application with a graphical user interface and persistent data storage.
