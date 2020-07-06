
/*
MidTerm Project Title: Computer Part Builder 
Semester: Spring 2020
Course: CS 160


*	Construct a program that will help the user create a custom Desktop and Laptop. The user will only be able to input, 
	and it will be your task to orient the information in a visually aesthetic output. 
     
*	Output Requirement:
	- Must be formatted (printf)
    - Name
    - The price of every individual item
    - Total price of all component chosen
    
*	Technical Requirement: 
	- Minimum two classes (return and void method)
    	 1. A constructor 
         2. Overloaded methods and constructor
         
* 	Documentation: 
		1. Definition of problem
        2. Input/Output 
        3. Flowchart
        4. UML diagram
*/

import java.text.DecimalFormat;
import java.util.Scanner;

// Main class
public class ComputerBuilder {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in); // Scanner object to get user input
        System.out.print("Enter your name: ");
        String name = stdIn.nextLine();

        System.out.print("What type of computer do you want to buy [DESKTOP | LAPTOP] :");
        String type = stdIn.nextLine();
      
      
	// Switch statement for case DESKTOP|LAPTOP
        switch(type){
            case "DESKTOP" :
                System.out.print("\n\tEnter the brand: ");
                String brand = stdIn.nextLine();

                System.out.print("\tEnter the case Type [FULL TOWER | MINI TOWER ] : ");
                String tower = stdIn.nextLine();
                System.out.print("\t\nEnter the price: ");
                double p_tower = stdIn.nextDouble();

                System.out.print("\t\nEnter the cpu brand [ AMD | INTEL ] : "); // COMPILE ERROR Exception in thread "main": java.util.InputMistmatchException
                String cpuBrand = stdIn.nextLine();
                System.out.print("\t\nEnter the price: ");
                double p_cpuBrand = stdIn.nextDouble();

                System.out.print("\tEnter the cpu Speed: ");
                double cpuSpeed = stdIn.nextDouble();
                System.out.print("\t\tEnter the price: ");
                double p_cpuSpeed = stdIn.nextDouble();

                System.out.print("\tEnter the Hard Disk Capacity: ");
                double capacity = stdIn.nextDouble();
                System.out.print("\t\tEnter the price: ");
                double p_capacity = stdIn.nextDouble();

                System.out.print("\tEnter the Monitor Size : ");
                int display = stdIn.nextInt();
                System.out.print("\t\tEnter the price: ");
                double p_display = stdIn.nextDouble();
            
            
                Desktop desk = new Desktop(brand, tower, cpuBrand, cpuSpeed, capacity, display);
                desk.setP_capacity(p_capacity);
                desk.setP_case_type(p_tower);
                desk.setP_cpu_brand(p_cpuBrand);
                desk.setP_cpu_speed(p_cpuSpeed);
                desk.setP_display(p_display);
                System.out.println("\nNAME: " + name);
                desk.display();
                break;
            
            
            case "LAPTOP":
                System.out.print("\n\tEnter the brand: ");
                String L_brand = stdIn.nextLine();

                System.out.print("\tEnter the cpu brand [ AMD | INTEL ] : ");
                String L_cpuBrand = stdIn.nextLine();
                System.out.print("\t\tEnter the price: ");
                double L_p_cpuBrand = stdIn.nextDouble();

                System.out.print("\tEnter the cpu Speed: ");
                double L_cpuSpeed = stdIn.nextDouble();
                System.out.print("\t\tEnter the price: ");
                double L_p_cpuSpeed = stdIn.nextDouble();

                System.out.print("\tEnter the Hard Disk Capacity: ");
                double L_capacity = stdIn.nextDouble();
                System.out.print("\t\tEnter the price: ");
                double L_p_capacity = stdIn.nextDouble();

                System.out.print("\tEnter the Monitor Size : ");
                int L_display = stdIn.nextInt();
                System.out.print("\t\tEnter the price: ");
                double L_p_display = stdIn.nextDouble();

                Laptop laptop = new Laptop(L_brand, L_cpuBrand, L_cpuSpeed, L_capacity, L_display);
                laptop.setP_capacity(L_p_capacity);
                laptop.setP_cpu_brand(L_p_cpuBrand);
                laptop.setP_cpu_speed(L_p_cpuSpeed);
                laptop.setP_display(L_p_display);
                System.out.println("\nNAME: " +name);
                laptop.display();
                break;
        }
    }
}


// Desktop class
class Desktop{
    // Creating all the class variables
    private String brand;
    private String caseType;
    private String cpuBrand;
    private double cpuSpeed;
    private double hardDiskCapacity;
    private int displaySize;

    //different price variables;
    private double p_case_type = 0, p_cpu_brand = 0, p_cpu_speed = 0, p_capacity = 0, p_display = 0;
    private double Total;

    // Constructor with just brand value

     Desktop(String brand) {
        this.brand = brand;
    }


    // Overloaded Constructor 

    public Desktop(String brand, String caseType, String cpuBrand, double cpuSpeed, double hardDiskCapacity, int displaySize) {
        this.brand = brand;
        this.caseType = caseType;
        this.cpuBrand = cpuBrand;
        this.cpuSpeed = cpuSpeed;
        this.hardDiskCapacity = hardDiskCapacity;
        this.displaySize = displaySize;
    }


    // Creating all the getter and setter for all the private variables

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getCpuBrand() {
        return cpuBrand;
    }

    public void setCpuBrand(String cpuBrand) {
        this.cpuBrand = cpuBrand;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(double cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public double getHardDiskCapacity() {
        return hardDiskCapacity;
    }

    public void setHardDiskCapacity(double hardDiskCapacity) {
        this.hardDiskCapacity = hardDiskCapacity;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }

    public double getP_case_type() {
        return p_case_type;
    }

    public void setP_case_type(double p_case_type) {
        this.p_case_type = p_case_type;
    }

    public double getP_cpu_brand() {
        return p_cpu_brand;
    }

    public void setP_cpu_brand(double p_cpu_brand) {
        this.p_cpu_brand = p_cpu_brand;
    }

    public double getP_cpu_speed() {
        return p_cpu_speed;
    }

    public void setP_cpu_speed(double p_cpu_speed) {
        this.p_cpu_speed = p_cpu_speed;
    }

    public double getP_capacity() {
        return p_capacity;
    }

    public void setP_capacity(double p_capacity) {
        this.p_capacity = p_capacity;
    }

    public double getP_display() {
        return p_display;
    }

    public void setP_display(double p_display) {
        this.p_display = p_display;
    }

    public double getTotal() {
        return (this.p_capacity+ this.p_display + this.p_cpu_speed + this.p_cpu_brand + this.p_case_type);
    }


    // Display function to display the report
    public void display(){
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.printf("%50s%n", "DESKTOP --> { BRAND : " + this.brand + " }");

        System.out.println("\t-----------------------------------------------------------------------------------");
        System.out.printf("\t%-30s", "NAME");
        System.out.printf("t%-30s", "TYPE");
        System.out.printf("\t%-30s%n", "PRICE");
        System.out.println("\t-----------------------------------------------------------------------------------");

        System.out.printf("\t%-30s", "TOWER SIZE");
        System.out.printf("%-30s", this.caseType);
        System.out.printf("\t%-30s%n", "$"+df.format(this.p_case_type));

        System.out.printf("\t%-30s", "CPU BRAND");
        System.out.printf("%-30s", this.cpuBrand);
        System.out.printf("\t%-30s%n", "$"+df.format(this.p_cpu_brand));

        System.out.printf("\t%-30s", "CPU SPEED");
        System.out.printf("%-30s", this.cpuSpeed);
        System.out.printf("\t%-30s%n", "$"+df.format(this.p_cpu_speed));

        System.out.printf("\t%-30s", "DISPLAY");
        System.out.printf("%-30s", this.displaySize + " inch");
        System.out.printf("\t%-30s%n", "$"+df.format(this.p_display));

        System.out.printf("\t%-30s", "CAPACITY");
        System.out.printf("%-30s", this.hardDiskCapacity + " GB");
        System.out.printf("\t%-30s%n", "$"+df.format(this.p_capacity));

        System.out.println("\t-----------------------------------------------------------------------------------");
        System.out.printf("\t%-64s", "TOTAL");
        System.out.printf("%-30s%n", "$"+df.format(this.getTotal()));
        System.out.println("\n");
    }
}

// Laptop class
class Laptop{
    // Creating all the class variables
    private String brand;
    private String cpuBrand;
    private double cpuSpeed;
    private double hardDiskCapacity;
    private int displaySize;

    //different price variables;
    private double p_cpu_brand = 0, p_cpu_speed = 0, p_capacity = 0, p_display = 0;
    private double Total;
    // Constructor with just brand name


    public Laptop(String brand) {
        this.brand = brand;
    }

    // Constructor with all the details

    public Laptop(String brand, String cpuBrand, double cpuSpeed, double hardDiskCapacity, int displaySize) {
        this.brand = brand;
        this.cpuBrand = cpuBrand;
        this.cpuSpeed = cpuSpeed;
        this.hardDiskCapacity = hardDiskCapacity;
        this.displaySize = displaySize;
    }

    // GETTER AND SETTER FOR ALL THE VARIABLES

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCpuBrand() {
        return cpuBrand;
    }

    public void setCpuBrand(String cpuBrand) {
        this.cpuBrand = cpuBrand;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(double cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public double getHardDiskCapacity() {
        return hardDiskCapacity;
    }

    public void setHardDiskCapacity(double hardDiskCapacity) {
        this.hardDiskCapacity = hardDiskCapacity;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }

    public double getP_cpu_brand() {
        return p_cpu_brand;
    }

    public void setP_cpu_brand(double p_cpu_brand) {
        this.p_cpu_brand = p_cpu_brand;
    }

    public double getP_cpu_speed() {
        return p_cpu_speed;
    }

    public void setP_cpu_speed(double p_cpu_speed) {
        this.p_cpu_speed = p_cpu_speed;
    }

    public double getP_capacity() {
        return p_capacity;
    }

    public void setP_capacity(double p_capacity) {
        this.p_capacity = p_capacity;
    }

    public double getP_display() {
        return p_display;
    }

    public void setP_display(double p_display) {
        this.p_display = p_display;
    }

    public double getTotal() {
        return (this.p_capacity+ this.p_display + this.p_cpu_speed + this.p_cpu_brand);
    }

    // Display function to display the report
    public void display(){
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.printf("%50s%n", "LAPTOP --> { BRAND : " + this.brand + " }");

        System.out.println("\t-----------------------------------------------------------------------------------");
        System.out.printf("\t%-30s", "NAME");
        System.out.printf("%-30s", "TYPE");
        System.out.printf("\t%-30s%n", "PRICE");
        System.out.println("\t-----------------------------------------------------------------------------------");

        System.out.printf("\t%-30s", "CPU BRAND");
        System.out.printf("%-30s", this.cpuBrand);
        System.out.printf("\t%-30s%n", "$"+df.format(this.p_cpu_brand));

        System.out.printf("\t%-30s", "CPU SPEED");
        System.out.printf("%-30s", this.cpuSpeed);
        System.out.printf("\t%-30s%n", "$"+df.format(this.p_cpu_speed));

        System.out.printf("\t%-30s", "DISPLAY");
        System.out.printf("%-30s", this.displaySize + " inch");
        System.out.printf("\t%-30s%n", "$"+df.format(this.p_display));

        System.out.printf("\t%-30s", "CAPACITY");
        System.out.printf("%-30s", this.hardDiskCapacity + " GB");
        System.out.printf("\t%-30s%n", "$"+df.format(this.p_capacity));

        System.out.println("\t-----------------------------------------------------------------------------------");
        System.out.printf("\t%-64s", "TOTAL");
        System.out.printf("%-30s%n", "$"+df.format(this.getTotal()));
        System.out.println("\n");
    }
}

