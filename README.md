# Kotlin NullPointerException in filter operation on nullable list

This repository demonstrates a subtle NullPointerException that can occur when using the `filter` operation on a nullable list in Kotlin.  The issue arises when the list is null, even when using the safe call operator (`?.`) and providing a default value with the Elvis operator (`?:`).

The provided code demonstrates the problem and a solution.  The bug stems from the way Kotlin handles null values in the context of collection operations. 

## How to reproduce

1. Clone this repository.
2. Open `Bug.kt`
3. Run the code.

You will see a NullPointerException.

## Solution

The solution is provided in `BugSolution.kt`.