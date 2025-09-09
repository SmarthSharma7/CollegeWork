# Data Structures Assignments

This repository contains a collection of Java programming assignments focused on **Data Structures and Algorithms**, organized into three main assignments covering fundamental concepts and implementations.

## 📚 Repository Structure

```
DSAssignments/
├── src/
│   ├── Assignment_1/     # Basic Array Operations & Matrix Operations
│   ├── Assignment_2/     # Advanced Algorithms & Data Structures
│   ├── Assignment_3/     # Stack Operations & Applications
│   └── Utils/           # Helper Classes & Utility Functions
└── README.md
```

## 📋 Assignment Overview

### Assignment 1: Array and Matrix Operations
- **ArrayMenu_Q1.java** - Interactive menu for array operations (create, display, insert, delete, search)
- **RemoveDuplicates_Q2.java** - Algorithm to remove duplicate elements from arrays
- **Q3.txt** - C program analysis and output prediction
- **ReverseArray_Q4_a.java** - Array reversal implementation
- **MultiplyMatrices_Q4_b.java** - Matrix multiplication algorithm
- **TransposeMatrix_Q4_c.java** - Matrix transpose operation
- **Sum_Q5.java** - Array summation operations

### Assignment 2: Advanced Algorithms & Data Structures
- **BinarySearch_Q1.java** - Binary search implementation on sorted arrays
- **BubbleSort_Q2.java** - Bubble sort algorithm implementation
- **FindMissing_Q3.java** - Algorithm to find missing elements
- **String_Q4_a-e.java** - Various string manipulation algorithms
- **Matrix Operations (Q5)** - Specialized matrix implementations:
  - `DiagonalMatrix_Q5_a.java` - Diagonal matrix operations
  - `TridiagonalMatrix_Q5_b.java` - Tridiagonal matrix handling
  - `LowerTriangleMatrix_Q5_c.java` - Lower triangular matrix
  - `UpperTriangleMatrix_Q5_d.java` - Upper triangular matrix
  - `SymmetricMatrix_Q5_e.java` - Symmetric matrix operations
- **Sparse Matrix (Q6)** - Sparse matrix representations and operations
- **CountInversions_Q7.java** - Algorithm to count array inversions
- **CountDistinct_Q8.java** - Count distinct elements in arrays

### Assignment 3: Stack Operations & Applications
- **StackMenu_Q1.java** - Interactive stack operations menu
- **ReverseStringStack_Q2.java** - String reversal using stack
- **BalancedParenthesis_Q3.java** - Check balanced parentheses using stack
- **InfixToPostfix_Q4.java** - Convert infix expressions to postfix notation
- **PostfixEvaluation_Q5.java** - Evaluate postfix expressions

### Utils Package
- **Stack.java** - Custom stack implementation
- **StackInt.java** - Integer-specific stack implementation  
- **MergeSort.java** - Merge sort algorithm implementation

## 🚀 Getting Started

### Prerequisites
- **Java Development Kit (JDK) 8 or higher**
- **IDE** (IntelliJ IDEA, Eclipse, or VS Code with Java extensions)
- Basic understanding of Data Structures and Algorithms

### Compilation and Execution

1. **Clone the repository:**
   ```bash
   git clone https://github.com/SmarthSharma7/DSAssignments.git
   cd DSAssignments
   ```

2. **Compile Java files:**
   ```bash
   # Compile all files (from project root)
   javac src/Utils/*.java
   javac src/Assignment_1/*.java
   javac src/Assignment_2/*.java
   javac src/Assignment_3/*.java
   ```

3. **Run individual programs:**
   ```bash
   # From project root directory
   # Example: Run array menu from Assignment 1
   java -cp src Assignment_1/ArrayMenu_Q1
   
   # Example: Run binary search from Assignment 2  
   java -cp src Assignment_2/BinarySearch_Q1
   
   # Example: Run stack menu from Assignment 3
   java -cp src Assignment_3/StackMenu_Q1
   ```

### IDE Setup
1. Open the project in your preferred IDE
2. Ensure the `src` folder is marked as the source root
3. Run individual Java files directly from the IDE

## 🎯 Learning Objectives

This repository covers the following key concepts:

- **Array Operations**: Basic array manipulations, searching, and sorting
- **Matrix Operations**: Various matrix types and their specialized operations
- **String Algorithms**: String manipulation and processing techniques
- **Stack Applications**: Stack-based problem solving and expression evaluation
- **Algorithm Analysis**: Understanding time and space complexity
- **Data Structure Implementation**: Building custom data structures

## 🤝 Contributing

This repository is for educational purposes. If you find any bugs or have suggestions for improvements:

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Submit a pull request

## 📜 License

This project is created for educational purposes as part of Data Structures coursework.

## 📧 Contact

For questions or clarifications about the assignments, please refer to your course instructor or teaching assistant.

---

*Happy Coding! 🚀*