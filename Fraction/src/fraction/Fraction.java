/*
 * Name: Joey Solak
 * Date: 10/03/16
 * Class: CIT-130
 * Purpose Of The File: Create an ADT Fraction
 */
package fraction;

/**
 *
 * @author Joey Solak
 */
public class Fraction {

    private int numerator;
    private int denominator;

     /**
     *
     */
    
    //Default Constructor
    public Fraction() {
           numerator = 15;
           denominator = 16;
    }
    
    //Two parameter override constructor

    /**
     *
     * @param numerator
     * @param denominator
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     *
     * @return numerator gets numerator
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     *
     * @param numerator sets numerator
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     *
     * @return denominator gets denominator
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     *
     * @param denominator sets denominator
     */
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    /**
     *
     * @param f
     * @return if instances are equal
     */
    public boolean equals (Fraction f){
        return getNumerator()*f.getDenominator() == f.getNumerator()* getDenominator();
    }
    
    
    /**
     *
     * 
     * @return toString of Fraction Example: 1/2
     */
    @Override
    public String toString(){
      return numerator + "/" + denominator;  
    }

    
    
    
    
    
        
       
    
    


       
    
    
    
}
