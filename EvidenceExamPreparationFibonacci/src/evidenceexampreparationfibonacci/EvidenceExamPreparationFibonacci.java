
package evidenceexampreparationfibonacci;

import java.util.Arrays;
import java.util.Scanner;


public class EvidenceExamPreparationFibonacci {


    public static void main(String[] args) {
      
          //Fibonacci Number
        Scanner n = new Scanner(System.in);
        System.out.println("Enter number to check Fibonacci Number");
        int input = n.nextInt();

        int[] fiboArray = new int[input];
        fiboArray[0] = 0;
        fiboArray[1] = 1;

        for (int i = 2; i <= fiboArray.length - 1; i++) {
            fiboArray[i] = fiboArray[i - 1] + fiboArray[i - 2];

        }
        System.out.println(Arrays.toString(fiboArray));
    }
    
}
