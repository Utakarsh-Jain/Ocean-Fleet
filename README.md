# Ocean Fleet – Vessel Management System

## Project Overview

Ocean Fleet is a console-based Java application that demonstrates Object-Oriented Programming (OOP), collection handling, searching, and business logic implementation using plain Java and Maven.

The application allows users to:
- Register vessel details.
- Search for a vessel using its unique ID.
- Identify high-performance vessels based on their average speed.
- Display vessel information through a console-based interface.

The project follows a layered architecture that separates the model, utility, and user interface components, improving code readability, maintainability, and reusability.

## Technologies Used

- **Programming Language:** Java
- **Build Tool:** Maven
- **Testing Framework:** JUnit 5
- **IDE:** IntelliJ IDEA
- **JDK:** Java 22
- **Interface:** Console (Standard Input/Output)

## Project Structure

```text
Ocean-Fleet/
│
└── OceanFleet/
    ├── src/
    │   ├── main/
    │   │   └── java/
    │   │       └── com/
    │   │           └── oceanfleet/
    │   │               ├── model/
    │   │               │   └── Vessel.java
    │   │               ├── util/
    │   │               │   └── VesselUtil.java
    │   │               └── ui/
    │   │                   └── UserInterface.java
    │   │
    │   └── test/
    │       └── java/
    │           └── com/
    │               └── oceanfleet/
    │                   ├── model/
    │                   │   └── VesselTest.java
    │                   ├── util/
    │                   │   ├── VesselUtilTest.java
    │                   │   └── VesselUtilHighPerformanceTest.java
    │                   └── ui/
    │                       └── UserInterfaceTest.java
    │
    ├── pom.xml
    └── README.md
```

## Use Cases Implemented

### UC1 – Create Vessel Model

Created a `Vessel` class to represent vessel information.

| Field | Type | Description |
|---|---|---|
| vesselId | String | Unique identifier of the vessel |
| vesselName | String | Name of the vessel |
| averageSpeed | double | Average speed of the vessel |
| vesselType | String | Type of vessel (Cargo, Tanker, Cruise, etc.) |

**Implemented Features:**
- Parameterized constructor.
- No-argument constructor.
- Getters and setters.
- Encapsulation using private fields.

### UC2 – Store Vessel Records

Created a `VesselUtil` class to maintain vessel records.

**Implemented Features:**
- Added vessels using `addVesselPerformance(Vessel vessel)`.
- Stored vessel records using `ArrayList<Vessel>`.
- Provided access to the vessel list using `getVesselList()`.

### UC3 – Search Vessel by ID

Implemented vessel searching using:

`getVesselById(String vesselId)`

**Implemented Features:**
- Iterates through the vessel list.
- Returns the matching vessel when found.
- Returns `null` when no matching vessel exists.
- Performs case-sensitive searching.

**Example:**

| Input ID | Stored IDs | Result |
|---|---|---|
| V002 | V001, V002, V003 | Found |
| V004 | V001, V002, V003 | Not Found |
| v001 | V001 | Not Found |

### UC4 – High Performance Vessels

Implemented `getHighPerformanceVessels()` to identify vessels having the highest average speed.

**Implemented Features:**
- Finds the maximum average speed.
- Returns all vessels matching the maximum speed.
- Handles multiple vessels with the same maximum speed.
- Returns an empty list when no vessels are registered.

**Example:**

| Vessel | Average Speed |
|---|---:|
| Sea King | 25.5 knots |
| Ocean Star | 18.0 knots |
| Wave Rider | 25.5 knots |

**Result:** Sea King and Wave Rider are identified as high-performance vessels.

### UC5 – Console User Interface

Created a console-based interface using the `UserInterface` class.

**User Input:**
1. Number of vessels to be registered.
2. Vessel details in the following format:

   `vesselId:vesselName:averageSpeed:vesselType`

3. Vessel ID to search for.

**Application Output:**
- Displays the searched vessel details.
- Displays a not-found message if the vessel does not exist.
- Displays all high-performance vessels.

**Output Format:**

```text
V001 | Sea King | Cargo | 25.5 knots
```

### UC6 – OOP Refactoring

Refactored the application into a layered structure to improve maintainability and separation of concerns.

| Package | Responsibility |
|---|---|
| model | Contains the Vessel entity class |
| util | Handles vessel storage, searching, and business logic |
| ui | Manages console input and output |

This structure makes the application easier to understand, maintain, test, and extend.

## Sample Run

```text
Enter the number of vessels to be added
3

Enter vessel details
V001:Sea King:25.5:Cargo

Enter vessel details
V002:Ocean Star:18.0:Tanker

Enter vessel details
V003:Wave Rider:25.5:Cruise

Enter the Vessel Id to check speed
V002

V002 | Ocean Star | Tanker | 18.0 knots

High performance vessels are

V001 | Sea King | Cargo | 25.5 knots
V003 | Wave Rider | Cruise | 25.5 knots
```

## Maven Dependencies

The project uses JUnit 5 for unit testing.

Add the following dependency to `pom.xml`:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.11.4</version>
    <scope>test</scope>
</dependency>
```

## How to Run the Project

### Prerequisites

- Java JDK 22 or above.
- IntelliJ IDEA.
- Apache Maven.

### Execution Steps

**1. Clone the repository**

```bash
git clone https://github.com/Utakarsh-Jain/Ocean-Fleet.git
```

**2. Open the project**

Open the `OceanFleet` module in IntelliJ IDEA.

**3. Load Maven Dependencies**

Allow IntelliJ IDEA to download and configure the required Maven dependencies.

**4. Run the Application**

Execute the `main()` method in:

```text
com.oceanfleet.ui.UserInterface
```

**5. Provide Input**

Enter vessel details and follow the console instructions.

## Run Tests

To execute all unit tests using Maven, run:

```bash
mvn test
```

JUnit 5 is used to test the model, utility methods, high-performance vessel identification, and console user interface.

## Learning Outcomes

Through this project, the following Java concepts were practiced:

- Creating Java classes and objects.
- Encapsulation using private fields, getters, and setters.
- Using parameterized and no-argument constructors.
- Working with `ArrayList` and the Java Collections Framework.
- Implementing search logic with case sensitivity.
- Finding maximum values and handling ties.
- Parsing console input using `Scanner`.
- Formatting console output.
- Writing unit tests using JUnit 5.
- Managing dependencies and project builds using Maven.
- Applying layered architecture and object-oriented design principles.
- Separating business logic from user interface implementation.

## Author

**Utakarsh Jain**

- **GitHub:** [Utakarsh-Jain](https://github.com/Utakarsh-Jain)
- **Repository:** [Ocean-Fleet](https://github.com/Utakarsh-Jain/Ocean-Fleet)

---

*This project was developed as part of Java practice, covering Use Cases UC1 to UC6.*
