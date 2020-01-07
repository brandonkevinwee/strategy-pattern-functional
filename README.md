# Strategy Patterns with Functional Programming Principles

The ability to select the behavior of an algorithm during runtime is the crux of the strategy pattern.

This is classically implemented using a library of classes to select an algorithm's behavior. This design pattern however can also be implementing using a library of methods instead, using functional programming features introduced in Java 8.

This repository shows strategy pattern classic implementation and functional implementation. Consider the code used to control a fictional robotic arm, which requires to have several preprogrammed routines.

Navigate to **Controller** to see how behavior is selected during runtime for different implementations of the strategy pattern.

### 1. Classic Strategy Pattern

The classic way of implementing the strategy pattern is demonstrated through package **strategy.classic.robot**

In this case, the behavior is controlled by using the **setRoutine** method in **ClassicArm**.

Extension of the code is done by adding more routines to implement the **ClassicArmRoutine** interface.

### 2. Functional Strategy Pattern

The functional way of implementing the strategy pattern is demonstrated through package **strategy.functional.robot**

In this case, the behavior is controlled through a higher-order function method in **FunctionalArm**

Extension of the code is done by adding more methods in **FunctionalArmRoutine** class, and passing them to **FunctionalArm**'s higher-order function method either as a lambda expression or as a method reference. In addition, a user may pass their own lambda expression to the higher-order function, as long as it satisfies the requirements of Java's Runnable functional interface.