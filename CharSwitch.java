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
           System.out.println("\n Pass "); 
           break;
          
           case 'f': 
           System.out.println("\n Fail "); 
           break;
          
           case 'i': 
           System.out.println("\n Incomplete "); 
           break;
          
           default: 
           System.out.println("\n Data Error "); 
           break;
       }
    
  }
}
