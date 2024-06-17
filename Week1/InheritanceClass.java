
public class InheritanceClass {
    public static void main(String[] args) {
        // ChildClass cc=new ChildClass();
        // cc.lastname="XYZ";
        // cc.expenses=1000.1;
        // cc.firstname="ABC";
        // cc.info();
        // cc.detail();

        Labrador ll=new Labrador();
        ll.name="Bruno";
        ll.species="Mammal";
        ll.breed="labrador";
        ll.color="brown";
        ll.speak();
        ll.fur();
        ll.bark();
        ll.play();
    
}
}
// class ParentClass{
//     public String lastname;
//     private int salary;
//     double expenses;
//     void info(){
//         System.out.println("Parent function "+lastname);
//     }
// }
// //single level inheritance-One Parent and One Child
// //use "extends" to inherit a class
// class ChildClass extends ParentClass{
// String firstname;
// void detail(){
//     System.out.println("Child function"+firstname+" "+lastname);
// }
// }
// //multi-level inheritance-Nested class
// class GrandChildClass extends ChildClass{
//     String middlename;
//     void description(){
//         System.out.println(firstname+" "+middlename+" "+lastname );
//     }
// }

// //tree/hierarchical inheritance
// class BrotherClass extends ParentClass{
//     String address;
//     void living(){
//         System.out.println("Address");
//     }
// }


class Animal{
public String name;
void speak(){
    System.out.println("Inside animal: "+name);
}
}
class Mammal extends Animal{
    public String species;
    void fur(){
        System.out.println("Inside mammal"+species);
    }
}
class Reptile extends Animal{
    public String egg;
    void shed(){
        System.out.println("inside reptile:"+egg);
    }
}
class Dog extends Mammal{
    public String breed;
    void bark(){
        System.out.println("inside dog:"+breed);
    }
}
class Cat extends Mammal{
    public String origin;
    void meow(){
        System.out.println("inside cat:"+origin);
    }
}
class Labrador extends Dog{
    public String color;
    void play(){
        System.out.println("inside labrador:"+color);
    }
}
class GeramanShephard extends Dog{
    public String spots;
    void guard(){
        System.out.println("inside GermanShephard"+spots);
    }
}
class Ambhibian extends Reptile{
    public String scale;
    void swim(){
        System.out.println("inside Amphibian:"+scale);
    }
}

