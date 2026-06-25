If you want to break into the top 1% and command that 1 Crore salary, you have to realize that companies don't pay for people who just know syntax. They pay for engineers who can translate messy business requirements into bulletproof logic. To bridge the gap from frontend to a heavy Spring Boot backend, we bypass tutorial hell entirely. We build muscle memory through 100% typed code.

Open your IDE, create a `main` method, and write out the solutions for these 10 real-world backend scenarios. Use only the primitives, operators, and control flows you just studied.

### 1. Enterprise Revenue Projection (Variables, Primitives & Literal Formatting)

**The Context:** You are building a financial dashboard that tracks large enterprise contracts.
**The Task:** Define a company's Annual Recurring Revenue (ARR) of 45.5 million rupees using an `int` or `long`. You must use underscore literal formatting (e.g., `1_000`) for readability. Define an expected year-over-year growth rate of 18.5%. Calculate the projected revenue for next year and store it in a variable. Print the result.

### 2. The Legacy DB Truncator (Type Conversion & Casting)

**The Context:** A modern third-party IoT temperature sensor sends high-precision readings to your Spring Boot API, but your legacy database column only accepts whole numbers.
**The Task:** Define a `double` variable with a value of `38.9745`. The business rule dictates we *truncate* the decimals, not round up. Use explicit casting to convert this down to an `int`. Print both the raw sensor data and the database-ready integer to prove the precision was safely dropped.

### 3. The Application Filter (Relational & Logical Operators)

**The Context:** You are writing the backend logic that automatically filters candidates applying for a remote Full Stack role.
**The Task:** Define `yearsOfExperience` (int), `knowsJava` (boolean), and `knowsAngular` (boolean). Write a single boolean expression assigned to a variable called `isShortlisted`. A candidate is shortlisted ONLY IF they have greater than or equal to 2 years of experience AND they know both Java AND Angular. Print the boolean result.

### 4. API Pagination Limits (Ternary Operator)

**The Context:** The Angular frontend sends a GET request to your API for a list of users, passing a `pageSize` parameter.
**The Task:** Users and frontends can be unpredictable. Define an `int` called `requestedPageSize` (set it to 500). Using **only** the ternary operator, write logic that checks if the requested size is greater than 100. If it is, clamp the `actualPageSize` to a maximum of 100. If it isn't, use the requested size.

### 5. The Checkout Engine (Nested If, Else If, Else)

**The Context:** Processing an e-commerce cart total before passing it to a payment gateway.
**The Task:** Define `cartValue` (double) and `hasPromoCode` (boolean).

* If the cart is over ₹5000, shipping is free.
* *Nested inside this:* If they also have a promo code, apply a flat ₹500 discount to the cart.


* Else if the cart is between ₹2000 and ₹5000, add a ₹100 shipping fee.
* Else (under ₹2000), add a ₹250 shipping fee.
Calculate and print the final payable amount.

### 6. Webhook Event Router (Switch Statement)

**The Context:** Stripe or Razorpay sends an asynchronous webhook to your backend with a single character code representing a transaction status.
**The Task:** Define a `char` variable `eventCode`. Use a `switch` statement to handle the routing:

* 'P' prints "Triggering Payment Success Email"
* 'F' prints "Initiating Retry Protocol"
* 'R' prints "Processing Refund in Ledger"
* Include a `default` case that prints "Unknown Event: Logging to Security Audit".

### 7. Core Three Protocol Verifier (Combined Logic)

**The Context:** You are building the backend for a high-performance habit-tracking application that logs a strict daily protocol.
**The Task:** Define variables for `pushups` (int), `codingMinutes` (int), and `stretchingMinutes` (int).

* Print "Protocol Conquered" ONLY IF `pushups` are exactly 50, `codingMinutes` are greater than or equal to 120, AND `stretchingMinutes` are greater than or equal to 15.
* Print "Critical Failure: Zero Code" if `codingMinutes` is exactly 0.
* Otherwise, print "Day Incomplete: Keep Pushing".

### 8. The Amortization Engine (For Loop)

**The Context:** A fintech app needs to generate a quick 6-month projection of a loan balance.
**The Task:** Start with a `principal` of ₹100,000. Write a `for` loop that iterates exactly 6 times. Inside the loop, apply a 1.5% monthly interest rate to the current principal, subtract a fixed monthly payment of ₹15,000, and print the remaining balance at the end of each month iteration.

### 9. Microservice Exponential Backoff (While Loop)

**The Context:** Your Spring Boot app is trying to fetch data from an external API that is temporarily down. You need to simulate a retry mechanism.
**The Task:** Initialize an `int retryCount` at 0 and an `int delayMs` at 100. Create a `while` loop that runs as long as `retryCount` is less than 5. Inside the loop, multiply `delayMs` by 2 (simulating exponential backoff), print "Attempt failed, next delay: [delayMs] ms", and increment the `retryCount`.

### 10. The Asynchronous Poller (Do-While Loop)

**The Context:** Your code triggered a background job to generate a massive PDF report, and your thread needs to poll the database to see if it's done.
**The Task:** Define an `int pollCount` at 0. Write a `do-while` loop. Inside the loop, print "Checking database for report status...", and increment `pollCount`. The loop should continue executing *while* `pollCount` is less than 3 (simulating that the report finally finishes on the 3rd check).

---

Write it all from scratch. Do not copy-paste. Build the logic block by block.