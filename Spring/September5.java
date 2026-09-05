public class September5 {
    public static void main(String[] args){
        System.out.println(diff21(22));
        System.out.println(diff21(58));
       System.out.println(diff21(21));
        
    }
    
// The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
//  We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.


// sleepIn(false, false) → true
// sleepIn(true, false) → false
// sleepIn(false, true) → true
    public boolean WarmUpSleepIn(boolean weekday, boolean vacation){
        if(!weekday || vacation){
            return true;
        }  
        
        return false;
        
        
        // return !(weekday && vacation);
    }

//     We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
//  We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.


// monkeyTrouble(true, true) → true
// monkeyTrouble(false, false) → true
// monkeyTrouble(true, false) → false

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile){
        if(aSmile && bSmile){
            return true;
        }else if(!aSmile && !bSmile){
            return  true;
        }else{
            return false;
        }

    }

//     Given two int values, return their sum. Unless the two values are the same, then return double their sum.


// sumDouble(1, 2) → 3
// sumDouble(3, 2) → 5
// sumDouble(2, 2) → 8

              public int sumDouble(int a, int b){
                int sum = a + b;
                return a == b ? (2 * sum) : sum;
              }

              
// Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.


// diff21(19) → 2
// diff21(10) → 11
// diff21(21) → 0

public static int diff21(int n){
    int diff = Math.abs(21 - n );

    if(n > 21){
        diff = diff * 2;
    }

    return diff;

//     **Absolute difference** simply means the **distance** between two numbers on a number line.

// Distance can **never be negative**. It doesn't matter who is bigger or who comes first—you only care about how many steps separate them.

// ---

// ### Think of Walking Steps

// Imagine you are standing at step **21**:

// * If a friend is at step **19**, they are **2 steps** away from you.
// ($21 - 19 = 2$)
// * If a friend is at step **25**, they are **4 steps** away from you.
// ($25 - 21 = 4$)

// You wouldn't say your friend is "$-4$ steps away." Distance is always positive or zero.

// ---

// ### Regular Difference vs. Absolute Difference

// | Numbers | Regular Subtraction ($21 - n$) | Absolute Difference ($\vert{}21 - n\vert{}$) |
// | --- | --- | --- |
// | $n = 19$ | $21 - 19 = \mathbf{2}$ | $\mathbf{2}$ |
// | $n = 21$ | $21 - 21 = \mathbf{0}$ | $\mathbf{0}$ |
// | $n = 25$ | $21 - 25 = \mathbf{-4}$ | $\mathbf{4}$ |

// ---

// ### In Java Code

// In math, this is written with vertical bars: $\vert{}a - b\vert{}$.

// In Java, you can get the absolute difference in two ways:

// **1. Using `Math.abs()**`

// ```java
// int diff = Math.abs(21 - n); // Always turns negative results into positive

// ```

// **2. Using an `if` check (always subtract smaller from bigger)**

// ```java
// int diff;
// if (n > 21) {
//     diff = n - 21;  // Bigger minus smaller
// } else {
//     diff = 21 - n;  // Bigger minus smaller
// }

// ```
}
}


// 1. ```java
// public boolean WarmUpSleepIn(boolean weekday, boolean vacation) {
//     return !weekday || vacation;
// }

// ```

// ### Why this works:

// * The expression `!weekday || vacation` already produces a `true` or `false` result.
// * You do not need an `if-else` statement to return a boolean—just return the condition directly.

// *(Note: Keep using `!weekday || vacation` instead of `!(weekday && vacation)`, as the commented-out version produces the wrong result on standard school days.)*



//2. Your current logic is **already functionally correct**—it will pass all tests. However, it is overly verbose.

// ---

// ### 1. The Cleanest Fix (Single-Line Equality)

// Notice the pattern: you are in trouble whenever both monkeys are doing the exact same thing (both smiling or both not smiling). In Java, you can directly compare two booleans using `==`:

// ```java
// public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
//     return aSmile == bSmile;
// }

// ```

// * `true == true` $\rightarrow$ `true`
// * `false == false` $\rightarrow$ `true`
// * `true == false` $\rightarrow$ `false`

// ---

// ### 2. Combining the `if` Conditions (Single `return`)

// If you prefer keeping the explicit conditions rather than `==`, combine them into a single boolean expression without the `if/else` ladder:

// ```java
// public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
//     return (aSmile && bSmile) || (!aSmile && !bSmile);
// }

// ```

// ---

// ### Summary of What Was Redundant in Your Code

// * **Separate `if` and `else if` branches:** Both branches execute identical code (`return true`), so they can be merged with `||`.
// * **Explicit `if-else` for booleans:** Whenever a condition returns `true` when met and `false` when not, simply `return` the condition directly.



// STATIC OR NON STATIC METHODS CALLS
// In Java, the rule is simple: **A `static` method cannot directly call a `non-static` method.**

// To understand why, you just need to know what `static` actually means.

// ---

// ### The Blueprint vs. The Actual House

// Think of your class `September5` as an **architect's blueprint** for a house.

// * **`static` belongs to the blueprint itself.** It exists immediately when the program starts. You don't need to build a house to read the blueprint.
// * **`non-static` belongs to a specific house built from that blueprint.** It only exists *after* you physically construct the house in memory using `new`.

// ```
//            [ Blueprint: September5 ]
//             │
//             ├── static main(...)   <-- Exists immediately
//             │
//             └── (Needs an object to exist)
//                  └── non-static diff21(...)

// ```

// When Java starts your program, it immediately jumps into:

// ```java
// public static void main(String[] args)

// ```

// At this exact moment, **no `September5` object has been created yet**.

// If `main` tries to call `diff21()`, Java gets confused:

// > *"You're asking me to run `diff21()`, but that method belongs to an instance of `September5`, and no instance exists yet!"*

// This causes the classic compiler error:

// > `non-static method diff21(int) cannot be referenced from a static context`

// ---

// ### How to Fix It

// You have two standard options:

// #### Option 1: Make the helper method `static` (Best for utility/math problems)

// If the method doesn't need to store or read object data, mark it `static`. Now it belongs to the class itself, just like `main`:

// ```java
// public class September5 {
//     public static void main(String[] args) {
//         // Works! Both are static.
//         System.out.println(diff21(19)); 
//     }

//     public static int diff21(int n) {
//         return n > 21 ? (n - 21) * 2 : (21 - n);
//     }
// }

// ```

// #### Option 2: Create an object first (Object-Oriented way)

// If you want to keep `diff21` non-static, you must first create an instance of the class inside `main`:

// ```java
// public class September5 {
//     public static void main(String[] args) {
//         // 1. Build the object
//         September5 app = new September5();

//         // 2. Call the method through that object
//         System.out.println(app.diff21(19)); 
//     }

//     public int diff21(int n) {
//         return n > 21 ? (n - 21) * 2 : (21 - n);
//     }
// }

// ```

// ---

// ### Can Non-Static Call Static?

// **Yes, absolutely.**

// A non-static method (the built house) can always look up at the blueprint (`static` methods and variables). 
// It's only the reverse that is forbidden: the blueprint cannot automatically talk to a specific house unless you explicitly tell it which house (`new September5()`).