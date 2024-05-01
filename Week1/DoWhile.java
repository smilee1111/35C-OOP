public class DoWhile {
    public static void main(String[] args) {
        int num1=0;
        /*While checks the condition first */
        while(num1<0){
            System.out.println("This will not print since condition is false");

    }
    /*Do While checks the condition after the loop
     * meaning, do while loop runs at least once even if the condition is false
     */
    do{
        System.out.println("Do wihle will check condition after the statement");
    }
    while(num1<0);

   
}
}
