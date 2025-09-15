💻 DSA-Solutions by Alex Emon Halder

Welcome to my Data Structures and Algorithms (DSA) repository.
This repository contains my Java solutions to classic and interview-focused problems.
It is designed to showcase my problem-solving skills, coding patterns knowledge, and technical organization, making it recruiter-friendly.

Repository structure:

DSA-Solutions/
│
├── README.md                 # Main repository introduction
├── arrays/                   # Array-related problems
├── strings/                  # String manipulation problems
├── recursion/                # Recursion-based problems
├── dp/                       # Dynamic Programming problems
├── linkedlist/               # Linked List problems
├── stack/                    # Stack problems
├── queue/                    # Queue problems
└── patterns/                 # Notes and index of coding patterns (links to solutions)



> Each folder contains well-documented Java solutions with:
> - Problem description
> - Approach explanation
> - Time & space complexity

---

## 🏷 Topics & Skills Covered

- **Arrays:** Searching, sorting, prefix sum, two pointers, sliding window  
- **Strings:** Palindrome, substring, anagrams, string manipulation  
- **Recursion:** Factorial, Fibonacci, sum/count of digits, recursive techniques  
- **Dynamic Programming (DP):** Fibonacci, climbing stairs, knapsack problems  
- **Linked List:** Reverse, detect cycle, merge two sorted lists  
- **Stack:** Balanced parentheses, next greater element  
- **Queue:** Sliding window, circular queue problems  
- **Coding Patterns:** Two pointers, prefix sum, sliding window, recursion, etc. (Markdown notes in `patterns/` folder)

---


## 📌 Example Solution

```java
// Problem: LeetCode 26 - Remove Duplicates from Sorted Array
// Approach: Two Pointers
// Time Complexity: O(n), Space Complexity: O(1)

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}

```


## 🎯 Goals
1. Build a strong foundation in DSA and problem-solving  
2. Practice common coding patterns for technical interviews  
3. Maintain a professional and recruiter-friendly portfolio

---

## 🌟 Connect With Me
- GitHub: [alexemonhalder](https://github.com/alexemonhalder)  
- LinkedIn: [Alex Emon Halder](https://www.linkedin.com/in/alexemonhalder/)

> “Organized practice today leads to interview success tomorrow.”
