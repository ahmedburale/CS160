import java.util.Scanner;

class InputValidation {

   public static void main(String[] args){
       Scanner stdIn = new Scanner(System.in);
       char entry;
       do
       {
           System.out.println("Enter y for yes choice or n for n choice only, other characters are invalid");
           entry = stdIn.nextLine().charAt(0);
           //Validates the entry of y or n
           if(entry == 'y' || entry == 'n')
               //If it is y or n then break will take you out of the loop
               break;
       }
     while(true); //Repeats the prompt an indefinite number of times until input is either y or n. 
   }
  
}
