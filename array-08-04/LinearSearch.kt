/*
Problem: Implement Linear Search

Example:
Input: [4, 2, 7, 1, 9], target = 7
Output: 2
*/

fun linearSearch(arr: IntArray, target: Int): Int {
    for (i in arr.indices) {
        if (arr[i] == target) {
            return i
        }
    }
    return -1
}

fun main() {
    val arr = intArrayOf(4, 2, 7, 1, 9)
    val target = 7

    val result = linearSearch(arr, target)

    if (result != -1) {
        println("Target found at index $result")
    } else {
        println("Target not found")
    }
}
