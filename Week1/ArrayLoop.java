public class ArrayLoop {
    public static void main(String[] args) {
        // int[] array1={20,40,60,80,100,120};
        // int array1Length=array1.length;
        // /*Either loop from 0 and index<arraylength
        //  * or loop from 0 and index <=arrayLength-1
        //  */
        // for(int index=0;index<array1Length;index++){
        //     System.out.println("Value in index" +index+" "+array1[index] );
        // }
        // /*Descending loop */
        // /*Start loop from arrayLength-1 to 0,decrement */
        // for(int index=array1Length-1; index>=0;index--){
        //     System.out.println("Descending "+array1[index]);
        // }

        // //Ascending using while loop
        // int counter=0;
        // /*Use this counter to iterate array1 in while loop */
        // while(counter<=array1Length-1){
        //     System.out.println(array1[counter]);
        //     counter++;
        // }
        // //Descending using while loop

        // int counter2=array1Length-1;
        // while (counter2>=0) {
        //     System.out.println(array1[counter2]);
        //     counter2--;
            
        // }


        /*Make two array of length 5
         * myArray1 and myArray2
         * fill the data in myArray1 as 50,40,30,20,10
         * loop the myArray1 put the value in myArray2 in reverse 
         * myArray2 should be 10,20,30,40,50
         * print myArray2 in ascending order
         */

         int[] myArray1={50,40,30,20,10};
         int[] myArray2= new int[5];
         int myArray1length=myArray1.length;
         int counter=0;
         for(int i=myArray1length-1;i>=0;i--){
             myArray2[i]=myArray1[counter];
             counter++;
         }
       for(int i=0;i<=myArray1length;i++){
        System.out.println(myArray2[i]);
       }

    }
    
}
 