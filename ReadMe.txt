Assignment# 6 Part 1
===========================================================================

Statement of Work:
Take existing Fraction class and add a Divide By Zero exception message.

Write a program to test it.
Example Output:

--------------------Configuration: <Default>--------------------
Please enter the numerator: 1
Please enter the denominator: 0
Denominator cannot be zero.
Please enter the numerator: 


This must be handled by DenominatorIsZeroException.java

==========================================================================

Pseudocode:
Create DenominatorIsZeroException.java class

Setup default constructor to extend Exception
super("Division By Zero! Try again")

Setup String constructor for, assign message
super(message)

Create TestDVB.java class

Loop while validate == true
Set up Scanner
Get Input

test denominator for 0
throw DenominatorIsZeroException

Write Message for End of Program



