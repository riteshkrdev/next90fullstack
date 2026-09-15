public class September15 {
    public static void main(String[] args) {
        System.out.println(isEvenOrOdd(0));
        System.out.println(isEvenOrOdd(35));
        System.out.println(isEvenOrOdd(544));

        System.out.println(sumN(25));
        System.out.println(sumN(46340));
        System.out.println(sumN(46345));
        System.out.println(sumN(46325));

        System.out.println(sumN(4,25));
        System.out.println(sumN(46344,25));
    }

    public static String isEvenOrOdd(int n ){
        return n % 2 == 0 ? "Even" : "Odd";
    }
    // Pure logic: strictly returns a boolean, optimized with bitwise operators
    public static boolean isEven(int n) {
        return (n & 1) == 0; 
    }

    // Presentation logic: consumes the boolean to return a String
    public static String getParityText(int n) {
        return isEven(n) ? "Even" : "Odd";
    }
    // public static double sumN(int n){
    //     return (n * (n+1))/2.0;
    // }

    public static double sumN(int n){
        return (n * (n+1.0))/2;
    }

    public static double sumN(int f, int n){
        int sum = 0;
        for(int i=0; i <= n; i++){
            sum += f + i;
        }
        return sum;
    }

    public static double sumN(double f, int n) {
    // Converts to double immediately to prevent integer overflow
    return (n / 2.0) * (2.0 * f + n - 1);
    }   
}
