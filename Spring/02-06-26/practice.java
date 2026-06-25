public class practice {
    public static void main(String[] args){
        // Level 1
        // Temprature converter
        double celsiusTemp = 38;
        double fahrenheitTemp = (celsiusTemp * 9/5) + 32;
        int result = (int) fahrenheitTemp;

        System.out.println("Result " + result + " Original " + fahrenheitTemp);

        double itemPrice = 499.99;
        int quantity = 3;
        double gst = 18.0/100;
        double finalBill = ((itemPrice * 3) * gst) + (itemPrice * 3);

        System.out.println(finalBill + " " + ((itemPrice * 3) * gst) + " " + (itemPrice * 3) + " " + gst);

        int i = 0;
        int sum = 0;
        while(i <= 100){
            sum += i;
            System.out.println(100 - i);
            if( i <=10){
                System.out.println(i * 7);
            }

            i++;
        }
        System.out.println(sum);

        int number = 1234569;
        int count = 0;
        if(number == 0){ 
            count++;
        }
        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.println(count);
     }

}
