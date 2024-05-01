import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        /*While loop takes condition inside() 
        */
        // int count=0;
        // while(count<=5){
        //     System.out.println("While count "+count);
        //     count++;
        // }
        // /*Real use of while is used when number of iteration is not fixed 
        //  * for eg, if you want to keep asking a user for input until desired condition 
        //  */

         Scanner scan=new Scanner(System.in);
        //  System.out.println("Please enter a number:");
        //  int intValue=scan.nextInt();
        //  while(intValue<0 || intValue>100 ){
        //     System.out.println("Please enter a number between 0-100" );
        //     intValue=scan.nextInt();
        //  } 
        // System.out.println("Correct condition "+intValue);

         /*Use while loop to ask a user for a integer 
     * keep asking user for number unless the integer is negative
    */

        System.out.println("enter a number: ");
        int num=scan.nextInt();
        while(num<0){
            System.out.println("input a positive number");
            num=scan.nextInt();
        }
        System.out.println("the number is positive"+num);
        scan.close();
        }
}
