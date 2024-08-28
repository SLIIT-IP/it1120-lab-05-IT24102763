import java.util.Scanner;

public class IT24102763Lab5Q1 {
    public static void main(String[] args) {
        Scanner arp = new Scanner(System.in);
        
     
        System.out.println("Enter the first number:");
        int num1 = arp.nextInt();
        
        System.out.println("Enter the second number:");
        int num2 = arp.nextInt();
        
        System.out.println("Enter the third number:");
        int num3 = arp.nextInt();
         

         int snumber = Math.min(num1, Math.min(num2, num3));
         int lnumber = Math.max(num1, Math.max(num2, num3));


          
        
     
        System.out.println("The smallest number is: " + snumber);
        System.out.println("The largest number is: " + lnumber );
    }
}
