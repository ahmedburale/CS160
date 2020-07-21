import java.util.Scanner;

public class CharSwitch {
  public static void main(String[] args) {
    //Declare Char variable 
       char code;
      
       //Declare input user
       Scanner stdIn = new Scanner(System.in);
      
       System.out.print("\n Enter Code: ");
       code = stdIn.next().charAt(0);
      
       //Switch declaration
       switch(code)
       {
         
           case 'p': 
           System.out.println("Pass"); 
           break;
          
           case 'f': 
           System.out.println("Fail"); 
           break;
          
           case 'i': 
           System.out.println("Incomplete"); 
           break;
          
           default: 
           System.out.println("Invalid Value"); 
           break;
       }
    
  }
}
