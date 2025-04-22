package newquestion;

import java.util.Scanner;

public class NewQuestion {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("Enter number");
            int num = s.nextInt();

            if (num < 0) {
                System.out.println("Enter posative number");
               break;
            }
            sum += num;
            
            System.out.println("Sum of intiger is " + sum);

        }

        
        
        
        
        
        
        
        
//        Scanner s = new Scanner(System.in);
//
//        int sum = 0;
//
//        while (true) {
//            System.out.println("Enter number");
//            int num = s.nextInt();
//
//            if (num < 0) {
//                System.out.println("Enter posative number");
//               break;
//            }
//            sum += num;        
//        }
//          System.out.println("Sum of intiger is " + sum);
    }

}
