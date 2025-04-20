package classtest;

import java.util.Scanner;

public class ClassTest {

    public static void main(String[] args) {
        //Fibonacci Find
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Any number to Fnd Fibonacci");
        int userInput = s.nextInt();

        System.out.println("-------------------");

        int number1 = 0;
        int number2 = 1;
        int sum = 0;

        int totalSum = number2;//sob sum korte lagbe eta.

        System.out.println(number1);
        System.out.println(number2);

        for (int i = 2; i < userInput; i++) {
            sum = number1 + number2;
            System.out.println(sum);
  
            number1 = number2;
            number2 = sum;

            totalSum += sum;//Sob fibo sum korte lagbe eta.
        }

        System.out.println("Fibonacci of " + userInput + " is " + sum);
        System.out.println("----------------------");
        System.out.println("Total of all number is " + totalSum);

//        System.out.println(totalSum);
        //Max-Min Number
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter limit");
//        int size=s.nextInt();
//        
//       int[] numbers=new int[size];        
//        
//        for (int index = 0; index <size; index++) {
//            System.out.println("Enter Number "+(index+1));
//            int userInput=s.nextInt();
//            numbers[index]=userInput;
//        }
//      
//        
//           int maxNumber=numbers[0];
//        int minNumber=numbers[0];
//        
//     for(int number:numbers){
//          if (number > maxNumber) {
//                maxNumber = number;
//            }
//            
//            if(number < minNumber){
//                minNumber = number;
//            }
//        }
//   
//     
//        System.out.println("Max Number "+ maxNumber + "    And    Min Number is "+ minNumber);
        //Prime Number
//       Scanner s=new Scanner(System.in);
//        System.out.println("Enter Number");
//        int userInput=s.nextInt(); 
//        
//        
//        
//        int count = 0;
//        String prime="";
//        
//      if (userInput > 1) {
//
//            if (userInput > 0) {
//
//                for (int i = 1; i <= userInput; i++) {
//                    if (userInput % i == 0) {
//                        count++;
//                    }
//                }
//
//                if (count == 2) {
//                    prime=userInput+" is prime number";
//                    
//                } else {
//                    prime=userInput+" is not prime";
//                }
//            } else {
//                 prime=userInput+ " is negative number";
//            }
//
//        }
//      else {
//
//            if (userInput < 0) {
//                 prime=userInput+" is negative number";
//            } else {
//                 prime=userInput+ " is normal Number";
//            }
//
//        }
//      System.out.println(prime);
    }

}

//Max Min find
//Scanner s=new Scanner(System.in);
//        System.out.println("Enter limit");
//        int size=s.nextInt();
//        
//       int[] numbers=new int[size];        
//        
//        for (int index = 0; index <size; index++) {
//            System.out.println("Enter Number "+(index+1));
//            int userInput=s.nextInt();
//            numbers[index]=userInput;
//        }
//        System.out.println("My number are "+Arrays.toString(numbers));
//        
//           int maxNumber=numbers[0];
//        int minNumber=numbers[0];
//        
//     for(int number:numbers){
//          if (number > maxNumber) {
//                maxNumber = number;
//            }
//            
//            if(number < minNumber){
//                minNumber = number;
//            }
//        }
//     String message = "Max Number is "
//                + maxNumber + "\n"
//                + "Min Number is "
//                + minNumber;
//     
//        System.out.println(message);

