import java.util.Scanner;
public class Week3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*1. Write a JAVA program to find the maximum between three numbers. */
        // System.out.println("ënter 1st number");
        // int n1=scan.nextInt();
        // System.out.println("ënter second number");
        // int n2=scan.nextInt();
        // System.out.println("enter third number");
        // int n3=scan.nextInt();
        // if(n1>n2 && n1>n3){
        //     System.out.println("maximum is "+n1);
        // }else if(n2>23 && n2>n1){
        //     System.out.println("maximum is "+n2);
        // }else if(n3>n1 && n3>n2){
        //     System.out.println("maximum is "+n3);
        // }else{
        //     System.out.println("A different case maybe equal numbers?");
        // }

        /*2. Write a JAVA program to check whether a number is negative, positive, or zero. */

        // System.out.println("enter a number: ");
        // int num=scan.nextInt();
        // if(num>0){
        //     System.out.println("Number is positive.");
        // }else if(num<0){
        //     System.out.println("Number is negative.");
        // }else{
        //     System.out.println("Number is zero.");
        // }

        /*3. Write a JAVA program to check whether a number 
        is divisible by 5 and 11 or not. */

        // System.out.println("Enter a number: ");
        // int num=scan.nextInt();
        // if(num%5==0 && num%11==0){
        //     System.out.println("number divisible by both 5 and 11.");
        // }else if (num%5==0 && num%11!=0){
        //     System.out.println("number is divisible by 5 but not 11.");
        // }else if(num%5!=0 &&num%11==0){
        //     System.out.println("number is divisible by 11 but not by 5.");
        // }else{
        //     System.out.println("not divisible by bothe 5 and 11.");
        // }

        /*4. Write a JAVA program 
        to check whether a number is even or odd. */
        
        // System.out.println("enter the number:");
        // int num=scan.nextInt();
        // if(num%2==0){
        //     System.out.println("even");
        // }else {
        //     System.out.println("odd");
        // }

    /*5. Write a JAVA program to check whether 
    a year is a leap year or not.  */

    // System.out.println("Enter the year: ");
    // int y=scan.nextInt();
    // if(y%4==0){
    //     System.out.println("It is indeed a leap year.");
    // }else{
    //     System.out.println("It is not a leap year.");
    // }

    // System.out.println("enter a letter from the alphabet: ");
    // char st=scan.next().charAt(0);
    // if(st=='a' || st=='e' || st=='i' || st=='o' || st=='u'){
    //     System.out.println("vowel");
    // }else{
    //     System.out.println("consonant");
    // }

    /*SWITCH CASE */
    /* 1. Write a Java program that takes a student's grade 
    as input (A, B, C, D, or F) and converts it to the 
    corresponding GPA value. Use a switch case statement 
    to handle different grades.*/ 

    // System.out.println("enter your grade ");
    // String ch=scan.nextLine();
    // char st=ch.toUpperCase().charAt(0);
    // switch (st) {
    //     case 'A':
    //         System.out.println("you have received 3.6 GPA");    
    //         break;
    //     case 'B':
    //         System.out.println("You have received 2.8 GPA.");
    //         break;
    //     case 'C':
    //         System.out.println("You have received 2.0 GPA.");
    //         break;
    //     case 'D':
    //         System.out.println("You have received 1.6 GPA.");
    //         break;
    //     case 'E':
    //         System.out.println("You have received 0.8 GPA.");
    //         break;
    //     default:
    //         System.out.println("not applicable or invalid");
    //         break;
    // }

    /*2. Create a Java program that takes two numbers and an 
    operator (+, -, *, /) as inputs and performs the corresponding
    arithmetic operation using a switch case statement. */
    // System.out.println("enter number 1:");
    // int num1=scan.nextInt();
    // System.out.println("enter number 2:");
    // int num2=scan.nextInt();
    // System.out.println("enter the operation you want to perform among +,*,-,/");
    // char ch=scan.next().charAt(0);
    // switch (ch) {
    //     case '+':
    //         int sum=num1+num2;
    //         System.out.println("you chose addition, so the sum is "+sum);
    //         break;
    //     case '-':
    //         int diff=num1-num2;
    //         System.out.println("you chose subtraction, so the difference is "+diff);
    //         break;
    //     case '*':
    //         int prod= num1*num2;
    //         System.out.println("you chose multiplication, so the product is "+prod);
    //         break;
    //     case '/':
    //         int div=num1/num2;
    //         System.out.println("you chose division, so the quotient is "+div);
    //         break;
    //     default:
    //         System.out.println("invalid choice");
    //         break;
    // }


    /*3. Write a Java program that takes an integer input (1 to 12) 
    representing a month and prints the corresponding season
     (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case. */
    
    // System.out.println("enter a number from 1-12:");
    // int num=scan.nextInt();
    // switch (num) {
    //     case 1: case 2: case 3:
    //         System.out.println("It is winter, wear warm clothes.");
    //         break;
    //     case 4: case 5: case 6:
    //         System.out.println("It is spring, adore the cherry blossoms.");
    //         break;
    //     case 7: case 8: case 9:
    //         System.out.println("It is summer, go for a swim.");
    //         break;
    //     case 10: case 11: case 12:
    //         System.out.println("It is fall, be ready for halloween");
    //         break;
    //     default:
    //     System.out.println("invalid number.");
    //         break;
    // }

    /*4. Implement a Java program that calculates the area of 
    different shapes (circle, rectangle, square, triangle) 
    based on the user's choice using a switch case. */


    System.out.println("enter the shape: circle/rectangle/square/triangle:" );
    String st=scan.next();
    char ch=st.toUpperCase().charAt(0);
    switch (ch) {
        case 'C':
            System.out.println("enter the radius of the circle: ");
            int r= scan.nextInt();
            int area= (22/7)*(r*r);
            System.out.println("area of circle is "+area);
            break;
        case 'R':
            System.out.println("enter length of rectangle: ");
            int l=scan.nextInt();
            System.out.println("enter breadth of the rectangle: ");
            int b= scan.nextInt();
            area=l*b;
            System.out.println("the area of the rectangle is "+area);
            break;
        case 'S':
            System.out.println("enter the length of the square:");
            l=scan.nextInt();
            area=l*l;
            System.out.println("The area of the square is "+ area);
            break;
        case 'T':
            System.out.println("enter the base of the triangle:");
            b=scan.nextInt();
            System.out.println("enter height of the triangle:");
            int h = scan.nextInt();
            area=(b*h)/2;
            System.out.println("area of the triangle is "+area);
            break;
        default:
            System.out.println("invalid choice.");
            break;
    }






        scan.close();

    }
    
}
