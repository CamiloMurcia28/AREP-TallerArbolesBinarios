# AREP-LAB06
LAB 06 - AREP

# Security Application Design

## Introduction

A binary search tree (BST) is a data structure that organizes data hierarchically, allowing for efficient insertion, deletion, and lookup operations. In a BST, each node contains a value, and it follows two key properties: 

- The value of every node in the left subtree is less than the value of the node itself. 
- The value of every node in the right subtree is greater than the value of the node itself. 
These properties ensure that search operations can be performed in O(log n) time on average, making BSTs an efficient choice for storing and retrieving ordered data

## Starting

The following instructions will allow you to get a working copy of the project on your local machine for development and testing purposes.

### Build with:
    
* [Git](https://git-scm.com) - Version Control System
* [java](https://www.oracle.com/java/technologies/downloads/#java22) - Programming Language

### Requirements:

#### ⚠️ Important

You need to have installed Git and Java 17 to be able to execute the proyect

## Project Summary

1. Insertion (insert) 

  Purpose: Adds a new node to the tree while maintaining the binary tree properties. 
  Details: This function takes a value as input and places the new node in the correct position based on its value compared to other nodes, ensuring that it follows the binary tree rules (for binary search trees, the left child is less than the parent, and the right child is greater). 
2. Search (search) 

  Purpose: Finds and returns a node containing a specific value. 
  Details: This function traverses the tree, comparing the target value with each node’s value. If it finds the value, it returns the node; otherwise, it returns null or indicates that the value is not present in the tree. 

3. Deletion (delete) 

  Purpose: Removes a node with a specified value from the tree while maintaining its structure and properties. 
  Details: This function involves three cases: 
  The node to be deleted is a leaf node (no children). 
  The node has only one child. 
  The node has two children. 
  In the third case, the function typically finds the in-order successor (the smallest node in the right subtree) or the in-order predecessor (the largest node in the left subtree) to replace the deleted node. 

4. Traversal Methods 

  Purpose: These functions are used to visit all the nodes in the tree in a specific order. 
  Types: 
  In-order Traversal (inOrderTraversal): Visits nodes in ascending order (left, root, right). For binary search trees, this produces a sorted sequence of values. 
  Pre-order Traversal (preOrderTraversal): Visits the root first, followed by the left subtree and then the right subtree (root, left, right). This is useful for creating a copy of the tree. 
  Post-order Traversal (postOrderTraversal): Visits the left and right subtrees before the root (left, right, root). This is helpful for deleting or freeing nodes. 

5. Find Minimum (findMin) 

  Purpose: Finds and returns the node with the smallest value in the tree. 
  Details: In a binary search tree, this is the leftmost node. 
  6. Find Maximum (findMax) 

  Purpose: Finds and returns the node with the largest value in the tree. 
  Details: In a binary search tree, this is the rightmost node. 
7. Height (height) 

  Purpose: Calculates and returns the height (or depth) of the tree, which is the number of edges from the root to the deepest leaf. 
  Details: This function helps determine the balance and efficiency of operations on the tree. 
  
8. Check if the Tree is Balanced (isBalanced) 

  Purpose: Determines if the tree is balanced, meaning the heights of the two child subtrees of any node differ by no more than one. 
  Details: A balanced tree ensures better performance for insertion, deletion, and search operations. 
9. Level-Order Traversal (levelOrderTraversal) 

  Purpose: Visits all nodes at each level of the tree, starting from the root, then level 1, level 2, and so on. 
  Details: This traversal is often implemented using a queue and is used for breadth-first search (BFS) operations. 
10. Clear (clear) 

  Purpose: Removes all nodes from the tree, making it empty. 
  Details: This function is useful for resetting or clearing the tree’s contents. 
11. Count Nodes (countNodes) 

  Purpose: Returns the number of nodes currently present in the tree. 
  Details: Useful for determining the size of the tree and for validating the correctness of operations. 

## Deployment Instructions

### Installation and Execution

To install and run this application locally, follow these steps:

1. Clone the repository:

```bash
git clone https://github.com/CamiloMurcia28/AREP-LAB06.git
cd AREP-LAB06
```

2. Run
   
## Tests

![image](https://github.com/user-attachments/assets/aa9c4998-e806-4100-9a1f-03305e26e591)

## Built With
    * Spring Boot - The backend framework
    * React - The frontend library
    * H2 Database Engine - Database
    * HTML - Markup Language
    * CSS - Style sheet language
    * JavaScript - Programming language and core technology of the Web
    * The Apache HTTP Server Project - Web Server
    * Maven - Dependency Management
    * npm - Package Manager for JavaScript

## Versioning

![AREP LAB BSTs](https://img.shields.io/badge/AREP_LAB_BSTs-v1.0.0-blue)

## Author

- Camilo Murcia Espinosa

## License

[![License: CC BY-SA 4.0](https://licensebuttons.net/l/by-sa/4.0/88x31.png)](https://creativecommons.org/licenses/by-sa/4.0/deed.es)

This project is licensed under the MIT License - see the [LICENSE](LICENSE) for details

## Acknowledgements

- To Professor [Luis Daniel Benavides Navarro](https://ldbn.is.escuelaing.edu.co) for sharing his knowledge.


