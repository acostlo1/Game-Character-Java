# Game Character | Java Encapsulation Practice

A beginner-friendly Java project demonstrating encapsulation through private fields, getter methods, setter methods, and basic input validation.

The application creates a game character, displays its attributes, updates its health, and prevents invalid health values from being assigned.

## Features

- Create a character with a name, health, and level
- Retrieve character attributes using getter methods
- Update character health using a setter method
- Validate health values between 0 and 100
- Preserve the existing health value when an invalid update is attempted

## Java Concepts Practiced

- **Encapsulation:** Protecting object fields using the `private` access modifier
- **Getters:** Providing controlled read access to private fields
- **Setters:** Providing controlled write access to private fields
- **Input Validation:** Rejecting health values outside the accepted range
- **Constructors:** Initializing object attributes
- **`this` Keyword:** Distinguishing instance variables from constructor parameters
- **Objects and Methods:** Creating and interacting with a Java object

## Project Structure

```text
Game-Character-Java/
├── GameCharacter.java
└── Main.java
```

## How It Works

The application creates a character with the following attributes:

- Name: Shadow
- Health: 100
- Level: 5

The program retrieves the character's information through getter methods, updates health to 65 using a setter, and attempts to assign an invalid health value of 150.

The setter rejects the invalid value, leaving the character's health unchanged.

## Example Output

```text
===== CHARACTER INFO =====
Name: Shadow
Health: 100
Level: 5

After taking damage:
65

Attempting invalid health update:
Invalid health value
65
```

## How to Run

1. Install a Java Development Kit (JDK).
2. Download or clone this repository.
3. Open a terminal in the project directory.
4. Compile the Java files:

```bash
javac Main.java GameCharacter.java
```

5. Run the application:

```bash
java Main
```

## Future Improvements

- Add a damage-taking method
- Implement character healing
- Introduce experience points and leveling
- Create multiple character objects
- Expand the application into a console-based game

## Project Purpose

This project was developed to reinforce my understanding of Java encapsulation, particularly the relationship between private instance variables, getter methods, setter methods, and controlled access to object data.

**Author:** Lorenzo Acosta-Santos
