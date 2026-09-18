public class September17 {
    public static void main(String[] args) {
        
    }

    
    public static boolean isLeapYear(int year){
        int length = String.valueOf(year).length();
        if(length >= 4){
            if(year % 4 == 0){
                if(year % 400 == 0){
                    return true;
                }
                if(year % 100 ==0){
                    return false;
                }
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
