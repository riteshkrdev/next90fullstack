This is an excellent approach. Structured, targeted practice that builds up complexity is the best way to master Java syntax and logic.

Here are **50 problems** designed exactly in the format you requested, grouped by topic and escalating difficulty.

---

### Level 1 — Variables and Data Types

**1. The Character Profile**

* **Declare:** `char grade = 'A'`, `boolean isPassing = true`, `int score = 95`.
* **Print:** A sentence combining these using string concatenation.
* **Concepts:** `char`, `boolean`, `int`, String concatenation.
* **Hint:** `System.out.println("Grade: " + grade + ", Passed: " + isPassing);`
* **Think about:** Why does `char` use single quotes but `String` uses double quotes?

**2. Big Data**

* **Declare:** `long population = 8000000000L`, `int cityPop = 1500000`.
* **Action:** Add them together and print the total.
* **Concepts:** `long`, `int`, arithmetic.
* **Hint:** You need the `L` suffix for large `long` literals.
* **Think about:** What data type must the result be to prevent overflow?

**3. Precision Matters**

* **Declare:** `double exactPrice = 19.99`, `int discount = 5`.
* **Action:** Subtract the discount from the price and print.
* **Concepts:** `double`, `int`, implicit casting.
* **Hint:** Java automatically promotes the `int` to a `double` during the math.
* **Think about:** What happens to the decimal precision?

**4. The Boolean Toggle**

* **Declare:** `boolean isLightOn = false`.
* **Action:** Print the value. Then, flip the value using the logical NOT operator (`!`) and print it again.
* **Concepts:** `boolean`, `!` operator.
* **Hint:** `isLightOn = !isLightOn;`
* **Think about:** How is this useful for creating on/off switches in UI?

**5. ASCII Math**

* **Declare:** `char letter = 'A'`.
* **Action:** Add 1 to the letter and print it.
* **Concepts:** `char`, integer arithmetic.
* **Hint:** `char nextLetter = (char)(letter + 1);`
* **Think about:** How are characters stored in memory? (Hint: They are just numbers underneath).

---

### Level 2 — Arithmetic and Modulo

**6. The Change Machine**

* **Declare:** `int totalCents = 234`.
* **Action:** Calculate and print how many dollars and how many leftover cents there are.
* **Concepts:** `/` (division), `%` (modulo).
* **Hint:** `totalCents / 100` gives dollars. `totalCents % 100` gives leftover cents.
* **Think about:** Integer division drops the decimal. How does modulo save the day?

**7. Time Converter**

* **Declare:** `int totalMinutes = 135`.
* **Action:** Convert this into hours and minutes (e.g., 2 hours, 15 minutes).
* **Concepts:** arithmetic, modulo, concatenation.
* **Hint:** Similar to problem 6, use 60 as your divisor.
* **Think about:** How would you format the output string cleanly?

**8. Average Calculator**

* **Declare:** `int math = 85`, `int science = 90`, `int history = 89`.
* **Action:** Calculate the exact average (including decimals).
* **Concepts:** arithmetic, casting.
* **Hint:** `(math + science + history) / 3.0`
* **Think about:** Why divide by `3.0` instead of `3`?

**9. Even or Odd (Without If)**

* **Declare:** `int number = 42`.
* **Action:** Create a `boolean isEven` that stores the result of checking if the number is even. Print the boolean.
* **Concepts:** `%`, relational `==`.
* **Hint:** `boolean isEven = (number % 2 == 0);`
* **Think about:** Relational operators evaluate directly to a boolean value.

**10. Digits Extractor**

* **Declare:** `int number = 123`.
* **Action:** Extract and print the last digit.
* **Concepts:** modulo.
* **Hint:** Any number `% 10` gives the last digit.
* **Think about:** How would you get the *first* digit?

---

### Level 3 — Relational and Logical If/Else

**11. Temperature Check**

* **Declare:** `double temp = 38.5`.
* **Action:** Print "Fever" if over 37.5, "Normal" otherwise.
* **Concepts:** `double`, `if/else`, `>`.
* **Hint:** `if (temp > 37.5)`
* **Think about:** Is the threshold inclusive or exclusive?

**12. The Bouncer**

* **Declare:** `int age = 17`, `boolean hasID = true`.
* **Action:** Print "Enter" only if age is 18 or older AND they have ID.
* **Concepts:** `if`, `&&` (AND).
* **Hint:** `if (age >= 18 && hasID)`
* **Think about:** What happens if `age` is 17? Does Java even check the `hasID` variable?

**13. Weekend Alarm**

* **Declare:** `boolean isSaturday = false`, `boolean isSunday = true`.
* **Action:** Print "Sleep in" if it's Saturday OR Sunday.
* **Concepts:** `||` (OR).
* **Hint:** `if (isSaturday || isSunday)`
* **Think about:** Only one condition needs to be true.

**14. Range Validator**

* **Declare:** `int score = 105`.
* **Action:** Print "Valid" if the score is between 0 and 100 (inclusive). Print "Invalid" otherwise.
* **Concepts:** `if/else`, `&&`, `>=`.
* **Hint:** `if (score >= 0 && score <= 100)`
* **Think about:** You cannot write `0 <= score <= 100` in Java. You must split it.

**15. VIP Discount**

* **Declare:** `double total = 150.0`, `boolean isVip = false`.
* **Action:** Apply a 10% discount if the total is over 100 OR they are a VIP.
* **Concepts:** `if`, `||`, math.
* **Hint:** Calculate discount, subtract from total, print.
* **Think about:** Logical OR prioritizes checking the first condition.

---

### Level 4 — Pre/Post Increments and Final

**16. The final Keyword**

* **Declare:** `final double PI = 3.14159`, `double radius = 5.0`.
* **Action:** Calculate the area (`PI * radius * radius`). Try to change `PI` to `3.0` on the next line.
* **Concepts:** `final`, compilation error.
* **Hint:** See what IntelliJ/Eclipse tells you when you try to reassign a `final` variable.
* **Think about:** Why do we make constants uppercase?

**17. Basic Incrementing**

* **Declare:** `int steps = 0`.
* **Action:** Add 1 to steps using post-increment, print it. Add 1 using pre-increment, print it.
* **Concepts:** `++x`, `x++`.
* **Hint:** `steps++;` vs `++steps;`
* **Think about:** On a line by themselves, they do the exact same thing.

**18. The Trap Assignment**

* **Declare:** `int a = 5`, `int b = a++;`.
* **Action:** Print `a` and `b`.
* **Concepts:** Post-increment execution.
* **Hint:** `b` gets the value *before* `a` increments.
* **Think about:** What is the value of `b`? (It should be 5, not 6).

**19. The Pre-Increment Math**

* **Declare:** `int x = 10`, `int y = ++x + 5;`.
* **Action:** Print `x` and `y`.
* **Concepts:** Pre-increment execution.
* **Hint:** `x` becomes 11 *before* 5 is added.
* **Think about:** How does this differ logically from problem 18?

**20. Decrement Countdown**

* **Declare:** `int timer = 3`.
* **Action:** Print `timer--` three times on three separate lines.
* **Concepts:** `x--` (post-decrement).
* **Hint:** `System.out.println(timer--);`
* **Think about:** It will print 3, then 2, then 1. Why not 2, 1, 0?

---

### Level 5 — Strings and Memory (Stack vs Heap)

**21. Basic Concatenation**

* **Declare:** `String first = "Java"`, `String second = "Rules"`.
* **Action:** Combine them with a space in the middle.
* **Concepts:** `+` operator.
* **Hint:** `first + " " + second`
* **Think about:** Strings are immutable. Concatenating creates a brand *new* String in the Heap.

**22. String Equality (The Trap)**

* **Declare:** `String s1 = "Hello"`, `String s2 = new String("Hello");`.
* **Action:** Compare them using `==` and print the boolean result.
* **Concepts:** Heap memory, Reference comparison.
* **Hint:** `System.out.println(s1 == s2);`
* **Think about:** Why is it false? (Hint: `==` checks if they point to the same memory address, not the same letters).

**23. Proper String Equality**

* **Declare:** Use `s1` and `s2` from Problem 22.
* **Action:** Compare them using `.equals()` and print the result.
* **Concepts:** `.equals()`, value comparison.
* **Hint:** `System.out.println(s1.equals(s2));`
* **Think about:** Always use `.equals()` for Strings!

**24. Stack vs Heap Mental Model**

* **Declare:** `int x = 10`, `String word = "Code"`.
* **Action:** Write a comment next to each variable explaining where it lives in memory.
* **Concepts:** Execution model.
* **Hint:** Primitives live on the Stack. Objects live on the Heap (with a reference pointer on the Stack).
* **Think about:** When a method ends, what happens to the Stack?

**25. Case Sensitivity**

* **Declare:** `String input = "quit"`.
* **Action:** Check if the input is equal to "QUIT", ignoring the case.
* **Concepts:** `.equalsIgnoreCase()`.
* **Hint:** `input.equalsIgnoreCase("QUIT")`
* **Think about:** How is this useful for user input in a terminal?

---

### Level 6 — Switch Statements (Int, Char, String)

**26. The Simple Int Switch**

* **Declare:** `int dayNumber = 3`.
* **Action:** Print "Wednesday". Handle 1-5.
* **Concepts:** `switch`, `case`, `break`.
* **Hint:** `switch (dayNumber) { case 1: ... }`
* **Think about:** What happens if you forget the `break;`?

**27. The Fall-Through (No Break)**

* **Declare:** `int month = 2`.
* **Action:** Group cases together. If 1, 2, or 3, print "Q1".
* **Concepts:** Fall-through logic.
* **Hint:** Put `case 1:`, `case 2:`, `case 3:` stacked on top of each other before the `println` and `break`.
* **Think about:** Sometimes omitting `break` is intentionally useful!

**28. Char Grade Switch**

* **Declare:** `char grade = 'B'`.
* **Action:** 'A' -> "Excellent", 'B' -> "Good", 'C' -> "Average". Add a `default` for invalid grades.
* **Concepts:** `char` switch, `default`.
* **Hint:** `case 'A':` (Note the single quotes).
* **Think about:** The `default` acts just like an `else` at the end of an `if` chain.

**29. The String Switch**

* **Declare:** `String command = "START"`.
* **Action:** Handle "START", "STOP", "PAUSE".
* **Concepts:** String in switch (Java 7+).
* **Hint:** `switch (command) { case "START": ... }`
* **Think about:** Under the hood, this uses `.equals()`, so it is strictly case-sensitive.

**30. Mixed Data Assignment in Switch**

* **Declare:** `String shape = "Circle"`; `double area = 0`. Create a `radius = 5`.
* **Action:** If "Circle", calculate area. If "Square", calculate area (assume `side = 5`).
* **Concepts:** Executing logic inside cases.
* **Hint:** You can write multiple lines of math inside a `case` before hitting `break`.
* **Think about:** Switches are for organizing logic flow, not just printing text.

---

### Level 7 — Loops (For, While, Do-While)

**31. The Classic For Loop**

* **Declare:** Nothing beforehand.
* **Action:** Print numbers 1 to 10.
* **Concepts:** `for` loop syntax (`init; condition; update`).
* **Hint:** `for (int i = 1; i <= 10; i++)`
* **Think about:** Where does `i` live? (Hint: It is destroyed after the loop finishes).

**32. Summing with For**

* **Declare:** `int sum = 0`.
* **Action:** Add numbers 1 through 5 to `sum`. Print `sum` at the end.
* **Concepts:** Accumulator variable.
* **Hint:** Inside the loop: `sum = sum + i;`
* **Think about:** Why must `sum` be declared *outside* the loop?

**33. The While Loop**

* **Declare:** `int power = 1`.
* **Action:** Multiply `power` by 2 until it is greater than 100. Print the final result.
* **Concepts:** `while`, unknown iteration count.
* **Hint:** `while (power <= 100) { power = power * 2; }`
* **Think about:** Use `while` when you don't know *how many times* it will loop.

**34. The Do-While Guarantee**

* **Declare:** `int attempts = 0`.
* **Action:** Print "Trying..." and increment attempts. Loop `while (attempts < 0)`.
* **Concepts:** `do-while` execution flow.
* **Hint:** `do { ... } while (attempts < 0);`
* **Think about:** Even though the condition is false immediately, it still prints once!

**35. Char Loop**

* **Declare:** Nothing beforehand.
* **Action:** Loop from `char c = 'a'` to `c <= 'e'`. Print each char.
* **Concepts:** `for` loop with `char`.
* **Hint:** `for (char c = 'a'; c <= 'e'; c++)`
* **Think about:** This works because chars are essentially integers representing ASCII values.

---

### Level 8 — Break, Continue, and Nested Logic

**36. Early Exit (Break)**

* **Declare:** Loop 1 to 20.
* **Action:** If the number equals 13, exit the loop completely.
* **Concepts:** `break`, `if` inside loop.
* **Hint:** `if (i == 13) { break; }`
* **Think about:** `break` instantly kills the closest enclosing loop.

**37. Skip It (Continue)**

* **Declare:** Loop 1 to 10.
* **Action:** If the number is 5, skip printing it, but print the rest.
* **Concepts:** `continue`.
* **Hint:** `if (i == 5) { continue; } System.out.println(i);`
* **Think about:** `continue` jumps immediately back to the update (`i++`) step.

**38. Find the First Multiple**

* **Declare:** Loop 1 to 100.
* **Action:** Find the *first* number divisible by both 7 and 9. Print it and stop.
* **Concepts:** `%`, `&&`, `break`.
* **Hint:** `if (i % 7 == 0 && i % 9 == 0)`
* **Think about:** Without `break`, it would find all of them.

**39. Skip Evens**

* **Declare:** Loop 1 to 15.
* **Action:** Print only odd numbers. Use `continue` to skip evens.
* **Concepts:** `%`, `continue`.
* **Hint:** `if (i % 2 == 0) { continue; }`
* **Think about:** Could you solve this by changing `i++` to `i += 2` instead? (Yes, and it's often better!)

**40. The Infinite While**

* **Declare:** `int count = 0`.
* **Action:** Write `while (true)`. Inside, increment count. `break` when count hits 5.
* **Concepts:** Infinite loops, manual breaks.
* **Hint:** `while (true)` runs forever until you force it to stop.
* **Think about:** This pattern is heavily used in game loops or server listeners.

---

### Level 9 — Bitwise Operators and Shifts

**41. Bitwise AND (&)**

* **Declare:** `int a = 12` (1100 in binary), `int b = 10` (1010 in binary).
* **Action:** Print `a & b`.
* **Concepts:** Bitwise AND.
* **Hint:** Compares bits. Both must be 1 to output 1. Result should be 8 (1000).
* **Think about:** How is `&` different from `&&`? (One is for bits, one is for booleans).

**42. Bitwise OR (|)**

* **Declare:** Use `a` and `b` from Problem 41.
* **Action:** Print `a | b`.
* **Concepts:** Bitwise OR.
* **Hint:** At least one bit must be 1. Result should be 14 (1110).
* **Think about:** Used often in combining configuration flags.

**43. Bitwise XOR (^)**

* **Declare:** `int a = 5`, `int b = 5`.
* **Action:** Print `a ^ b`.
* **Concepts:** Exclusive OR.
* **Hint:** Returns 1 only if the bits are *different*.
* **Think about:** Any number XORed with itself is exactly 0.

**44. Left Shift (Multiply)**

* **Declare:** `int x = 3`.
* **Action:** Print `x << 1` and `x << 2`.
* **Concepts:** Left bit shift.
* **Hint:** Shifts bits to the left, padding with 0s.
* **Think about:** Shifting left by 1 multiplies by 2. By 2 multiplies by 4.

**45. Right Shift (Divide)**

* **Declare:** `int y = 16`.
* **Action:** Print `y >> 1`.
* **Concepts:** Right bit shift.
* **Hint:** Shifts bits right.
* **Think about:** Shifting right divides by powers of 2.

---

### Level 10 — The Master Mixers

**46. The Accumulator Flag**

* **Declare:** `int sum = 0`, `boolean targetHit = false`.
* **Action:** Loop 1 to 20. Add to `sum`. If `sum` exceeds 50, set `targetHit = true` and `break`. Print both.
* **Concepts:** Combining loops, flags, breaks.
* **Hint:** `if (sum > 50)`
* **Think about:** How multiple concepts work perfectly together.

**47. Char Math and Switch**

* **Declare:** `char letter = 'A'`.
* **Action:** Pre-increment it (`++letter`). Pass it into a `switch`. If 'B', print "Success".
* **Concepts:** Pre-increment, char switch.
* **Hint:** `switch (++letter)`
* **Think about:** The increment happens *before* the switch evaluates.

**48. Bit Shift Loop**

* **Declare:** `int val = 1`.
* **Action:** Use a `while` loop. Left shift `val` (`val = val << 1`) until it is `>= 64`. Print how many loops it took.
* **Concepts:** while, bit shift, counters.
* **Hint:** Keep a `count` variable.
* **Think about:** You are manually calculating powers of 2.

**49. Short-Circuit vs Post-Increment**

* **Declare:** `int x = 5`, `int y = 10`.
* **Action:** Evaluate `if (x > 10 && y++ > 5)`. Print `y`.
* **Concepts:** Logical short-circuiting.
* **Hint:** Because `x > 10` is false, Java stops checking `&&`.
* **Think about:** Does `y` increment? (No, because the right side is ignored).

**50. The Final Boss**

* **Declare:** `long power = 2L`, `final long MAX = 1000L`, `String command = "DOUBLE"`.
* **Action:** Use a `do-while` loop. Inside, use a `switch(command)`. If "DOUBLE", use a left shift to double `power`. If `power` exceeds `MAX`, `break` the loop.
* **Concepts:** `long`, `final`, `String` switch, `do-while`, `break`, `<<`.
* **Hint:** `power = power << 1;` inside the switch case.
* **Think about:** This uses almost every concept you've learned. Build it one line at a time.
