/*
 * Name: Joey Solak
 * Date: 10/03/16
 * Class: CIT-130
 * Purpose Of The File: Test ADT Fraction Class
 */
package fraction;

import java.util.Scanner;

/**
 *
 * @author Joey Solak
 */
public class TestFraction {
    
    public static void main(String[] args) {
    
    //Declare Variables
    int num;
    int den;
    String finish = "Y";
    
    
    //Test Default Instance
    System.out.println("Test Default Constructor:");
    Fraction testD = new Fraction();
    System.out.println("Default Constructor set to " + testD + "\n");
    
    
    //Test 2 parameter override & compare - Get User Input
    System.out.println("Test 2 parameter Override & Compare ");
        Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Enter numerator for the target fraction: ");
        num = keyboard.nextInt();
    
    System.out.print("Enter denominator for the target fraction: ");
        den = keyboard.nextInt();
    System.out.println("");
    
    Fraction f1 = new Fraction(num,den);
    
    //Loop To Test Against First Fraction
    do {
    System.out.print("Enter numerator for the next fraction to test: ");
        num = keyboard.nextInt();
    
    System.out.print("Enter denominator for the next fraction to test: ");
        den = keyboard.nextInt();
    System.out.println("");
    
    Fraction f2 = new Fraction(num,den);
    
    //Test Equals
    if(f1.equals(f2)){
        System.out.println("The fraction you just entered equals the first fraction " + f1 + "\n");
    }
    else {
        System.out.println("The fraction you just entered does not equal the first fraction " + f1 + "\n");
    }
    
    //Ask User If They Would Like To Do This Again
    System.out.print("Would you like to continue (Y/N)? ");
    finish = keyboard.next();

    } while (finish.equals("Y") || finish.equals("y"));
    
    
    }   
}
