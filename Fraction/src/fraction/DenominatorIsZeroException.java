/*
 * Name: Joey Solak
 * Date: 10/26/16
 * Class: CIT-130
 * Purpose Of The File: Add an exception for divide by zero to Fraction Class. 
 */
package fraction;

/**
 *
 * @author Joey Solak
 */
public class DenominatorIsZeroException extends Exception {
    
    //Constructors
    public DenominatorIsZeroException() {
        super("Division by Zero! Try Again");
                
    }

    public DenominatorIsZeroException(String message) {
        super(message);
    }
    
    
    
    


    
    
    


    
    
    
    
}
