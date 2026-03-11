# Java Singleton Example

This repository demonstrates two common implementations of the **Singleton design pattern** in Java.

The Singleton pattern ensures that a class has **only one instance** and provides a **global access point** to that instance.

## Implementations

### Eager Singleton

The instance is created **immediately when the class is loaded**.

Advantages:

* Simple implementation
* Thread-safe by default

Disadvantages:

* The instance is created even if it is never used.

### Lazy Singleton

The instance is created **only when it is first requested**.

Advantages:

* Saves resources if the object is never used.

Disadvantages:

* The basic implementation is **not thread-safe**.

## Project Structure

```
src/
├─ EagerSingleton.java
├─ LazySingleton.java
└─ Main.java
```

## Running the Example

Compile the program:

```
javac *.java
```

Run the program:

```
java Main
```

Example output:

```
Programm gestartet
EagerSingleton wurde erstellt
Hallo vom EagerSingleton
LazySingleton wurde erstellt
Hallo vom LazySingleton
LazySingleton ist wirklich nur einmal vorhanden
```

## Purpose

This project was created as a small demonstration of different Singleton implementations for educational purposes.
