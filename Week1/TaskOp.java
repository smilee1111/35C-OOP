public class TaskOp {
    public static void main(String[] args) {
                /*Task1
         * Write a program to print whether a variable is greater or equal to 18
         */
        int var1=20;
        System.out.println("var1 greater or equal to 18"+(var1>=18));

        /*Task2
         * Write program to print simple interest from variables
         * Make 3 variable for amount,time.rate.and save the calculation into a variable
         * Formula:
         * si=amount*time*rate/100;
         */
        int prin=4000,rate=8,time=2;
        int si;
        si=(prin*rate*time)/100;
        System.out.println("simple interest is "+si);

        /*Task3 
         * Write a program to print the area and perimeter of rectangle
         * a=l*b
         * p=2(l+b)
        */
        int l=40,b=10;
        int a=l*b;
        int p=2*(l+b);
        System.out.println("Area is"+a);
        System.out.println("Perimeter is"+p);
        /*Task4
         * Complete the task 1 using ternary operators
         */
        boolean exp1=var1>=18;
        String output=exp1? "Variable greater than or equals to 18":"Variable not greater than or equals to 18";
        System.out.println(output);
    }
}
