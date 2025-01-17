# Kotlin removeIf Function with Mutable Collections

This repository showcases an uncommon error related to the use of the `removeIf` function in Kotlin when dealing with mutable collections (Lists and Maps).  The `removeIf` function modifies the collection in place during iteration, causing unexpected behavior if the predicate alters the collection's size.

The `bug.kt` file demonstrates the issue, while `bugSolution.kt` presents a more robust solution.

## Problem

When using `removeIf` to remove elements based on a condition, it's essential to consider that the list is being modified *while* it is being iterated over.  This can lead to elements being skipped if the predicate causes elements to be removed.

## Solution

The suggested solution uses an iterator to safely remove elements, avoiding the potential for skipped elements.