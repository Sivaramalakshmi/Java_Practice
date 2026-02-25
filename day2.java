package Java_Practice;

// Class name should start with capital letter and should be same as file name. 

// Variables - Named memory locations.A variable is a container that holds data that can be changed during the execution of a program. It has a name, a type, and a value.
// Data Types - The type of data that a variable can hold. Java has two categories of data types: primitive and reference types. Primitive data types include int, double, boolean, char, etc. Reference data types include String, array, etc.


              
                   // Primitive Data Types
// Data Types            Bytes                Desc
// byte                  1                   -128 to 127
// short                 2                   -32,768 to 32,767
// int                   4                   -2^31 to 2^31-1
// long                  8                   -2^63 to 2^63-1    
// float                 4                   6-7 decimal digits
// double                8                   15 decimal digits
// boolean               1                   true or false
// char                  2                   A single character



public class day2 {
    public static void main(String[] args) {

        int ticketPrice; // Variable declaration -> Data type variable name
        ticketPrice = 300; // Variable initialization (Assigning a value to the variable)
        System.out.println(ticketPrice);

        // Variable declaration and initialization in one line
        char grade = 'A';
        System.out.println(grade);

        boolean paid = true;
        System.out.println(paid);

        float pi = 3.14f; // Suffix 'f' is used to indicate that the value is a float literal
        System.out.println("The value of pi is: " + pi);

        System.out.println("--------------------------------------------------------------");



        //1.Swapping two numbers
        int a=5;
        int b =10;
        System.out.println("Before swapping : \n a = " +a + "\n b = " +b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : \n a = " +a + "\n b = " +b);

        System.out.println("--------------------------------------------------------------");



        //Simple Calculator
        int num1 = 20;
        int num2 = 10;  
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

         System.out.println("--------------------------------------------------------------");



}


}