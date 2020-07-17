public class InputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter an integer: ");
        int myInt = input.nextInt();
        System.out.printf("You entered %d.%n%n", myInt);

        System.out.print("Enter a double: ");
        double myDouble = input.nextDouble();   
        System.out.printf("You entered %.2f.%n%n", myDouble);

        System.out.print("Enter a string: ");    
        input.nextLine();
        String myString = input.nextLine();
        System.out.printf("You entered \"%s\".%n%n", myString);

    }    
}
