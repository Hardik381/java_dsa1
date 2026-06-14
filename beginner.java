/*
 * beginner.java
 * Topic: Basic Java programming exercises
 * Concepts: I/O with Scanner, arithmetic, conditionals, swapping, control flow,
 * math utilities, temperature conversions, ASCII, and simple number checks.
 * How to run: javac beginner.java && java beginner
 * Notes: Interactive examples demonstrating core Java syntax and standard APIs.
 */
import java.util.Scanner;

public class beginner {
    public static void main(String[] args) {

        // Code to print hello world
        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);

        // Code to sum two numbers
        System.out.println("Enter the first number");
        int a = sc.nextInt();

        System.out.println("Enter the second number");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The sum is = " + sum);

        // Code to find the area of rectangle
        System.out.println("Enter the length of rectangle");
        int length = sc.nextInt();

        System.out.println("Enter the breadth of rectangle");
        int breadth = sc.nextInt();

        int area = length * breadth;
        System.out.println("The area of the rectangle is " + area);

        // Code to check if a number is odd or even
        System.out.println("Enter the number you want to check");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even " + number);
        } else {
            System.out.println("The number is odd " + number);
        }

        // Find greater among two numbers
        System.out.println("Enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("num1 is greater: " + num1);
        } else {
            System.out.println("num2 is greater: " + num2);
        }

        // Find greatest among three numbers
        System.out.println("Enter three numbers");
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();

        if (num3 > num4 && num3 > num5) {
            System.out.println("num3 is greatest");
        } else if (num4 > num5) {
            System.out.println("num4 is greatest");
        } else {
            System.out.println("num5 is greatest");
        }

        // Swap two numbers using third variable
        int c = 5;
        int d = 10;

        int temp = c;
        c = d;
        d = temp;

        System.out.println("After swapping using third variable:");
        System.out.println("The value of c is " + c);
        System.out.println("The value of d is " + d);

        // Swap two numbers without using third variable
        int swapA = 5;
        int swapB = 4;

        swapA = swapA + swapB;
        swapB = swapA - swapB;
        swapA = swapA - swapB;

        System.out.println("After swapping without third variable:");
        System.out.println("The value of swapA is " + swapA);
        System.out.println("The value of swapB is " + swapB);

        // Swap using XOR
        swapA = swapA ^ swapB;
        swapB = swapA ^ swapB;
        swapA = swapA ^ swapB;

        System.out.println("After XOR swap:");
        System.out.println("The value of swapA is " + swapA);
        System.out.println("The value of swapB is " + swapB);

        // Check whether the year is a leap year
        System.out.println("Enter the year you want to check");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("The year is a leap year");
        } else {
            System.out.println("The year is not a leap year");
        }

        // Square and cube of a number
        System.out.println("Square of 16 = " + Math.pow(16, 2));
        System.out.println("Cube of 2 = " + Math.pow(2, 3));

        System.out.println("Absolute value = " + Math.abs(-24));
        System.out.println("Floor value = " + Math.floor(4.5));
        System.out.println("Ceil value = " + Math.ceil(23.2));
        System.out.println("Maximum value = " + Math.max(25, 10.3));
        System.out.println("Minimum value = " + Math.min(200, 54.2));
        System.out.println("Rounded value = " + Math.round(2.5));

        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Random number = " + randomNumber);

        // Celsius to Fahrenheit
        System.out.println("Enter the temperature in Celsius");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.println("Temperature in Fahrenheit = " + fahrenheit);

        // Fahrenheit to Celsius
        System.out.println("Enter the temperature in Fahrenheit");
        double farhen = sc.nextDouble();

        double celci = (farhen - 32) * 5.0 / 9.0;
        System.out.println("Temperature in Celsius = " + celci);

        // Finding ASCII value of a character
        char ch = 'A';
        int ascii = (int) ch;

        System.out.println("The ASCII value is " + ascii);

        // Finding character from ASCII value
        int asciiNum = 33;
        char ch1 = (char) asciiNum;

        System.out.println("The ASCII character is " + ch1);

        // Check whether character is vowel or consonant
        System.out.println("Enter the character you want to check");
        char ch2 = sc.next().charAt(0);

        if (ch2 == 'a' || ch2 == 'A' ||
            ch2 == 'e' || ch2 == 'E' ||
            ch2 == 'i' || ch2 == 'I' ||
            ch2 == 'o' || ch2 == 'O' ||
            ch2 == 'u' || ch2 == 'U') {

            System.out.println("The given character is a vowel");
        } else {
            System.out.println("The given character is a consonant");
        }

        // Alternative vowel check
        if ("aeiouAEIOU".indexOf(ch2) != -1) {
            System.out.println("The given character is a vowel");
        } else {
            System.out.println("The given character is a consonant");
        }

        // Calculate Simple Interest
        double principal = 1000;
        double rate = 5;
        double time = 10;

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is " + simpleInterest);

        // Calculate Compound Interest
        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

        System.out.println("The Compound Interest is " + compoundInterest);

        sc.close();
    }
}