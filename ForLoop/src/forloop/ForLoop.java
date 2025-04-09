
package forloop;

import java.util.Scanner;


public class ForLoop {

   
    public static void main(String[] args) {
        
//        Scanner n= new Scanner(System.in);
//        
//        System.out.println("Enter number");
//        int input=n.nextInt();
//        
//        int count=0;
//        
//      if(input >1){
//          
//          if (input>0) {
//              
//              for (int i = 1; i <=input; i++) {
//          if (input%i==0) {
//                count++;
//            }            
//        }
//         
//            if (count==2) {
//                System.out.println("prime number");
//            }
//            else{
//                System.out.println("not prime");
//            }
//          }
//          
//          else{System.out.println(input+" negative number");}
//          
//      } 
//      
//      else{
//          
//          if (input<0) {
//              System.out.println(" negative number");
//          }
//          else{System.out.println(input+" is normal Number");}
//          
//          
//          }     
            
      
      
      
       Scanner n= new Scanner(System.in);
        
        System.out.println("Enter number");
        int input=n.nextInt();
        
        int count=0;      
          
          if (input!=1 || input!=0) {
              
              for (int i = 1; i <=input; i++) {
          if (input%i==0) {
                count++;
            }            
        }
         
            if (count==2) {
                System.out.println("prime number");
            }
            else{
                System.out.println("not prime");
            }
          }
          
          else{System.out.println(input+" normal number");}
          
      
      
//      else{
//          
//          if (input<0) {
//              System.out.println(" negative number");
//          }
//          else{System.out.println(input+" is normal Number");}
//          
//          
//          }
        }    
}
