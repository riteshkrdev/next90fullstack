public class Practice1607 {
    public static void main(String[] args) {
        int num[] = new int[5];
        for(int i=0;i <num.length;i++){
            num[i] = i + 1;
            System.out.println(num[i]);
        }
        int evenCount = 0;
        String evenNo = "";
        int oddCount = 0;
        String oddNo = "";
        for(int i=0;i <num.length;i++){
         if(num[i] % 2 == 0){
            evenNo += num[i] + " ";
            evenCount += 1;
         }else{
            oddCount +=1;
            oddNo += num[i] + " ";
         }
         
        }
        System.out.println(evenCount + " " + evenNo + " " + oddCount + " " + oddNo);

        int transactions[] = {5000,0,1200,8000,0};

        int totalTractionAmt = 0;
        int countSuc = 0;
        int countFail = 0;
        int largestTran = transactions[0];
        String successfullTran = "";

        for(int i =0;i<transactions.length;i++){
            int currentTran = transactions[i];
            if(currentTran > 0){
                countSuc += 1;
                totalTractionAmt += currentTran;
                if(currentTran > largestTran){
                    largestTran = currentTran;
                }
                successfullTran += currentTran + ",";
            }else{
                countFail += 1;
            }
        }
        System.out.println("Total Amount: " + totalTractionAmt);
        System.out.println("Successfill Transaction: " + successfullTran);
        System.out.println("Successfull Transactions Count " + countSuc);
        System.out.println("Fail Transactions Count " + countFail);
        System.out.println("Largest Amount: " + largestTran);


    }
}
