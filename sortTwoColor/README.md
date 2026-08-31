# Sort Two Colors — 0s and 1s

A simple Java program that sorts an array containing only **0s and 1s** using the **two-pointer approach**.

## 📌 Problem

Given an array containing only two colors represented by `0` and `1`, rearrange the elements so that:

* All `0`s come first
* All `1`s come after

### Example

**Input:**

```text
0 1 1 1 0 0 1 1
```

**Output:**

```text
0 0 0 1 1 1 1 1
```

## 💡 Approach

The program uses the **two-pointer technique**:

* `i` starts from the beginning of the array.
* `j` starts from the end of the array.
* If `nums[i]` is `0`, increment `i`.
* If `nums[i]` is `1`, swap `nums[i]` with `nums[j]` and decrement `j`.
* Continue until `i > j`.

This places all `0`s toward the left and all `1`s toward the right.

## 🔄 Algorithm

```text
i = 0
j = n - 1

while i <= j:
    if nums[i] == 0:
        i++
    else:
        swap(nums[i], nums[j])
        j--
```

## ⏱️ Complexity

| Complexity | Value    |
| ---------- | -------- |
| Time       | **O(n)** |
| Space      | **O(1)** |

The array is sorted **in-place**, so no additional array is required.

## 🧑‍💻 Code

```java
import java.util.*;

public class Main {

    public static void sortTwoColors(int nums[]) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            if (nums[i] == 0) {
                i++;
            } else {
                // Swapping nums[i] and nums[j]
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;

                j--;
            }
        }
    }

    public static void main(String[] args) {

        int nums[] = {0, 1, 1, 1, 0, 0, 1, 1};

        System.out.println("Before:");

        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
        System.out.println();

        sortTwoColors(nums);

        System.out.println("After:");

        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
```

## 📚 Concepts Used

* Arrays
* Two Pointers
* In-place Swapping
* Time and Space Complexity
* Java Methods

## ⚠️ Note

The current `for` loops use:

```java
i < nums.length - 1
```

This **does not print the last element** of the array.

To print the complete array, use:

```java
i < nums.length
```

So the output should ideally be:

```text
Before:
0 1 1 1 0 0 1 1

After:
0 0 0 1 1 1 1 1
```
