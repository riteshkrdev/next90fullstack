Good. Since you've finished the fundamentals, don't practice with "add two numbers" type questions anymore.

As a developer, nobody pays you for writing `a + b`.
You get paid for converting business rules into code.

These 10 problems are similar to the kind of logic you'll see in Spring Boot services, backend validations, billing systems, HR systems, and admin portals.

---

# 1. Employee Bonus Calculator

A company gives annual bonuses using these rules:

* Salary < 30000 → 20% bonus
* Salary between 30000 and 70000 → 10% bonus
* Salary > 70000 → 5% bonus

Additional Rules:

* If employee worked more than 5 years → extra ₹5000
* If employee rating is below 3 → no bonus

### Input

```java
salary = 45000
years = 6
rating = 4
```

### Output

```java
Total Bonus = ?
```

### Concepts

* variables
* arithmetic
* if-else
* logical operators

---

# 2. E-Commerce Discount Engine

Apply discounts in this order:

* Cart value > ₹5000 → 10% discount
* Premium member → extra 5%
* Coupon available → extra ₹500 off

Discount cannot exceed 25%.

### Input

```java
cartAmount = 8000
isPremium = true
coupon = true
```

### Output

```java
Final Amount = ?
```

### Concepts

* arithmetic
* boolean
* logical operator
* nested if

---

# 3. Smart Electricity Bill Generator

Charges:

```text
0-100 units      = ₹5/unit
101-300 units    = ₹7/unit
Above 300 units  = ₹10/unit
```

Additional:

* If bill > ₹2000 add 18% GST.

### Input

```java
units = 350
```

Calculate final bill.

### Concepts

* if-else-if
* arithmetic
* type casting

---

# 4. Login Security System

User gets maximum 3 attempts.

Correct credentials:

```java
username = "admin"
password = "1234"
```

Rules:

* Login success → stop loop.
* After 3 failed attempts → account locked.

### Concepts

* while loop
* logical operators
* break

---

# 5. ATM Withdrawal Validation

Rules:

* Balance = ₹25000
* Minimum balance after withdrawal = ₹1000
* Withdrawal amount must be multiple of 100

### Input

```java
withdrawAmount
```

Display:

```java
Success
or
Invalid Amount
or
Insufficient Balance
```

### Concepts

* relational operators
* modulus operator
* if-else

---

# 6. Cab Fare Calculator

Fare rules:

```text
Base Fare = ₹50

First 5 km = ₹10/km
Next 10 km = ₹8/km
Above 15 km = ₹6/km
```

Additional:

* Night charge = 20%

Input:

```java
distance
isNight
```

### Concepts

* arithmetic
* nested if
* type conversion

---

# 7. Student Result Processing System

Subjects:

```java
Math
Science
English
Computer
Hindi
```

Rules:

* Calculate percentage.
* Any subject below 35 → Fail.
* Percentage ≥ 75 → Distinction
* ≥60 → First Division
* ≥45 → Second Division
* Otherwise Pass

### Concepts

* arithmetic
* if-else-if
* logical operators

---

# 8. Parking Fee Management

Vehicle Type:

```java
1 = Bike
2 = Car
3 = Bus
```

Fee:

```java
Bike = ₹20/hr
Car = ₹50/hr
Bus = ₹100/hr
```

Hours entered by user.

Use `switch`.

Calculate total fee.

### Concepts

* switch
* arithmetic
* variables

---

# 9. Loan Eligibility Checker

Rules:

```java
Age >= 21
Salary >= 30000
Experience >= 2 years
```

Additional:

If salary > 100000

```java
Eligible for Premium Loan
```

Otherwise

```java
Eligible for Standard Loan
```

Else

```java
Not Eligible
```

### Concepts

* logical operators
* nested if
* relational operators

---

# 10. Billing System (Closest to Real Backend Work)

A billing application receives:

```java
billAmount
customerType
```

Customer Types:

```java
1 = Regular
2 = Silver
3 = Gold
```

Discounts:

```java
Regular = 0%
Silver = 10%
Gold = 20%
```

Additional:

* Bill > ₹10000 → extra 5%
* Maximum discount = 25%

Show:

```java
Original Bill
Discount
Final Bill
```

### Concepts

* switch
* arithmetic
* if
* type conversion

---

## Challenge Problem (Most Valuable)

Build a **Mini Employee Payroll System**

Input:

```java
employeeName
salary
workingDays
totalDays
experience
rating
```

Requirements:

1. Calculate salary based on attendance.
2. Calculate bonus based on experience.
3. Deduct 10% tax if salary > 50000.
4. Rating < 3 → no bonus.
5. Print complete salary slip.

Output:

```java
Employee Name
Base Salary
Attendance Salary
Bonus
Tax
Net Salary
```

This single problem combines:

* Variables
* Data types
* Arithmetic operators
* Relational operators
* Logical operators
* If-Else
* Nested If
* Type Casting
* Ternary
* Switch (optional for employee grade)
* Loops (for multiple employees)

If you can solve all 10 without looking at solutions, you're ready to start learning **arrays and methods/functions**, which is where Java starts feeling like real software development rather than syntax practice.
