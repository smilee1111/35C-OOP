public class encapsulation {
    public static void main(String[] args) {
        //Task
        //Make setter and getter for price
        //Create 2 object of Laptop
        //Output the following using the object
        //Output
        //Name: Apple Air M2
        //Brand:Apple
        //Price: 150000
        //Year:2022

        Laptop l=new Laptop();
        l.setName("Apple Air M2");
        l.brand="Apple";
        l.setPrice(150000);
        l.year=2022;

        System.out.println("Name "+l.getName());
        System.out.println("Brand" + l.brand);
        System.out.println("Price"+l.getPrice());
        System.out.println("Year"+l.year);
        l.inflation(5000);
        System.out.println("New Price"+l.getPrice());

    }
}
//1.Encapsulation bundles the 
//similar attribute and function inside a class
class Laptop{
//2. Encapsulation can have data hiding using private 
private String name;
public String brand;
private double price;
int year;
//3.Encapsulation can have read only or write only 
//using getter and setter
public void setName(String name){
    this.name=name;
}

public void setPrice(double price){
    this.price=price;
}
public double getPrice(){
    return this.price;
}
public String getName(){
    return this.name;
}

public void getInfo(){
    System.out.println(name+" "+brand);
}
public void inflation(double money){
    this.price=this.price+money;
}
}

