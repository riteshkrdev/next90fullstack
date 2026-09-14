public class September14 {
    public static void main(String[] args) {
        String result = positiveOrNegative(25);
        System.out.println(result);

        String result1 = positiveOrNegative(-25);
        System.out.println(result1);

        String result2 = positiveOrNegative(0);
        System.out.println(result2);

        // eliminate redundant(something is extra, unnecessary, or more than what you actually need) temporary variables.
        // System.out.println(positiveOrNegative(25));
        // System.out.println(positiveOrNegative(-25));
        // System.out.println(positiveOrNegative(0));
    }

    public static String positiveOrNegative(int num){
        return num > 0 ? "Positive": num == 0 ? "Zero" : "Negative";
    }
}
