Alright, let's skip the toy "add two numbers" stuff — here are 10 problems modeled on things that actually show up in real backend/business logic. Build each as a small Java class with a `main` method.

**1. E-commerce Discount Calculator**
A cart has `subtotal` (double), `customerType` (String: "REGULAR", "PREMIUM", "VIP"), and `couponCode` (String, can be null/empty). Apply discount rules using if-else and ternary: VIP gets 20%, PREMIUM 12%, REGULAR 5%. If a valid coupon "FEST50" is applied, add extra 10% but only if subtotal > 1000. Print final amount formatted to 2 decimal places using `String.format`. Practice: nested if-else, ternary, String comparison, formatting.

**2. ATM PIN & Withdrawal Validator**
Simulate ATM logic: balance = 15000 (double), enteredPin vs actualPin (int), withdrawal amount (int). Use a `do-while` loop to allow 3 PIN attempts before locking the card. Once PIN is correct, validate withdrawal: must be multiple of 100, can't exceed balance, can't exceed daily limit of 10000. Use relational + logical operators (`&&`, `||`, `%`).

**3. Employee Salary Slip Generator (type casting heavy)**
Given `basicSalary` as `int`, compute HRA (40% of basic), DA (10%), and PF deduction (12%), where percentages must be calculated using proper casting so you don't lose precision (int * double division pitfalls). Print gross and net salary. Practice: implicit/explicit casting, integer division traps.

**4. Grade Report Card with Switch**
Take marks for 5 subjects (int array or 5 variables), compute average, then use a `switch` on `(int) (average / 10)` to assign a grade (S, A, B, C, D, F) — handle the edge case of average = 100 falling into the same bucket as 90-99. Practice: switch with fall-through avoided properly, casting double to int for bucketing.

**5. Train Ticket Fare System**
Class type ("SLEEPER", "AC", "GENERAL"), distance in km, age of passenger, isTatkal (boolean). Use nested if-else and switch combined: base fare per class, senior citizen (age > 60) gets 10% discount unless Tatkal, child (age < 5) travels free. Practice: combining switch + if-else + logical operators meaningfully.

**6. Library Fine Calculator with Loop**
Book issued for `allowedDays`, returned after `actualDays` (simulate via a loop incrementing days till returned, like a countdown clock). Fine = ₹5/day for first 5 late days, ₹10/day after that (tiered, not flat — needs a loop, not just math). Practice: for/while loop with conditional accumulation logic.

**7. Number Pattern as a "Seating Arrangement" (Nested Loops)**
Print a theater seating chart: rows = 'A' to 'J' (use char arithmetic / casting char to int), each row has 10 seats, but rows F-J have a 15% "premium price" tag printed next to seat numbers. Practice: char-to-int casting, nested for loops, conditional formatting.

**8. Prime Number Checker for "OTP Validation Quirk"**
A fictional bank only accepts OTPs that are prime numbers. Write a method using a `while` loop (not for) to check primality of a 4-6 digit number efficiently (loop till √n, not till n). Then validate a list of OTPs and print which ones are accepted/rejected. Practice: while loop, relational operators, math.sqrt with casting.

**9. Loan EMI Eligibility Engine**
Inputs: monthlySalary (double), existingEMIs (double), requestedLoanAmount, tenureMonths, interestRate (annual %). Calculate EMI using the standard formula (needs `Math.pow`, careful double casting). Then check eligibility: total EMI (existing + new) shouldn't exceed 50% of salary — use logical operators to combine multiple rejection reasons and print *all* applicable rejection reasons (not just the first match — common real bug). Practice: arithmetic with Math.pow, multiple independent if checks (not else-if) for cumulative validation.

**10. Traffic Signal Simulator (do-while + switch state machine)**
Simulate a signal cycling RED → GREEN → YELLOW → RED using a `do-while` loop for `n` cycles (user input), with `switch` controlling transition and a fixed timing per color printed each cycle. Add a twist: every 4th cycle, signal stays GREEN for double the time (simulate "peak hour"). Practice: do-while with switch, modulo for cyclic counters.

---

A tip from experience: don't just solve these — for each one, ask "what's the edge case that breaks this?" (negative amounts, zero distance, salary = 0, etc.) and add validation. That habit is what actually separates someone who can code from someone who can ship.

Want me to give expected sample inputs/outputs for any of these so you can self-check your solutions?