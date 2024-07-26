import java.util.Scanner;
public class ExceptionHandling {
   
        // int num1=10;
        // try{
        //     int num2=10/0;//Airthmetic exception-should exit here
        // }catch(ArithmeticException ex){
        //     //Catches the type of exception provided
        //     System.out.println("Cannot divide bye 0 ");
        // }finally{
        //     System.out.println("Runs no matter what ");
        // }
        // //ArrayIndexOutofBounds
        // int[] arrNum=new int[4];
        // arrNum[0]=10;
        // try{
        // arrNum[100]=300;//ArrayIndexOutofBounds exception - exits here     
        // }catch(ArrayIndexOutOfBoundsException ex){
        //     System.out.println("Array too small");
        // }
        // //Null Pointer exception
        // String data=null;
        // try{
        // System.out.println(data.length());//NullPointer exception - exits here
        // }catch(NullPointerException ex){
        //     System.out.println("Null data, please fill");
        // }
        //Nested try block
        // try{
        //     int t1=10/0;
        //     String d1=null;
        //     System.out.println(d1.length());
        // }catch(ArithmeticException ex){
        //     System.out.println("Number error");
        // }catch(NullPointerException ex){
        //     System.out.println("Null ayo");
        // }finally{
        //     System.out.println("Try block end");
        // }
        // //Exception
        // try{
        //     String d2 =null;
        //     System.out.println(d2.length());
        //     int t2=10/0;
        // }catch(Exception ex){
        //     System.out.println("Catches any exception" );
        // }
        
        // System.out.println("Program End");
        //Task
        //Find the exception and use try block finally accordingly 
        // int number1=10;
        // int number2=number1-10;
        // int number3=number1/number2;
        // String name;
        // System.out.println(name.length());
        // System.out.println(name.length());
        // String[] names = new String[100];
        // names[0] = "Ram";
        // names[110] = "Ankit";
        public static void main(String[] args) {
            System.out.println("Program Start");
            int number1 = 10;
            int number2 = number1 - 10;
            try{
            int number3 = number1 / number2;
            }catch(ArithmeticException ex){
                System.out.println("1.cannot divide by 0");
            }
            finally{
                System.out.println("division ended");
            }
            String name=null;
            try{
            System.out.println(name.length());
            }catch(NullPointerException ex){
                System.out.println("2.no value ");
            }finally{
                System.out.println("string name is exceptional");
            }
            String[] names = new String[100];
            names[0] = "Ram";
            try{
            names[110] = "Ankit";
            }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("3.no such array index");
            }finally{
                System.out.println("array index was too much");
            }
         


        }
}
// import java.util.Scanner;

// public class StringLengthChecker {

//     public static void main(String[] args) {
//         try {
//             String input = getUserInput();
//             System.out.println("You entered: " + input);
//         } catch (InvalidStringLengthException e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }

//     public static String getUserInput() throws InvalidStringLengthException {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a string (between 5 and 20 characters): ");
//         String input = scanner.nextLine();

//         if (input.length() < 5 || input.length() > 20) {
//             throw new InvalidStringLengthException("String length must be between 5 and 20 characters.");
//         }

//         return input;
//     }

//     public static class InvalidStringLengthException extends Exception {
//         public InvalidStringLengthException(String message) {
//             super(message);
//         }
//     }
// }