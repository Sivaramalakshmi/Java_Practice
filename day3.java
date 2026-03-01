package Java_Practice;

public class day3 {
    public static void main(String[] args) {

    //Operators - Symbols that perform operations on variables and values. 

    //Arithmetic Operators - Used to perform basic mathematical operations.

    //Type Casting.
    System.out.println("Type Casting:");
    int a=10;
    int b =4;
    float c = (float)(a)/(float)(b); 
    System.out.println(c);
    System.out.println("--------------------------------------------------------------");
    

    //Relational Operators - Used to compare two values and return a boolean result (true or false).
    System.out.println("Relational Operators:");
    int x = 5;
    int y= 10;
    System.out.println(x > y);
    System.out.println(x < y);
    System.out.println(x == y);
    System.out.println(x != y);
    System.out.println("--------------------------------------------------------------");

    //Logical Operators - Used to combine multiple boolean expressions and return a boolean result.
    System.out.println("Logical Operators:");
    boolean p = true;
    boolean q = false;
    System.out.println(p && q); 
    System.out.println(p || q);
    System.out.println(!p);
    System.out.println("--------------------------------------------------------------");

    //Assignment Operators - Used to assign values to variables.
    System.out.println("Assignment Operators:");
    int num = 10;
    num += 5; 
    System.out.println(num);
    num -= 3;
    System.out.println(num);
    num *= 2;
    System.out.println(num);
    num /= 4;
    System.out.println(num);
    System.out.println("--------------------------------------------------------------");

    // Increment and Decrement Operators - Used to increase or decrease the value of a variable by 1.
    System.out.println("Increment and Decrement Operators:");
    int f = 5;
    System.out.println(f++);
    System.out.println(f);
    int g = 5;
    System.out.println(++g);
    System.out.println(g);
    System.out.println("--------------------------------------------------------------");

    //Bitwise Operators - Used to perform bit-level operations on integer types.
    System.out.println("Bitwise Operators:");
    int m = 5;
    int n = 3;
    System.out.println(m & n); // Bitwise AND
    System.out.println(m | n); // Bitwise OR
    System.out.println(m ^ n); // Bitwise XOR
    System.out.println(~m); // Bitwise NOT
    System.out.println(m << 1); // Left shift
    System.out.println(m >> 1); // Right shift
    System.out.println(m >>> 1); // Right shift with zero fill
    System.out.println("--------------------------------------------------------------");

    //Ternary Operator - A shorthand for an if-else statement that returns a value based on a condition.
    System.out.println("Ternary Operator:");
    int age  =18;
    String result = (age>=18)?"Eligible to vote":"Not eligible to vote";
    System.out.println(result);
    System.out.println("--------------------------------------------------------------");

    //Even or Odd using Ternary Operator
    int number = 10;
    String res = (number%2 ==0)?"Even":"Odd";
    System.out.println(res);
    System.out.println("--------------------------------------------------------------");

    // Largest of three numbers using Ternary Operator
    int num1 = 15;
    int num2 = 20;
    int num3 = 25;
    String max = (num1 > num2 && num1 > num3) ? "num1 is the largest" : ((num2 > num1 && num2 > num3) ? "num2 is the largest" : "num3 is the largest");
    System.out.println(max);
    System.out.println("--------------------------------------------------------------");









    }
}