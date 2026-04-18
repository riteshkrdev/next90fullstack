* **Time Complexity:** How many operations does the algorithm perform as $n$ increases?
* **Space Complexity:** How much extra memory (RAM) does the algorithm allocate as $n$ increases? (Note: We usually don't count the memory taken by the input itself, only the *extra* space used).

Here are the most common complexities you will encounter, from best to worst:

* **$O(1)$ - Constant:** The operation takes the same amount of time regardless of input size (e.g., accessing an array element by its index).
* **$O(\log n)$ - Logarithmic:** The input size is halved at each step (e.g., binary search). Highly efficient even for massive datasets.
* **$O(n)$ - Linear:** The time scales directly with the input size (e.g., looping through an array once).
* **$O(n \log n)$ - Linearithmic:** Common in efficient sorting algorithms like Merge Sort or Quick Sort.
* **$O(n^2)$ - Quadratic:** Time explodes as input grows. Usually the result of nested loops (e.g., Bubble Sort, or comparing every element in an array with every other element).



**Step 1: Unpack and Constrain (5 Minutes)**
Read the problem twice. Write down the inputs, the expected output, and the constraints.
* *Are there negative numbers?*
* *Can the array be empty?*
* *What are the time/space limits?* 

**Step 2: The Brute Force (The "Dumb" Solution)**
Never try to find the most optimal solution right away. It leads to mental gridlock. State the most obvious, naive way to solve it, even if it requires nested loops and has an $O(n^2)$ time complexity. Getting a working concept on paper builds momentum.

**Step 3: Identify the Bottleneck and Optimize (The Deep Work Phase)**
Analyze your brute-force solution. Why is it slow? 
* *Are you searching for the same item repeatedly?* -> Use a Hash Map to trade space for time, reducing $O(n)$ lookups to $O(1)$.
* *Are you sorting data unnecessarily?* -> Maybe you just need a max/min tracker.
* *Are you iterating multiple times when once would do?* -> Look into the Two-Pointer or Sliding Window techniques.

**Step 4: Dry Run with a Small Test Case**
Take a simple input (e.g., `n = 3` or an array of 4 items) and physically trace your optimized logic step-by-step. Keep track of your variables in a table. If your logic fails here, fix the logic. Do not write code to see if it works.

**Step 5: Code and Edge Cases**
Translate your verified logic into syntax. Because you already proved the logic in Step 4, any errors here are just typos or syntax issues, not fundamental flaws in your reasoning. Finally, test the code against edge cases (empty inputs, massive inputs, zeros).
