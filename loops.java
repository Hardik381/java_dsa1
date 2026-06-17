/*
 * loops.java
 * Topic: Loops & iterative algorithms
 * Concepts: for/while loops, factorial, palindrome checks, Fibonacci, GCD/LCM,
 * automorphic/happy/armstrong checks, and other iterative problems.
 * How to run: javac loops.java && java loops
 * Notes: Interactive prompts used; inputs are read via `Scanner` for several
 * examples.
 */
import java.util.*;
public class loops {
   public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);

    System.out.println("enter the number");

    // printing number from 1 to n
    int n=sc.nextInt();
    for(int i=0;i<=n;i++){
        System.out.print(i+" ");

    }

    System.out.println();

    //printing number from n to 1
    for(int i=n;i>=0;i--){
        System.out.print(i+" ");
    }

    System.out.println();

    //sum of first n natural numbers

    int sum=0;
    for(int i=0;i<=n;i++){
        sum+=i;
    }
    System.out.println("the sum of n numbers are "+ sum);

    //finding the factorial of a number

    int fact=1;
    for(int i=n;i>0;i--){
        fact*=i;
    }
    System.out.println("the fact of a given number is "+fact);

    //print the multiplication table of a number

    for(int i=1;i<=10;i++){
        System.out.println(n+" * "+i+" = "+ n*i);
    }

    //count the number of digits in a number

    int original=2453011;
    int copy=original;
    int digits=0;

    while(copy>0){
        int quotient = copy/10;
        int remainder = copy%10;
        System.out.println(remainder);
        copy=quotient;
        digits++;
    }
    System.out.println("the number of digits are "+ digits);

    //reverse a number , sum of all the digits of a number and product of digits
    int number=1234;
    int cpy=number;
    int sumUp=0;
    int product=1;
    int reverse=0;
    while(cpy>0){
        int quotient=cpy/10;
        int remainder=cpy%10;
        cpy=quotient;
        reverse=reverse*10 + remainder;
        sumUp+=remainder;
        product*=remainder;
    }
    System.out.println("after reversing the number is "+reverse);
    System.out.println("The sum of the digits of a number is "+sumUp);
    System.out.println("The product of the digits of a number is "+product);

    //check weather a number is palindrome or not
    if(reverse==number){
        System.out.println("the number is palindrome");
    }
    else System.out.println("the number is not palindrome");

    // To reverse a string and checking either its palindrome or not

    String str="madam";
    String rvrString="";
    for(int i=str.length()-1;i>=0;i--){
        rvrString+=str.charAt(i);
    }
    System.out.println("the reverse of a given string is "+rvrString);
    if(str.equals(rvrString)){
        System.out.println("the given string is palindrome");
    }
    else System.out.println("the given string is not palidnrome");

    //check weather the number is armstrong or not

    System.out.println("Enter the number you want to check is armstorng or not");
    int armstrong=sc.nextInt();
    String armstrongStr=String.valueOf(armstrong);
    int armstrongDigits=armstrongStr.length();
    int armstrongSum=0;
    int armstrongCopy=armstrong;
    System.out.println("Enter the number you want to check is armstrong or not");
    if(armstrongDigits==1){
        System.out.println("the number is Armstrong");
    }

    while(armstrongCopy>0){
        int quotient=armstrongCopy/10;
        int remainder=armstrongCopy%10;
        armstrongCopy=quotient;
        armstrongSum+=Math.pow(remainder,armstrongDigits);
    }
    if(armstrong==armstrongSum){
        System.out.println("the number is an armstrong number");
    }
    else System.out.println("the number is not armstrong");
   
    //check weather the number is strong(peterson) or not

    System.out.println("Enter the number you want to check is strong or not");
    int strong=sc.nextInt();
    int factorial=1;
    int sum1=0;
    int strongCopy=strong;
    while(strongCopy>0){
        int quotient=strongCopy/10;
        int remainder=strongCopy%10;
        for(int i=remainder;i>0;i--){
            factorial*=i;
        }
        sum1+=factorial;
        strongCopy=quotient;
        factorial=1;
    }
    if(sum1==strong){
        System.out.println("the number is a strong number");
    }
    else System.out.println("the number is not strong");

    //print the fibonacci upto n terms
    System.out.println("Enter the number you want fibonacci series of");
    int fibonacciTerms=sc.nextInt();
    int a=0;
    int b=1;
    System.out.print(a+" "+b+" ");
    for(int i=0;i<fibonacciTerms;i++){
        int c=a+b;
        a=b;
        b=c;
        System.out.print(c+" ");
    }

    //find the HCF(Greatest common divisor) of a given number
    System.out.println("Enter the nubmer you want hcf of");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int hcf=1;
    for(int i=1;i<Math.min(num1,num2);i++){
        if(num1%i==0 && num2%i==0){
            hcf=i;
        }
    }
    System.out.println("the hcf of a given number is "+hcf);

    //Euclidean algorithm
    int a1=40;
    int b1=100;
    int temp1=a1;
    int temp2=b1;
    int euclideanHcf=1;
    while(b1!=0){
        int temp=b1;
        b1=a1%b1;
        a1=temp;
    }
    euclideanHcf=a1;
    System.out.println("the hcf of the given numbers is "+a1);
    int lcm=(temp1*temp2)/euclideanHcf;
    System.out.println("the lcm of the numbers are "+lcm);

    // To check if the number is automorphic or not
    System.out.println("Enter the number you want to check");
    int automorphicNumber=sc.nextInt();
    String s=String.valueOf(automorphicNumber);
    int autoDigits=s.length();
    int square=(int)Math.pow(automorphicNumber,2);
    System.out.println(square);
    int remainder=square%(int)Math.pow(10,autoDigits);
    System.out.println(remainder);
    if(remainder==automorphicNumber){
        System.out.println("the number is automorphic");
    }
    else{

        System.out.println("the number is not automorphic");
    }

    // To check if the number is happy or not
    int happyNum=sc.nextInt();
    int happyTemp=happyNum;
    while(happyTemp!=1 && happyTemp!=4){
        int happySum=0;
        while(happyTemp!=0){
            int digit=happyTemp%10;
            happySum+= digit*digit;
            happyTemp/=10;
        }
        happyTemp=happySum;
    }
    if(happyTemp==1){
        System.out.println("the number is a happy number");
    }else{
        System.out.println("the number is not happy");
    }
    sc.close();
   }
}
