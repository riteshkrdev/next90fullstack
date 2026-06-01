public class mainClass {
    public static void main(String[] arg){
        int a =10;
        int b = 25;

        System.out.println("Arthematic:" + (a + b));
        System.out.println("Modulous: " + (b % a));  // ===> why 5   

        a++;
        System.out.println(a);


        boolean check = (a > 5) && (b != 0);
        System.out.println(check);
    } 
}
