public class Practice0307 {
    public static void main(String arr[]){
        Agency agency1 = new Agency();
        Agency agency2 = new Agency();

        agency1.agencyCode = "BR-CHAI-39";
        agency1.agencyName = "Danapur";
        agency1.amount = 10000000;

        agency1.displayAgency();

        agency2.agencyCode = "BR-DUOA-39";
        agency2.agencyName = "Patna";
        agency2.amount = 50000000;

        agency2.displayAgency();

    }
}

 class Agency{
        String agencyCode = "";
        String agencyName = "";
        int amount = 0;

        void displayAgency(){
            System.out.println("Agency Code " + agencyCode);
            System.out.println("Agency Name " + agencyName);
            System.out.println("Amount " + amount);
        }
    }