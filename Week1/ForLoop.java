public class ForLoop {
    public static void main(String[] args) {
        // for (int index=0; index<4; index++){
        //     System.out.println("Loop"+index);
        // }

        // /*Make the table for the following. */
        // for(int index=10;index>=0;index--){
        //     System.out.println("Decrement"+index);
        // }

        /*Task 
         * make a multiplication table of 2
        */
        // for(int index=1;index<=10;index++){
        //     int mul=(2*index);
        //     System.out.println("2x"+index+'='+mul);
        // }
        
        /*nESTED FOR LOOPS 
         * for loop inside a for loop scope/block
        */
        // for(int outer=0;outer<2;outer++){
        //     for(int inner=3; inner>=0;inner--){
        //         System.out.println("Inner Loop"+inner);
        //     }
        //     System.out.println("Outer Loop"+outer);
        // }

        /*Task
         * make a multiplication table from 1 to 5.
         */
        for(int outer=1;outer<=5;outer++){
            for(int inner=1;inner<=10;inner++){
                System.out.println(outer+" x "+inner+" = "+(inner*outer)); 
            }
        }
    }
}
