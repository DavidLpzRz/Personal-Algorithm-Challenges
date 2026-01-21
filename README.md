# 🧩 Personal Algorithm Challenges – Java

This repository contains a collection of **personal programming challenges** focused on **algorithmic thinking, recursion, and data structures**, implemented in **Java**.

Each challenge is independent and designed to strengthen problem-solving skills.

## 📚 Challenges Included

1. **Longest Path in a Matrix**
2. **Sudoku Validator**
3. **Recursive Fibonacci Numbers**
4. **Recursive Digit Sum**

---

## 🛣️ Challenge 1: Longest Path in a Matrix

### 📌 Description

Write a static function `int calcularCaminoMasLargo(int[][] matriz)` that receives a matrix of integers.  
Starting from position **(0,0)**, you can only move **right** or **down**.

The function must calculate the **maximum possible sum** along the path.

### 📌 Example

```java
int[][] matriz = {
  {2, 3, 1},
  {1, 7, 1},
  {4, 6, 5}
};

calcularCaminoMasLargo(matriz); // Returns 21 (2 → 3 → 7 → 6 → 5)
```

### 🧠 Key Concepts
Dynamic Programming

Matrix traversal

Optimization problems


## 🧩 Challenge 2: Sudoku Validator
### 📌 Description

Write a static function boolean verificarSudoku(int[][] tablero) that checks whether a 9x9 Sudoku grid is valid.

A Sudoku is valid if:

Each row contains numbers from 1 to 9 without repetition

Each column contains numbers from 1 to 9 without repetition

Each 3x3 subgrid contains numbers from 1 to 9 without repetition

📌 Example
```java
int[][] tablero = {
  {5, 3, 4, 6, 7, 8, 9, 1, 2},
  {6, 7, 2, 1, 9, 5, 3, 4, 8},
  {1, 9, 8, 3, 4, 2, 5, 6, 7},
  {8, 5, 9, 7, 6, 1, 4, 2, 3},
  {4, 2, 6, 8, 5, 3, 7, 9, 1},
  {7, 1, 3, 9, 2, 4, 8, 5, 6},
  {9, 6, 1, 5, 3, 7, 2, 8, 4},
  {2, 8, 7, 4, 1, 9, 6, 3, 5},
  {3, 4, 5, 2, 8, 6, 1, 7, 9}
};

verificarSudoku(tablero); // Returns true
```

### 🧠 Key Concepts
Arrays and matrices

Validation logic

Set-based checks

## 🔢 Challenge 3: Recursive Fibonacci Numbers
### 📌 Description

Implement a recursive static function that calculates the n-th Fibonacci number, and another function that generates the full sequence up to n.

### 📌 Function Signatures
public static int fibonacci(int n);

public static void generarFibonacci(int n);

### 🧠 Key Concepts
Recursion

Base cases

Time complexity considerations

## ➕ Challenge 4: Recursive Digit Sum
### 📌 Description

Create a recursive static function that calculates the sum of the digits of a positive integer.

The function must decompose the number into digits

Sum each digit recursively

If the number is negative, handle the error appropriately

### 📌 Examples
```text
Input:  123
Output: 6   (1 + 2 + 3)

Input:  9876
Output: 30  (9 + 8 + 7 + 6)
```

### 🧠 Key Concepts
Recursion

Mathematical decomposition

Input validation
