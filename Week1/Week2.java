import java.util.Scanner;
import java.lang.Math;
public class Week2 {
    public static void main(String[] args) {
//         /*1. Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote. */
        Scanner scan=new Scanner(System.in);
//         System.out.println("what is your age?");
//         int age=scan.nextInt();
//         if (age>18){
//             System.out.println("Your are over 18 so you can vote.");
//         }
//         else{
//             System.out.println("you are under 18 so you cannot vote.");
//         }




        // /*2. Write a program to calculate SI.  */
        // System.out.println("what is principal amount?");
        // int prin=scan.nextInt();
        // System.out.println("what is rate?");
        // int rate=scan.nextInt();
        // System.out.println("what is time?");
        // int time=scan.nextInt();
        // int si;
        // si=(prin*rate*time)/100;
        // System.out.println("simple interest is "+si);


        /*3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.

Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side; */
        // System.out.println("What is base?");
        // int b=scan.nextInt();
        // System.out.println("what is height?");
        // int h=scan.nextInt();
        // int area=(b*h)/2;
        // System.out.println("area of triangle is "+area);
        // System.out.println("length of cube?");
        // int l=scan.nextInt();
        // System.out.println("length of cuboid?");
        // int lg=scan.nextInt();
        // System.out.println("breadth of cuboid?");
        // int bg=scan.nextInt();
        // System.out.println("height?");
        // int hg=scan.nextInt();
        // double acube=Math.pow(l, 3);
        // System.out.println("volume of cube is "+acube);
        // int acubo=lg*bg*hg;
        // System.out.println("volume of cuboid"+acubo);

        /*4. Write the ternary operator for question no. 1 */
        // System.out.println("enter your age");
        // int age=scan.nextInt();
        // boolean express=age>18;
        // String output=express?"You can vote":"You cannot vote";
        // System.out.println(output);


        /*5. Write a program to take two integer inputs from the user and print the sum and product of them. */
        // System.out.println("enter first number:");
        // int a=scan.nextInt();
        // System.out.println("enter second number:");
        // int b=scan.nextInt();
        // System.out.println("Sum is "+(a+b));
        // System.out.println("Product is "+(a*b));


        /*6. Take two integer inputs from the user. First, calculate the sum of two, then the product of two. Finally,
         calculate the division of the thus obtained sum and product and print the result. */

        // System.out.println("enter first number:");
        // int a=scan.nextInt();
        // System.out.println("enter second number:");
        // int b=scan.nextInt();
        // int sum=a+b;
        // int prod=a*b;
        // double div=(double)sum / prod;
        // System.out.println("quotient is "+div);


        /*7. Take the name, roll number, and field of interest from the user and print in the format below: 
        Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz. */

        // System.out.println("What is your name?");
        // String name=scan.nextLine();
        // System.out.println("What is your roll no?");
        // int roll=scan.nextInt();
        // scan.nextLine(); 
        // System.out.println("What is your field of interest?");
        // String field=scan.nextLine();
        // System.out.println("Your name is "+name+".");
        // System.out.println("Your roll no is "+roll);
        // System.out.println("You are interested in "+field);


        /*8. Take side of a square from user and print area and perimeter of it. */
        // System.out.println("length of one side of square.");
        // int l=scan.nextInt();
        // System.out.println("Area is "+Math.pow(l, 2));
        // System.out.println("Perimeter is "+ (4*l));

        /*9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int. */

        // System.out.println("length of rectangle?");
        // double l=scan.nextDouble();
        // System.out.println("breadth of rectangle?");
        // double b=scan.nextDouble();
        // double area=l*b;
        // System.out.println("area of rectangle is "+(int)area);


        /*10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured. 
        And use the following conditions to generate the final result;

a. If equal to or more than 70 -> First Class

b. If more than 59 -> Upper Second Class

c. If more than 49 -> Second class

d. If more than 39 -> Third class and if below than 40 the result is fail. 

Hint: Use ternary operator

 */
    

    System.out.println("marks in maths");
    int math=scan.nextInt();
    System.out.println("marks in science");
    int sci=scan.nextInt();
    System.out.println("marks in social");
    int soc=scan.nextInt();
    System.out.println("marks in nepali");
    int nep=scan.nextInt();
    int per=(math+sci+soc+nep)/4;
    String output=per>=70?"First class":per>59?"Upper Second Class":per>49?"Second Class":per>39?"Third Class":"fail";
    System.out.println(output);


        scan.close();
        }
        }