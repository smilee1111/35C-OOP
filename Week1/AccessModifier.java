public class AccessModifier {
    public static void main(String[] args) {
    // AccessExample ae=new AccessExample();
    // ae.name="Ruby";
    // ae.age=10;
    //  ae.printThis();
    //  ae.printName();
    //  ae.accessPrivate();
    //  ae.setphNo("980123");
    //  ae.accessPrivate();
    //  System.out.println(ae.getphno());
     //ae.privateFunction();//
      Dog d=new Dog();
      d.age=10;
      d.setName("Max");
      d.setBreed("Pug");
      System.out.println("Name: "+d.getName());
      System.out.println("Breed:"+d.getBreed());
      System.out.println("Age:"+d.age);
    }
    
}
//Task
//Make a class dog
//make 2 private attribute, name and breed
//make 1 public attribute age,
//make setter for name and breed
//make getter for name and breed
//make 1 object for Dog
//fill all the attribute 
//print the following from object
//name:xyz
//breed:abc
//age=10

class Dog{
    private String name;
    private String breed;
    public int age;
    void setName(String n){
        name=n;
    }
    void setBreed(String b){
        breed=b;
    }

    String getName(){
        return name;
    }

    String getBreed(){
        return breed;
    }

}

// class AccessExample{
//     String name; //Automatically default,meaning package /folder access
//     public int age;//public can be access from anywhere
//     private String phNo;//private can be accessed only in class
//     void setphNo(String p){
//         phNo=p;
//     }
//     String getphno(){
//         return phNo;
//     }

//     //same goes to function
//     void printThis(){
//         System.out.println("printing detail");
//     }

//     public void printName(){
//         System.out.println("Name is "+name);
//     }

//     private void privateFunction(){
//         System.out.println("This can be run only inside the class");
//     }

//     void accessPrivate(){
//         System.out.println(phNo);
//         privateFunction();
//     }
// }