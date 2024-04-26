import java.util.Scanner;
//or
//import java.util.*; //import all the utils
public class UserInput {
    public static void main(String[] args) {
        // /*Print/output a line with line break
        //  * use "sout" shortcuts
        //  */
        // System.out.println("this prints and breaks line");
        // /*Print the word without line break */
        // System.out.println("this will not break line");
        // System.out.println("this line will continue\n");

        // /*Output formatting
        //  * System.out.printf();
        //  * %s String. %d integral, %f floating point, %b boolean 
        //  * This will not break line too
        //  */
        
        //  System.out.printf("The next word is %s","New Word\n");
        //  System.out.printf("The next int is %d\n",10);
        
        //  /*You can use multiple formatter */
        //  System.out.printf("Multiple %f %b",10.9f,false);

        //  /*User Input using scanner
        //  * first import the Scanner class
        //  * import java.util.Scanner;
        //   */

        //   Scanner scan = new Scanner(System.in); //System.in is used as input
        //   System.out.println("The following takes one word from sentence");
        //   String oneWord=scan.next();
        //   System.out.println(oneWord);
        //   System.out.println("The following takes whole sentence");
        //   String wholeSentence=scan.nextLine();
        //   System.out.println(wholeSentence);
        //   System.out.println("The following takes int");
        //   int intInput=scan.nextInt();
        //   System.out.println("The following takes boolean");
        //   boolean booleanInput=scan.nextBoolean();
        //   System.out.println(booleanInput);
        //   scan.close();

        /*Task
         * Create a new Scanner obj name scan1
         * Prompt user for the following
         * What is your name? -> Save to String name, use nextline()
         * Are you over 18? -> Save to boolean status, use nextBoolean()
         * How many siblings do you have? -> Save int sibling, use nexInt()
         * Print the output
         * Hello, name
         * Over 18 status,
         * You have sibling number of siblings
         */

         Scanner scan1 = new Scanner(System.in); //System.in is used as input
         System.out.println("What is your name?");
         String name=scan1.nextLine();
         System.out.println("Are you over 18?");
         boolean booleanstatus=scan1.nextBoolean();
         System.out.println("How many siblings do you have?");
         int siblings=scan1.nextInt();
         System.out.printf("Hello, %s\nOver 18 status:%b\nYou have %d number of siblings",name,booleanstatus,siblings);
         scan1.close();
    }
}
