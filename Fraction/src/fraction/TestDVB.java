/*
 * Name: Joey Solak
 * Date: 10/26/16
 * Class: CIT-130
 * Purpose Of The File: Test Divide By Zero Exception
 */
package fraction;

import java.util.Scanner;

/**
 *
 * @author Joey Solak
 */
public class TestDVB {
    
    public static void main(String[] args){
        //Declare Variables
        int num = 1;
        int den = 1;
        int total;
        boolean validate = true;
        String finish = "Y";
        
        //Test Default Instance
        System.out.println("Test Divide By Zero Exception");
                
        //Initialize Scanner
        Scanner keyboard = new Scanner(System.in);
        
        
        do{
        
            try{
        System.out.print("Enter numerator for the target fraction: ");
        num = keyboard.nextInt();
    
        System.out.print("Enter denominator for the target fraction: ");
        den = keyboard.nextInt();
        System.out.println("");
        
            if (den == 0){
                throw new DenominatorIsZeroException();
            }
            total = num / den;
            validate = false;
            
            
            }
            catch (DenominatorIsZeroException e){
                System.out.println(e.getMessage());
                validate = true;
                
                
            }
       
        } while (validate == true);
        
        Fraction f1 = new Fraction(num,den);
        
        System.out.println("You did not receive a Division By Zero Error. Your fraction was: " + f1);
        
    }
    
    
    
    
    
}
