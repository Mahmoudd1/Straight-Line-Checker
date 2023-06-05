# Straight-Line-Checker
This  algorithm determines whether a set of coordinates forms a straight line.
## Algorithm

The algorithm follows a simple approach to check if all the points lie on a straight line. It calculates the slope between the first and last coordinates and then compares the slope between each pair of adjacent points. If any pair has a different slope, it returns false, indicating that the points do not form a straight line. Otherwise, it returns true.

The algorithm consists of the following steps:

- Calculate the slope between the first and last coordinates using the returnSlope() method.
- Iterate through the remaining coordinates and calculate the slope between each pair using the returnSlope() method.
- If any calculated slope is different from the initial slope, return false.
- If all slopes are equal, return true.

## Example
Here's an example usage of the checkStraightLine() method:

```java
int[][] coordinates = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
boolean isStraightLine = checkStraightLine(coordinates);
System.out.println("Is straight line: " + isStraightLine);
```
**Output:**
```arduino
Is straight line: true
```

Certainly! Here's a sample README file for your "Straight Line Checker" algorithm:

Straight Line Checker
This is a Java solution to the LeetCode problem 1232. Check If It Is a Straight Line. The algorithm determines whether a set of coordinates forms a straight line.

Algorithm
The algorithm follows a simple approach to check if all the points lie on a straight line. It calculates the slope between the first and last coordinates and then compares the slope between each pair of adjacent points. If any pair has a different slope, it returns false, indicating that the points do not form a straight line. Otherwise, it returns true.

The algorithm consists of the following steps:

Calculate the slope between the first and last coordinates using the returnSlope() method.
Iterate through the remaining coordinates and calculate the slope between each pair using the returnSlope() method.
If any calculated slope is different from the initial slope, return false.
If all slopes are equal, return true.
Example
Here's an example usage of the checkStraightLine() method:

java
Copy code
int[][] coordinates = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
boolean isStraightLine = checkStraightLine(coordinates);
System.out.println("Is straight line: " + isStraightLine);
Output:

arduino
Copy code
Is straight line: true

## Complexity Analysis
The time complexity of the algorithm is O(n), where n is the number of coordinates. This is because the algorithm iterates through the coordinates once to calculate the slopes and compare them.
The space complexity is O(1) as it only uses a constant amount of additional space.
