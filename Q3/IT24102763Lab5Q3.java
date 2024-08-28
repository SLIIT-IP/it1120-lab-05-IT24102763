import java.util.Scanner;

public class IT24102763Lab5Q3 {
    public static void main(String[] args) {
        final int ROOM_CHARGE = 48000; 
        Scanner arp = new Scanner(System.in);
        
        System.out.println("Enter the start date (day):");
        int startDate = arp.nextInt();
        
        System.out.println("Enter the end date (day):");
        int endDate = arp.nextInt();
        
        if (startDate < 1 || endDate > 31 || startDate >= endDate) {
            System.out.println("Invalid dates entered.");
            return;
        }
        
        int daysReserved = endDate - startDate;
        
       
        double discountRate = 0;
        if (daysReserved >= 3 && daysReserved <= 4) {
            discountRate = 0.10;
        } else if (daysReserved >= 5) {
            discountRate = 0.20;
        }
        
        
        double totalAmount = daysReserved * ROOM_CHARGE * (1 - discountRate);
        
        
        System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Total amount to be paid: Rs " + totalAmount);
    }
}
