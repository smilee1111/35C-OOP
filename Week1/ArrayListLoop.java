import java.util.ArrayList;
public class ArrayListLoop {
    public static void main(String[] args) {
        // /*Import arraylist in the top */
        // ArrayList<String> names= new ArrayList<>();
        // names.add("Ankit");
        // names.add("Parvesh");
        // names.add("Puja");
        // names.add("Yubraj");names.add("Manisha");
        // names.add("Manisha");
        // names.add("Dawa Dai");
        // names.add("Shreya");
        // /*Tpo get the length of arraylist we use .size() function */
        // int namesLength=names.size();
        // /*It will return how many element is in the arraylist */
        // //use for loop
        // for(int index=0;index<namesLength;index++){
        //     System.out.println("Names in index"+index+" "+names.get(index) );

        // }
        // System.out.println("Using for each loop in java");
        // /*Use collection for each  */
        // for(String element: names){
        //     System.out.println(element);
        // }
        /*Task
         * make and ArrayList called animals 
         * ["Dog", "Cat","Tiger","Elephant"]
         * Make two additional ArrayList wild and domestic
         * Loop the animals
         * if the element is "Dog", "Cat", add in domestic ArrayList
         * if the element is "Tiger", "Elephant", add in wild
         * Print domestic and wild ArrayList
         */

         ArrayList<String> animals= new ArrayList<>();
         animals.add("Dog");
         animals.add("Cat");
         animals.add("Tiger");
         animals.add("Elephant");
         int animalslength=animals.size();

         ArrayList<String> wild= new ArrayList<>();
         ArrayList<String> domestic= new ArrayList<>();

         for(int index=0;index<animalslength;index++){
            if((animals.get(index))=="Dog" || animals.get(index)=="Cat"){
                domestic.add(animals.get(index));
            }else{
                wild.add(animals.get(index));
            }
        }
        System.out.println("Domestic animals\n"+domestic);
        System.out.println("Wild animals\n"+wild);
        }
}
