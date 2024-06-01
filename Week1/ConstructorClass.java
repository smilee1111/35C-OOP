public class ConstructorClass {
    public static void main(String[] args) {
        // ConstructorExample ce=new ConstructorExample();
        // System.out.println("Line after object");
        // ConstructorExampleTwo cTwo=new ConstructorExampleTwo("Muskan", 10, 'M');
        // System.out.println(cTwo.gender);

        Cat ce=new Cat();
        constructorSet cs=new constructorSet("Mars", "Ginger", 0);
        System.out.println(cs.breed);
    
}
}

//Task
//Make a class Cat
//make private attributes name,age
//make public attribute breed
//make a constructor that sets name and age only
//make getter for name and age 
//make an object of cat 
//print the following from object
//name:xyz
//breed:abc
//age=10;

class Cat{
    private String name;
    private int age;
    public String breed;


}

class constructorSet{
    private String name;
    private int age;
    public String breed;
    constructorSet(String n,String b, int a){
    name=n;
    age=a;
    breed=b;
    }
}




// class ConstructorExampleTwo{
//     private String name;
//     private int age;
//     public char gender;
//     ConstructorExampleTwo(String n, int a, char g){
//         name=n;
//         age=a;
//         gender=g;
//     }
// }
// class ConstructorExample{
//     ConstructorExample(){
//         System.out.println("I run object creation");
//         //continue logic when creating object
//         //in most case we use constructor to set attributes
//     }
// }
