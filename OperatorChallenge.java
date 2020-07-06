
class OperatorChallenge 
{
  public static void main(String[] args) 
  {
    // Step1: Create a double variable with a value of 20.00
    double myFirstVar = 20.00d;
    
    // Step2: Create a second variable of type double with the value 80.00
    double mySecondVar = 80.00d;
    
    // Step3: Add both numbers together and multiply by 100.00
    double myTotalVar = (myFirstVar + mySecondVar) * 100.00d;
    
    System.out.println("MyValuesTotal = " + myTotalVar);
    
    /* 
    	Step4: Use remainder operator to figure out what the remainder fom the result of 
    			the operation in Step3 and 40.00. You can either use Modulus or Remainder
           		 operator on int or you can also use double.
    */
    double theRemainder = myTotalVar % 40.00d;
    System.out.println("theRemainder = " + theRemainder);
    
    /*
    	Step5: Create a boolean variable that assigns the value True if the remainder in #4 is 0, 
        		or False if it is NOT Zero. 
    */
    boolean isNoRemainder = (theRemainder == 0) ? true : false;
    //  Step6: Output the boolean variable 
        System.out.println("isNoRemainder = " + isNoRemainder);

    /*
    	Step7: Write an if-then statement that displays a message "Got some remainder" if the boolean 
        		in step5 is NOT True. Don't be surprised the output in this case, you might expect 
                nothing in the output. 
    */
        if (!isNoRemainder) 
        {
            System.out.println("Got some remainder");
        }   
  }
}
