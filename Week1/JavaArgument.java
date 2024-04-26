public class JavaArgument {
    public static void main(String[] args) {
        /*The args in the main function can be used
         * to take input from command lineja
         * when executing the file we can pass argument
         * eg:
         * java JavaArgument arg1 arg2
         * the arg1 and arg2 can be accessed from args
         */
        if(args.length<2){
            System.out.println("Please provide 2 argument");
            return;
        }
        /*Use index of args array to access */
        System.out.println("Argument 1 is "+ args[0]);
        System.out.println("Argument 2 is "+args[1]);
    }
    
}
