public class ArrayClass {
    public static void main(String[] args) {
        // /*Array declaration */
        // int[] myFirstArray;
        // /*Array initialization */
        // myFirstArray=new int[5];  //5 refers to the size
        // int arraySize=myFirstArray.length;//how many element in array count the value
        // System.out.println("Total element in array is "+arraySize);

        // myFirstArray[0]=10;
        // myFirstArray[1]=20;
        // myFirstArray[2]=30;
        // /*You cannot take or assign array element greater than 
        //  * Last index, here it is 4
        //  */
        // System.out.println("First Index is "+myFirstArray[0]);

        // /*Array declaration and initialization */
        // int[] mySecondArray=new int[20];
        // /*Array declaration, initialization and value */
        // int[] myThirdArray={10,20,30,40,67};
        // /*or */
        // int[] myForthArray=new int[]{1,2,3,4};

        /*Task
         * Make an array myFifthArray with the size of 10
         * values should be 10,20,30,40,50,60,70,80,90,100
         * print each index, from 0-19//loop is optional
         * with each print also print multiplication of the value by 2
         * Output
         * 10 20
         * 20 40
         * 30 60
         * ..
         * 90 180
         * 100 200
         */


         int[] myFifthArray={10,20,30,40,50,60,70,80,90,100};
         int arraySize=myFifthArray.length;
         for(int i=0;i<arraySize;i++){
            System.out.println(myFifthArray[i]+" "+(myFifthArray[i]*2));

         }
         

       
    }
    
}
