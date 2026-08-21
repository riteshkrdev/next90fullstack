Yes. For this stage, **mixed problems are much better than isolated syntax exercises**. They force you to remember syntax while deciding *which concept to use*.

One correction to your example first: Java does **not** have string interpolation in the same sense as JavaScript. For now, use **string concatenation** (`"Age: " + age`) or `printf`.

Below are **30 problems**, arranged from easier combinations to harder ones. Each has a **goal, concepts, hints, and what you should think about**. I am intentionally **not giving solutions**.

# Mixed Java Practice — 30 Problems

## Level 1 — Basic combinations

### 1. Personal Information

Declare:

* `String name`
* `int age`
* `double salary`
* `char grade`
* `boolean isEmployee`

Print everything in a readable format.

**Concepts:** variables, data types, String concatenation.

**Hint:**

```java
System.out.println("Name: " + name);
```

**Think about:** Which values are primitive and which one is a reference type?

---

### 2. Salary Calculator

Create:

```text
salary = 45000
bonus = 5000
taxRate = 10%
```

Calculate the final salary after adding the bonus and subtracting 10% tax.

**Concepts:** `int`, `double`, arithmetic operators, casting.

**Hint:**

First calculate:

```text
gross salary = salary + bonus
```

Then:

```text
tax = gross salary × taxRate / 100
```

Then subtract the tax.

---

### 3. Age Checker

Create an `int age`.

Print:

* `"Child"` if below 13
* `"Teenager"` if 13–19
* `"Adult"` if 20 or above

**Concepts:** `if`, `else if`, relational operators.

**Hint:**

Think about the order:

```text
age < 13
age <= 19
otherwise
```

---

### 4. Even or Odd

Take an integer and determine whether it is even or odd.

**Concepts:** `%`, `if-else`.

**Hint:**

```text
number % 2
```

What does a remainder of `0` mean?

---

### 5. Positive, Negative, or Zero

Given:

```java
int number = -25;
```

Print:

```text
Positive
Negative
Zero
```

**Concepts:** `if-else if`, relational operators.

**Hint:** You need three possible outcomes.

---

## Level 2 — Increment, final and operators

### 6. Pre vs Post Increment

Predict the output **before running the program**:

```java
int x = 5;

int a = x++;
int b = ++x;
int c = x++;

System.out.println(x);
System.out.println(a);
System.out.println(b);
System.out.println(c);
```

Then run it and compare.

**Concepts:** pre/post increment.

**Hint:**

For every line ask:

> Does the variable change before or after its value is assigned?

---

### 7. Shopping Bill

Create:

```text
itemPrice = 1200
quantity = 3
discount = 10%
```

Calculate the final bill.

Then determine:

```text
isExpensive = finalBill > 3000
```

Print both the bill and the boolean.

**Concepts:** arithmetic, `double`, relational operators, boolean.

---

### 8. Final Maximum Score

Declare:

```java
final int MAX_SCORE = 100;
```

Create a score and check:

* If score is greater than `MAX_SCORE`, print `"Invalid"`
* Otherwise print `"Valid"`

**Concepts:** `final`, relational operator, `if`.

**Extra challenge:**

Try changing `MAX_SCORE` after declaration and observe the compiler error.

---

### 9. Login Check

Create:

```java
boolean isUsernameCorrect = true;
boolean isPasswordCorrect = false;
```

Allow login only when **both** are true.

**Concepts:** boolean, `&&`, `if`.

**Hint:**

```text
correct username AND correct password
```

---

### 10. Permission Checker

Create:

```java
boolean isAdmin;
boolean isManager;
boolean isActive;
```

Allow access when:

```text
user is active
AND
(user is admin OR manager)
```

**Concepts:** `&&`, `||`, boolean logic.

**Important:** Parentheses matter.

---

# Level 3 — Strings and switch

### 11. String Comparison

Create:

```java
String username = "Ritesh";
```

Check whether the username is `"Ritesh"`.

**Concepts:** String, `.equals()`, `if`.

**Hint:**

Use:

```java
username.equals(...)
```

Do **not** start with `==`.

---

### 12. String Manipulation

Given:

```java
String name = "Java Programming";
```

Print:

* length
* uppercase version
* lowercase version
* first character
* last character

**Concepts:** String methods, `length()`, `charAt()`.

**Hint:**

Last character:

```text
length - 1
```

---

### 13. Name Formatter

Given:

```java
String firstName = "Ritesh";
String lastName = "Kumar";
```

Create:

```text
Ritesh Kumar
```

Then create:

```text
KUMAR, Ritesh
```

**Concepts:** String concatenation, `toUpperCase()`.

---

### 14. Day Using String Switch

Create:

```java
String day = "Monday";
```

Use `switch` to print:

```text
Monday → Start of week
Tuesday → Work day
...
Saturday → Weekend
Sunday → Weekend
```

Include a `default`.

**Concepts:** String, switch, `case`, `break`, `default`.

**Hint:**

```java
switch (day) {
    case "Monday":
        ...
        break;
}
```

---

### 15. Number Using Switch

Create:

```java
int choice = 3;
```

Use a `switch`:

```text
1 → Add
2 → Subtract
3 → Multiply
4 → Divide
```

**Concepts:** `int` switch.

**Important:** This proves that `switch` is **not only for Strings**.

---

### 16. Calculator Switch

Create:

```java
double a = 20;
double b = 5;
char operator = '*';
```

Support:

```text
+ 
-
*
/
```

Use `switch` to perform the operation.

**Concepts:** `double`, `char`, switch, arithmetic.

**Extra challenge:** Handle division by zero.

---

# Level 4 — Loops

### 17. Print 1–20

Use a `for` loop to print numbers from 1 to 20.

Then modify it to print only even numbers.

**Concepts:** `for`, `%`.

**Hint:**

Don't create two completely different loops. Try changing the condition/body logically.

---

### 18. Sum of Numbers

Calculate:

```text
1 + 2 + 3 + ... + 100
```

using a loop.

**Concepts:** `int`, `for`, arithmetic.

**Hint:**

You need an accumulator:

```java
int sum = 0;
```

Then repeatedly add to it.

---

### 19. Multiplication Table

Given:

```java
int number = 7;
```

Print:

```text
7 × 1 = 7
7 × 2 = 14
...
7 × 10 = 70
```

**Concepts:** `for`, arithmetic, String concatenation.

---

### 20. Countdown

Print:

```text
10
9
8
...
1
Blast off!
```

**Concepts:** `for`, decrement.

**Hint:**

This time your update expression should decrease the variable.

---

# Level 5 — while, do-while, break, continue

### 21. Exit Code

Start with:

```java
int number = 1;
```

Use a `while` loop that keeps processing numbers until the number becomes `10`.

**Concepts:** `while`, relational operators, increment.

**Hint:**

Something inside the loop must eventually make the condition false.

---

### 22. Skip Multiples of 3

Print numbers from `1` to `30`, but don't print numbers divisible by `3`.

You **must use `continue`**.

**Concepts:** `for`, `%`, `continue`.

**Hint:**

```text
if divisible by 3
    continue
```

---

### 23. Stop at 17

Print numbers from `1` to `50`.

Stop completely when the number reaches `17`.

You **must use `break`**.

**Concepts:** loop, `break`, `if`.

**Think about:**

What's the difference between:

```text
continue at 17
```

and

```text
break at 17
```

---

### 24. Menu Loop

Create a `char choice`.

Use a `do-while` loop.

The program should continue until:

```text
q
```

is entered.

Possible commands:

```text
a → Add
v → View
d → Delete
q → Quit
```

**Concepts:** `char`, `do-while`, switch, break/condition.

**Hint:**

The condition could be based on:

```java
choice != 'q'
```

---

### 25. Number Guessing Logic

Set:

```java
int secret = 7;
int guess = 0;
```

Use a loop.

For each guess:

* if guess is lower → `"Too low"`
* if higher → `"Too high"`
* if equal → `"Correct"`

Stop when the answer is correct.

**Concepts:** loops, `if-else`, relational operators, `break`.

You can initially simulate guesses by changing a variable manually.

---

# Level 6 — Bitwise and binary

### 26. Bitwise AND/OR/XOR

Create:

```java
int a = 5;
int b = 3;
```

Calculate:

```java
a & b
a | b
a ^ b
```

Before running the code, write their binary representations.

**Concepts:** binary, bitwise operators.

**Hint:**

```text
5 = 0101
3 = 0011
```

Perform the operation **bit by bit**.

---

### 27. Left Shift Calculator

Start:

```java
int number = 5;
```

Calculate:

```java
number << 1
number << 2
number << 3
```

Predict all three answers first.

**Concepts:** binary, left shift.

**Hint:**

A left shift by one position effectively multiplies an integer by 2 when no overflow/sign complications are involved.

---

### 28. Right Shift Loop

Start with:

```java
int number = 64;
```

Repeatedly perform:

```java
number >> 1
```

until the number becomes `0`.

Count how many shifts occurred.

**Concepts:** `while`, right shift, comparison, increment.

**Hint:**

The loop condition should be based on whether `number` is still greater than `0`.

---

# Level 7 — Mixed problems

### 29. Employee Eligibility System

Create:

```text
age
salary
experience
isActive
```

An employee is eligible when:

```text
age >= 18
AND
experience >= 2
AND
salary >= 30000
AND
isActive == true
```

Print:

```text
Eligible
```

or:

```text
Not Eligible
```

**Concepts:** `int`, `double`, boolean, relational operators, logical `&&`, `if`.

**Extra challenge:**

Instead of one huge condition, print **why** the employee isn't eligible.

---

### 30. Master Control Program

This is the final exercise.

Create:

```java
String command;
int score = 0;
long value = 1;
final int MAX_SCORE = 10;
```

Simulate commands:

```text
"ADD"
"DOUBLE"
"SHIFT"
"SKIP"
"EXIT"
```

Rules:

* `"ADD"` → increment score
* `"DOUBLE"` → multiply `value` by 2
* `"SHIFT"` → left-shift `value`
* `"SKIP"` → use `continue`
* `"EXIT"` → use `break`
* Don't allow score to exceed `MAX_SCORE`
* At the end print all final values

Use a loop and `switch`.

**Concepts combined:**

* `String`
* `switch`
* `final`
* `int`
* `long`
* pre/post increment
* arithmetic
* bit shifting
* `if`
* `break`
* `continue`
* loop
* String concatenation

**Important:** Don't try to solve this immediately. Do **1–29 first**.

---

## How I recommend you practice these

Don't solve all 30 mechanically.

Use this pattern for **every question**:

1. **Read the problem**
2. **Don't look at the hint immediately**
3. Write the code yourself
4. If stuck for ~5 minutes, read the hint
5. Run the program
6. If it works, **change the input values**
7. Predict the output before running again
8. Explain to yourself *why* the output happened

For example, with #6, don't just run:

```java
int x = 5;
```

Also test:

```java
int x = 0;
```

and:

```java
int x = 10;
```

