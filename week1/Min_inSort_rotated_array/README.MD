This file contains the solution to the problem of finding the minimum element in a rotated sorted array.

When a sorted array is rotated, it gets divided into two parts. The goal is to find the smallest element efficiently.

For example, if we start with [0, 1, 2, 4, 5, 6, 7] and rotate it, we might get [4, 5, 6, 7, 0, 1, 2]. The minimum element here is 0.

The approach used here is a binary search. We compare the middle element with the rightmost element to decide whether the minimum lies in the left or right part of the array.

If the middle element is greater than the right one, we search in the right half. Otherwise, we search in the left half (including mid). We repeat this until we find the minimum.

The time complexity of this solution is O(log n) and it uses only constant extra space.
