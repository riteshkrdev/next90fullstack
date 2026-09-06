public class September06 {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Ritesh Kumar");

//         We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. 
// We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.


// parrotTrouble(true, 6) → true
// parrotTrouble(true, 7) → false
// parrotTrouble(false, 6) → false




    }

    public static boolean parrotTrouble(boolean speaking, int hourNumber){
        // talking - true and hour is  < 7 or > 20
        if(speaking){
            if(hourNumber < 7 || hourNumber > 20){
                return true;
            }}
            return false;
    }
}
