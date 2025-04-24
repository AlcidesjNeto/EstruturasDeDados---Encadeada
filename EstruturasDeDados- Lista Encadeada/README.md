# Linked List Implementation

## Overview

This project is a simple implementation of a **Linked List** in Java, created as part of a classroom activity for the subject taught by Professor Fabrício at the **Universidade de Una Sete Lagoas**.

## Description

The project contains a generic linked list class (`ListaUniBH`) that supports basic operations such as:
- Insertion at the beginning and end of the list.
- Searching for an element in the list.
- Removing elements by value or index.
- Modifying elements.
- Checking if the list is empty.
- Retrieving the size of the list.

Additionally, the `Node` class represents each element in the list, storing a value and a reference to the next node in the list.

## What Was Done

- **Created a Linked List (`ListaUniBH`)**: A generic class that implements basic linked list operations, such as inserting, removing, modifying elements, and searching for a value.
- **Created a `Node` Class**: Each node holds a value and a reference to the next node in the list.
- **Error Handling**: Proper exception handling was implemented for cases such as accessing an invalid index or removing a non-existent item.
- **Unit Testing**: Basic testing was conducted to verify that the list operations work as expected (e.g., insertions, removals, and searches).

## What Has Been Made Available

- **Complete Source Code**: All the source code for the `Node` and `ListaUniBH` classes is available in the repository.
- **Linked List Operations**: The project contains methods for adding, removing, searching, and modifying elements in the linked list.
- **Example Usage**: An example showing how to use the `ListaUniBH` class to perform linked list operations.

## Key Features

- **Generic Type**: The linked list is designed to handle elements of any comparable type (i.e., elements that implement the `Comparable` interface).
- **Basic Operations**: Insertion, removal, modification, searching, and size calculation.
- **Error Handling**: The program raises appropriate exceptions when operations fail, such as when attempting to remove an element that doesn’t exist in the list.

## Classes

- `Node<T>`: Represents a node in the linked list. It stores a value of type `T` and a reference to the next node.
- `ListaUniBH<T>`: The linked list class that provides methods for inserting, removing, and modifying elements, as well as checking the list’s size and empty state.

## Usage

To use the linked list, instantiate the `ListaUniBH` class with a desired type, such as integers or strings. Here’s an example:

```java
public class Main {
    public static void main(String[] args) {
        ListaUniBH<Integer> list = new ListaUniBH<>();

        list.addAtBeginning(10);
        list.addAtEnd(20);
        list.addAtEnd(30);

        System.out.println("List size: " + list.size());
        list.removeByValue(20);

        System.out.println("List contains 20? " + list.search(20)); // Throws exception if not found
    }
}
