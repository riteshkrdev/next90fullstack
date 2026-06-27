// # 1. Employee Bonus Calculator
// A company gives annual bonuses using these rules:
// * Salary < 30000 → 20% bonus
// * Salary between 30000 and 70000 → 10% bonus
// * Salary > 70000 → 5% bonus

// Additional Rules:
// * If employee worked more than 5 years → extra ₹5000
// * If employee rating is below 3 → no bonus

// ### Input
// salary = 45000
// years = 6
// rating = 4

// ### Output
// Total Bonus = ?
public class employeeBonus {
    
    public static void main(String a[]){
        int salary = 45_000;
        int workedYears = 6;
        int rating = 4;
    
        double bonus = 0;

        System.out.println(salary);
        System.out.println(workedYears);
        System.out.println(rating);
        System.out.println(bonus);

        if(salary > 70_000){
            bonus = salary * (5.0/100);
        }else if(salary <= 70_000 && salary >= 30_000){
            bonus = salary * (10.0/100);
        }else{
            bonus = salary * (20.0/100);
        }
        System.out.println(bonus);

if (workedYears > 5){
    bonus += 5000;
}

if(rating < 3){
    bonus = 0;
}
System.out.println(bonus);
    }
    
}

// static final int SENIOR_EMPLOYEE_YEARS = 5;
// static final int EXPERIENCE_BONUS = 5000;
// static final int MINIMUM_RATING = 3;

// static final int HIGH_SALARY_LIMIT = 70000;
// static final int MEDIUM_SALARY_LIMIT = 30000;

// Review:
// Code review as if this were production code.

// ### 1. Business Rule Priority Is Assumed, Not Explicit

// You have:

// ```java
// if (workedYears > 5){
//     bonus += 5000;
// }

// if(rating < 3){
//     bonus = 0;
// }
// ```

// This means:

// 1. Calculate percentage bonus
// 2. Add ₹5000
// 3. Remove everything if rating < 3

// Result: an employee with rating 2 gets **zero**, including losing the ₹5000 experience bonus.

// Is that what the requirement means?

// > If employee rating is below 3 → no bonus

// Most people would interpret this as **no bonus at all**, so your implementation is probably correct. But the rule should be clarified because another developer might interpret it differently.

// ---

// ### 2. Magic Numbers Everywhere

// ```java
// 70_000
// 30_000
// 5.0
// 10.0
// 20.0
// 5000
// 3
// 5
// ```

// In real projects these become constants.

// Example:

// ```java
// static final int EXPERIENCE_BONUS = 5000;
// ```

// Not a bug, but a maintainability issue.

// ---

// ### 3. Rating Validation Missing

// What happens if:

// ```java
// rating = -5;
// rating = 100;
// ```

// Your code accepts both.

// Real systems validate inputs.

// ---

// ### 4. Salary Validation Missing

// What happens if:

// ```java
// salary = -45000;
// ```

// Your code gives:

// ```java
// bonus = -9000
// ```

// which makes no business sense.

// ---

// ### 5. Years Validation Missing

// What happens if:

// ```java
// workedYears = -10;
// ```

// No validation.

// ---

// ### 6. Floating Point for Money

// ```java
// double bonus
// ```

// For learning purposes: fine.

// For real financial systems: avoid `double`.

// Floating point introduces precision errors.

// Real Java backend systems often use:

// ```java
// BigDecimal
// ```

// for money.

// ---

// ### 7. Unnecessary Initial Print Statements

// ```java
// System.out.println(salary);
// System.out.println(workedYears);
// System.out.println(rating);
// System.out.println(bonus);
// ```

// The last one always prints:

// ```java
// 0.0
// ```

// before any calculation.

// Looks like debugging code.

// ---

// ### 8. Two Separate `if`s Are Intentional But Easy to Misread

// ```java
// if (workedYears > 5){
//     bonus += 5000;
// }

// if(rating < 3){
//     bonus = 0;
// }
// ```

// This is not wrong.

// But a beginner might accidentally convert this to:

// ```java
// if (workedYears > 5){
//     bonus += 5000;
// }else if(rating < 3){
//     bonus = 0;
// }
// ```

// which changes behavior completely.

// Your current version is correct because both conditions must be checked independently.

// ---

// ### 9. Bonus Logic and Eligibility Logic Are Mixed

// You calculate bonus first and then determine eligibility.

// In real systems it is often clearer to check eligibility first:

// ```java
// if (rating < 3)
// ```

// before doing bonus calculations.

// Not a bug. Readability issue.

// ---

// ### 10. Boundary Conditions Look Correct

// You fixed:

// ```java
// salary <= 70_000 && salary >= 30_000
// ```

// Now:

// | Salary | Result |
// | ------ | ------ |
// | 29999  | 20%    |
// | 30000  | 10%    |
// | 70000  | 10%    |
// | 70001  | 5%     |

// Matches the stated rules.

// ---

// ### Verdict

// For the given requirements, the logic appears correct.

// The biggest production concerns are:

// 1. No input validation.
// 2. Using `double` for money.
// 3. Business-rule ambiguity around "no bonus".
// 4. Magic numbers.
// 5. Debug prints left in code.

// No logical bug is visible for the provided inputs. The program should produce the expected bonus according to the stated rules.
