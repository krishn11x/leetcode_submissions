# 🏆 LeetCode 1650 - Lowest Common Ancestor of a Binary Tree III

## 📌 Problem

Given two nodes `p` and `q` in a binary tree, find their **Lowest Common Ancestor (LCA)**.

Each node contains a reference to its parent node.

---

## 💡 Approach

We use the **Two Pointer approach**, similar to finding the intersection of two linked lists.

- Start one pointer from `p`.
- Start another pointer from `q`.
- Move both pointers upward using the `parent` pointer.
- When a pointer reaches `null`, move it to the other starting node.
- Eventually, both pointers meet at the **Lowest Common Ancestor**.

This works because both pointers travel the same total distance.

---

## 💻 Java Solution

```java
class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        Node a = p;
        Node b = q;

        while (a != b) {
            a = (a == null) ? q : a.parent;
            b = (b == null) ? p : b.parent;
        }

        return a;
    }
}
