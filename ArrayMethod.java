
import java.util.Arrays;

class ArrayClass{
    
    public void printFirstElement(int[] a) 
    { 
        System.out.println("The first element is " + a[0]); 
    }
    
    public int[] returnArray() 
    { 
        int[] a = new int[3]; 
        for (int i = 0; i < a.length; i++) 
        { 
            a[i] = i*2; 
        } 
        return a; 
    } 

    /*
    public void passPrimitive(int primitivePara)
    {
        primitivePara = 10;
        System.out.println("Value inside method = " + primitivePara);
    }

    public void passReference(int[] refPara)
    {
        refPara[1] = 5;
        System.out.println("Value inside method = " + refPara[1]);
    }
    */
}

public class ArrayMethodDemo {
    public static void main(String[] args) {

        MyClass amd = new MyClass();
        
        int[] myArray = {1, 2, 3, 4, 5}; 
        amd.printFirstElement(myArray);

        int[] myArray2 = amd.returnArray();
        System.out.println(Arrays.toString(myArray2));
        
        /*
        int number = 2;
        System.out.println("number before = " + number);
        amd.passPrimitive(number);
        System.out.println("number after = " + number);

        System.out.print("\n");

        System.out.println("myArray[1] before = " + myArray[1]);
        amd.passReference(myArray);
        System.out.println("myArray[1] after = " + myArray[1]);
        */
        
    }    
}
