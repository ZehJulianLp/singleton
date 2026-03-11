# Singleton Pattern – Präsentationsvorbereitung

## 1. Problem / Motivation

In manchen Programmen soll es **nur genau eine Instanz einer Klasse geben**.

Beispiele:

* Logger
* Konfigurationsmanager
* Datenbankverbindung

Wenn mehrere Instanzen existieren würden, könnte es zu **Inkonsistenzen oder unnötigem Ressourcenverbrauch** kommen.

Dafür wird das **Singleton Design Pattern** verwendet.

---

# 2. Definition Singleton

Ein **Singleton** ist eine Klasse,

* die **nur eine Instanz besitzen darf**
* und einen **globalen Zugriffspunkt** auf diese Instanz bereitstellt.

Typische Eigenschaften:

* Konstruktor ist **privat**
* Instanz wird **statisch gespeichert**
* Zugriff über eine **getInstance() Methode**

---

# 3. Grundbegriffe (OOP)

## Klasse

Eine **Klasse** ist eine Vorlage für Objekte.
Sie definiert Eigenschaften (Variablen) und Verhalten (Methoden).

Beispiel:

```java
public class LazySingleton
```

---

## Objekt / Instanz

Ein **Objekt** ist eine konkrete Ausführung einer Klasse im Speicher.

Normalerweise erstellt man Objekte mit:

```java
new LazySingleton();
```

Beim Singleton wird das verhindert, damit **nur eine Instanz existiert**.

---

## Konstruktor

Der **Konstruktor** erzeugt ein Objekt der Klasse.

Beispiel:

```j
```
