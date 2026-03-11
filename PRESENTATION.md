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

```java
private LazySingleton() {
}
```

Beim Singleton ist der Konstruktor **private**, damit keine neuen Objekte außerhalb der Klasse erstellt werden können.

---

## static

`static` bedeutet, dass eine Variable oder Methode zur **Klasse selbst** gehört und nicht zu einem Objekt.

Beispiel:

```java
private static LazySingleton instance;
```

Dadurch existiert diese Instanz **nur einmal für die gesamte Klasse**.

---

## Zugriffsmethode

Da der Konstruktor privat ist, braucht man eine Methode, um auf die Instanz zuzugreifen.

Diese Methode ist meistens:

```java
public static LazySingleton getInstance()
```

Sie gibt die einzige Instanz zurück.

---

# 4. Eager Singleton

Beim **Eager Singleton** wird die Instanz **sofort beim Laden der Klasse erzeugt**.

Beispiel:

```java
private static final EagerSingleton instance = new EagerSingleton();
```

### Vorteile

* einfache Implementierung
* automatisch thread-safe

### Nachteile

* Objekt wird erstellt, auch wenn es **nie benutzt wird**

---

# 5. Lazy Singleton

Beim **Lazy Singleton** wird die Instanz **erst erstellt, wenn sie benötigt wird**.

Beispiel:

```java
if (instance == null) {
    instance = new LazySingleton();
}
```

### Vorteile

* spart Ressourcen
* Objekt wird nur erstellt, wenn es gebraucht wird

### Nachteile

* einfache Variante ist **nicht thread-safe**

---

# 6. Demonstration im Programm

In der `Main`-Klasse werden beide Implementierungen aufgerufen.

Beispiel:

```java
EagerSingleton eager = EagerSingleton.getInstance();
LazySingleton lazy = LazySingleton.getInstance();
```

Die Konsolenausgabe zeigt:

* **EagerSingleton wird sofort erstellt**
* **LazySingleton erst beim ersten Zugriff**

---

# 7. Überprüfung des Singleton-Prinzips

Im Programm werden zwei Instanzen verglichen:

```java
if (lazy == lazy2)
```

Wenn beide Variablen auf dasselbe Objekt im Speicher zeigen, bestätigt das die Singleton-Eigenschaft.

---

# 8. Fazit

Der Unterschied zwischen den beiden Varianten liegt hauptsächlich im **Zeitpunkt der Erstellung**.

| Variante        | Zeitpunkt der Erstellung     |
| --------------- | ---------------------------- |
| Eager Singleton | sofort beim Laden der Klasse |
| Lazy Singleton  | erst beim ersten Zugriff     |

Beide Varianten stellen sicher, dass **nur eine Instanz der Klasse existiert**.
