import java.util.Scanner;

public class IT24102763Lab5Q2 {
    public static void main(String[] args) {
        Scanner arp = new Scanner(System.in);
        

        System.out.println("Enter the number of new members introduced:");
        int newMembers = arp.nextInt();
        
        
        if (newMembers < 0) {
            System.out.println("Invalid number. It should be greater than or equal to 0.");
        } else {
            String prize;
            switch (newMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
            }
            
           
            System.out.println("The customer is entitled to: " + prize);
        }
    }
}

