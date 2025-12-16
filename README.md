# Special Numbers Calculator

A simple, robust, command-line Java application for checking various types of "special" numbers and performing a few common mathematical calculations.

## Features

This application allows you to check if a given number is:

-   **Palindrome**: Reads the same forwards and backward (e.g., 121).
-   **Spy Number**: The sum of its digits equals the product of its digits (e.g., 1124).
-   **Armstrong Number**: The sum of its own digits, each raised to the power of the number of digits (e.g., 153).
-   **Pronic Number**: The product of two consecutive integers (e.g., 42 = 6 * 7).
-   **Perfect Number**: The sum of its proper divisors equals the number itself (e.g., 28).
-   **Prime Number**: A number greater than 1 with only two factors: 1 and itself (e.g., 7).

It can also perform the following calculations:

-   **Factorial**: The product of all positive integers up to a given number.
-   **Mean and Median**: Basic statistical calculations on a series of numbers.

## How to Use

1.  **Compile the code:**
    ```bash
    javac Special_Numbers.java
    ```

2.  **Run the application:**
    ```bash
    java Special_Numbers
    ```

3.  Follow the on-screen menu to select a calculation. The application includes input validation to prevent crashes from non-numeric input.

## Technologies Used

-   Java
