public class StaticFunction {
    // /*static function with modifier */
    // public static int addNumber(int num1,int num2) {
    //     int sum=num1+num2;
    //     return sum;
    // }
    // public static String vendingMachine(int menu){
    //     if(menu==1){
    //         return "Coke";
    //     }

    //     if(menu==2){
    //         return "Water";
    //     }
    //     if(menu==3){
    //         return "Frooti";
    //     }

    //     return "Invalid Menu";
    // }
    public static String adoptPet(String animal){
        if(animal=="Dog"){
            return "True";
        }

        if(animal=="Car"){
            return "True";
        }

        if(animal=="Snake"){
            return "True";
        }
        
        return "False";

    }

    public static String eligibleTest(int age,String name){
        if(age<0){
            return "Hello "+name+",your age is invalid";
        }
        if(age<18){
            return "Hello "+name+",you are underage";
        }
        if(age>18){
            return "Congratulation "+name+",you are eligible";
        }
        return "Invalid";

    }
    public static void main(String[] args) {

        // /*We donot have to create object for static function
        //  * If the static function is in same class
        //  * can just call from function name
        //  */
        // int returnFromFunction=addNumber(20,20);
        // System.out.println("Returned Value is"+returnFromFunction);
        // String returnFromString=vendingMachine(2);
        // System.out.println("you have chosen "+returnFromString);
        /*Make a function adoptPet 
         * Takes animal type as String
         * if the animal is Dog,Car,Snake return true
         * else return false
        */

        /*Make a function eligibleTest
         * Takes name as String and age as int
         * if age is less than 0
         * return "Hello name, your age is invalid"
         * if age is les than 18
         * return "Hello name,you are underage
         * if age is more than 18
         * return "Congratulation name,you are eligible"
         */

        String returnFromString=adoptPet("Car");
        System.out.println(returnFromString);

        String returnfromString2=eligibleTest(10,"kia");
        System.out.println(returnfromString2) ;
    }
}
