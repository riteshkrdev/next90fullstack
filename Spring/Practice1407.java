public class Practice1407 {

    public static void main(String[] args) {
        AgencyService customService = new AgencyService();

        customService.loadData();
        customService.displayAll();
        double totalAmount = customService.calculateTotalAllocatedAmount();
        System.out.println(totalAmount);

        int num[] = new int[5];

        num[1] = 6;
        System.out.println(num[1]);
    }
    
}

class Agency{
    int agencyCode;
    String agencyName;
    double allocatedAmount;

    void display(){
        System.out.println("Your Agency Name " + agencyName + ".Your agency code " + agencyCode + " and allocated amount is " + allocatedAmount);
    }
}

class AgencyService{
    Agency agency1 = new Agency();
    Agency agency2 = new Agency();

    void loadData(){
        agency1.agencyName = "Sun Tech";
        agency1.agencyCode = 2156;
        agency1.allocatedAmount = 25_00_00_000;

        agency2.agencyName = "Tezh Biz";
        agency2.agencyCode = 3258;
        agency2.allocatedAmount = 100_00_00_000;
    }

    void displayAll(){
        agency1.display();
        agency2.display();
    }

    double calculateTotalAllocatedAmount(){
        double totalAllocatedAmount = agency1.allocatedAmount + agency2.allocatedAmount;
        return totalAllocatedAmount;
    }


}
