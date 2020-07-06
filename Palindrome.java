import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args){
   System.out.print("Enter any string : ");
        Scanner in = new Scanner(System.in);
          
        //Original string
        String origString = in.nextLine();
        int length = origString.length();
         
        boolean Palindrome = true;  
         
        for(int beginIndex = 0; beginIndex < length; beginIndex++){
            if(origString.charAt(beginIndex) != origString.charAt(length-1-beginIndex)){
                System.out.println("String is not a palindrome.");
                Palindrome = false;
                break;
            }
          
        }
      	
    	if(Palindrome)
      {
         System.out.println("String is a palindrome.");
      }      
	}
}
