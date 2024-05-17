public class MultiDimArray {
    public static void main(String[] args) {
        /*The number of square bracket represent dimension of array  */
        // int[] oneDArray;
        // int[][] twoDArray;
        // int[][][] threeDArray;

        // /*To allocate size we must allocate the size of each square bracket */
        // twoDArray=new int[2][3];
        // /*The first size 2 represent how many array
        //  */
        // /*The second size 3 represent how many element/value inside the inner array */
        // /*twoDArray can be seen as 
        //  * [
        //  * [0,0,0],
        //  * [0,0,0]
        //  * ]
        // */
        // //twodArray[0] -> take first array
        // //twoDArray[0][0] -> take first element of first array
        // twoDArray[0][0]=10;
        // twoDArray[0][1]=20;
        // twoDArray[1][1]=50;
        // twoDArray[1][2]=100;

        // //print/access
        // System.out.println(twoDArray[0][1]);

        /*Task
         * Make the following array 
         * [
         * [10,20,30,50],
         * [100,200,300,400],
         * [50,60,70,10],
         * [-10,-20,-30,-50],
         * [1,2,3,5]
         * ]
         * Variable name arrayDemo;
         */
        //OR
        // int[][] arrayDemo;
        // arrayDemo=new int[5][4];
        // arrayDemo[0][0]=10;
        // arrayDemo[0][1]=20;
        // arrayDemo[0][2]=30;
        // arrayDemo[0][3]=50;
        // arrayDemo[1][0]=100;
        // arrayDemo[1][1]=200;
        // arrayDemo[1][2]=300;
        // arrayDemo[1][3]=400;
        // arrayDemo[2][0]=50;
        // arrayDemo[2][1]=60;
        // arrayDemo[2][2]=70;
        // arrayDemo[2][3]=10;
        // arrayDemo[3][0]=-10;
        // arrayDemo[3][1]=-20;
        // arrayDemo[3][2]=-30;
        // arrayDemo[3][3]=-50;
        // arrayDemo[4][0]=1;
        // arrayDemo[4][1]=2;
        // arrayDemo[4][2]=3;
        // arrayDemo[4][3]=5;
        int[][] arrayDemo={
            {10,20,30,50},
            {100,200,300,400},
            {50,60,70,10},
            {-10,-20,-30,-50},
            {1,2,3,5}
        };

        /*Print the 4th index array
         * output
         * The element in 4th index is
         * 1
         * 2
         * 3
         * 5
         */
       
        for(int i=0;i<=3;i++){
            System.out.println(arrayDemo[4][i]);
        }
        /*OR
        System.out.println(arrayDemo[4][0]);
        System.out.println(arrayDemo[4][1]);
        System.out.println(arrayDemo[4][2]);
        System.out.println(arrayDemo[4][3]);
 */


    }
}
