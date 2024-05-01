public class JumpStatement {
    public static void main(String[] args) {
        // /*break and continue are jump statement in java */
        // for(int i=0;i<=5;i++){
        //     if(i==2){
        //         break;
        //     }
        //     System.out.println("for loop "+i);
        // }
        // /*can be used in while and do while */
        // int count=0;
        // while(count<=5){
        //     if(count==1){
        //         break;
        //     }
        //     System.out.println("While count "+count);
        //     count++;
        // }

        // /*Break ends/terminated the loop where it is called  */
        // /*Continue skips the current iteration */
        // for(int index=0;index<=5;index++){
        //     if(index==3){
        //         continue; // will ignore all the remaining and go to next loop
        //     }
        //     System.out.println("Continue Loop"+index);
        // }
        /*Break in nested loop  */
        // for(int outer=0;outer<=2;outer++){
        //             for(int inner=0;inner<=3;inner++){
        //                 if(inner==1){
        //                 break;
        //         }
        //             System.out.println("Inner loop "+inner);
        //     }
        // }
        // /*if you want to break puter loop */
        // System.out.println("outer loop break");
        // outerloop:for(int outer=0;outer<=2;outer++){
        //     innerLoop:for(int inner=0;inner<=3;inner++){
        //         if(inner==1){
        //             break outerloop;
        //         }
        //         System.out.println("inner loop"+inner);
        //     }
        // }

        /*Task 1
         * use for loop from -5 to 5 
         * if the value is positive end the loop
        */
        for(int index=-5;index<=5;index++){
            if(index>0){
                break;
            }
            System.out.println("negative"+index);

        }


        /* Task 2
         * use for loop from 1-20
         * only print the value if the value is even
         * use continue to perform this 
         */

        for(int index=1;index<=20;index++){
            if(index%2!=0){
                continue;
            }
            System.out.println(index);
        }



    }
    
}
