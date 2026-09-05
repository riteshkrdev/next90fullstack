import java.util.Scanner;

public class Practice0109{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int inputVar = scanner.nextInt();

        System.out.println(inputVar);

        if(inputVar > 10){
            System.out.println("Pay 15 rupees" + " " + inputVar);
        }
    }
}
