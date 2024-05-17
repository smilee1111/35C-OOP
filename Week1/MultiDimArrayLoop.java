public class MultiDimArrayLoop {
    public static void main(String[] args) {
        /*Make 2 dim array */
        // int[][] arrayTwo= {
        //     {10,20},
        //     {30,-10},
        //     {-20,100}
        // };
        // /*Visual representation
        //  * [
        //  * [10,20],
        //  * [30,-10],
        //  * [-20,100]
        //  * ]
        //  */
        // /*Iterate/access each array */
        // int arrayTwoLength=arrayTwo.length;
        // for(int outer=0; outer<arrayTwoLength; outer++){
        //     System.out.println("Access array in "+outer);
        //     //System.out.println(arrayTwo[outer][0]);
        //     //System.out.println(arrayTwo[outer][1]);
        //     int innerLength=arrayTwo[outer].length;
        //     for(int inner=0;inner<innerLength;inner++){
        //         System.out.println(arrayTwo[outer][inner]);
        //         //outer loops from 0-2,inner from 0-1
        //     }

        // }

    /*Make the following array 
     *[
        ["Prabesh", "Ankit","Yubraj"],
        ["Muskan","Manasvi","Ritika"]
    ]
    *variable : names
    */
    /*Loop and print all */
    /*Continue and find the array index in which manasvi is in
     * output:1
     */
    String[][] names={
        {"Prabesh", "Ankit", "Yubraj"},
        {"Muskan", "Manasvi", "Ritika"}
    };
    for(int outer=0;outer<names.length;outer++){
        for(int inner=0;inner<(names[outer].length);inner++){
            System.out.println(names[outer][inner]);
        }
    }
    for(int outer=0;outer<names.length;outer++){
        for(int inner=0;inner<(names[outer].length);inner++){
            if(names[outer][inner]=="Manasvi"){
                System.out.println("manasvi in index" +outer+" "+inner);
            }
        }
    }

    

    }
}
