
package evidenceexampreparationmaxmin;

import java.util.Scanner;


public class EvidenceExamPreparationMaxMin {

  
    public static void main(String[] args) {
        //Max min Find
        Scanner s=new Scanner(System.in);
        System.out.println("Enter limit");
        int size=s.nextInt();
        
       int[] numbers=new int[size];        
        
        for (int index = 0; index <size; index++) {
            System.out.println("Enter Number "+(index+1));
            int userInput=s.nextInt();
            numbers[index]=userInput;
        }
      
        
           int maxNumber=numbers[0];
        int minNumber=numbers[0];
        
     for(int number:numbers){
          if (number > maxNumber) {
                maxNumber = number;
            }
            
            if(number < minNumber){
                minNumber = number;
            }
        }  System.out.println("Max Number "+ maxNumber + "    And    Min Number is "+ minNumber);
    }
    
}
