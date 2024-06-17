public class InheritanceConstructor {
    public static void main(String[] args) {
        // HalfPant hp=new HalfPant();
        // hp.differentColor("Red");
        // Pant p1=new Pant();
        // System.out.println(p1.color);
        // Pant p2=new Pant("Yellow");
        // System.out.println(p2.color);
        // Pant p3=new Pant(10);
        Polo pp=new Polo();
        pp.design("Red");
        pp.detail();
    }
}
// class Pant{
//     String color="White";//super.color
//     String texture;
//     Pant(){
//         System.out.println("Pant Default Constructor");
//     }
//         //Overloading-Same function/construcotr with different logic/parameters
//     Pant(String color){
//         this.color=color;
//         System.out.println("Constructor with 1 String param");
//     }
//     Pant(String color,String texture){
//         this.color=color;
//         this.texture=texture;
//         System.out.println("Constructor with 2 string param");
//     }
//     Pant(int num){
//         System.out.println("Num"+num);
//         System.out.println("Constructor with 1 int param");
//     }
//     //Overloading can be done only with difference in param(data type and number of param)
//     //not the variable name,cannot again make Pant(String c)

// }

// class HalfPant extends Pant{
//     String color="Black";//this.color
//     HalfPant(){
//         //If object of child class is made, automatically executes
//         //super() or Pant() in the dirst execution
//         super("Green");
//         System.out.println("Half Pant default Constructor");
// }
// void differentColor(String color){
//     System.out.println("Parameter Color"+color);
//     System.out.println("Class Color"+this.color);
//     System.out.println("Parent Color"+super.color);
// }
// }
/*
 * Make a class Shirt
 * Make 2 attribute color and thread
 * Make a parameterized constructor that takes color and thread
 * Make a non parameterized constructor that sets default
 * color to "White and texture to "Cotton"
 * Make a class Polo that extends Shirt
 * Make 1 atttribute color,set default to Green 
 * Make non parameterized constructor to Polo
 * Call the parameterized constructor of Parent with "Red" and "Silk"
 * Make a function design() in Polo that takes String color
 * set the current color of Polo to shirt
 * set the parameter color to current color or Polo
 * Make a function detail() that prints parent color and thread 
 * also print the color of current Polo
 * Make an object of polo and call function design and detail
 */
class Shirt{
    String color;
    String thread;
    Shirt(String color,String thread){
        this.color="white";
        this.thread="cotton";
    }
    Shirt(){
        this.color="White";this.thread="Cotton";
        System.out.println("non parameterized constructor");
    }
}
class Polo extends Shirt{
    String color="Green";

    Polo(){
    super("red","Silk");
    System.out.println("non parameterized constructor inside polo");

    }
    void design(String color){
        super.color=this.color;
        this.color=color;
    }
    void detail(){
        System.out.println(super.color+super.thread);
        System.out.println("color of current polo is "+this.color);
    }
}
