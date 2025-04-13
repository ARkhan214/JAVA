
package usernameandpassword;

import java.util.Scanner;


public class UserNameAndPassword {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String input=s.next();
        
        String[] names={"Atiq","Arif","Rakib","Easin"};
        int[] password={12,21,23,22};
        
        for (int i = 0; i < names.length; i++) {
            
            if (input.equalsIgnoreCase(names[i])) {
                System.out.println("enter Name");
              int  pass=s.nextInt(); 
              
            }
            if (pass.) {
                System.out.println("Congratulation ");
            }
        }
        
        
       
    }
    
}
