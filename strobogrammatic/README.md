# Strobogrammatic Number Checker

A Java program that checks whether a given number is a **strobogrammatic number** using a **two-pointer approach** and a `HashMap`.

A strobogrammatic number looks the same when rotated **180 degrees**.

## Problem

Given a string representing a number, determine whether it is strobogrammatic.

The valid digit rotations are:

- `0 → 0`
- `1 → 1`
- `8 → 8`
- `6 → 9`
- `9 → 6`

### Examples

```text
69   → true
88   → true
818  → true
962  → false
