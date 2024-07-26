
public class AbstractClass {
    public static void main(String[] args) {
//         // Samsung ss=new Samsung();
//         // ss.sms();
//         // System.out.println(ss.call(98000000));
//         // Iphone ii= new Iphone();
//         // ii.sms();
//         // System.out.println(ii.call(986632132));

        Circle c1=new Circle();
        System.out.println("Area of circle is "+c1.calculateArea());
        System.out.println("Perimeter of circle is "+c1.calculatePerimeter());
        Rectangle r1= new Rectangle();
        System.out.println("Area of rectangle is "+r1.calculateArea());
        System.out.println("Perimeter of rectangle is "+ r1.calculatePerimeter());
        Triangle t1=new Triangle();
        System.out.println("Area of Triangle is "+t1.calculateArea());
        System.out.println("Perimeter of triangle is "+t1.calculatePerimeter());

     }
 }
// // //to make abstract class "abstract" keyword used before "class"
// // //abstract class cannot be made object of 
// // abstract class SmartPhone{
// //     //abstract class may or may not contain abstract function 
// //     //abstract function do not have body(function hiding)S
// //     abstract void sms();
// //     abstract String call(int number);
// //     //can contain normal function 
// //     //normal function should contain body
// //     void imei(){
// //         System.out.println("IMIE");
// //     }
// // }
// //     //all the abstract function of abstract class needs to be implemented/overriden 
// // class Samsung extends SmartPhone{
// //         @Override//to indicate change in function of parent class
// //     void sms(){
// //         System.out.println("Samsung way of sms");
// //     }
// //     @Override
// //     String call(int number){
// //         return number+"is calling";
// // }
// //     }
// //     //Task 
// //     //Make a class Iphone that extends SmartPhone 
// //     //overrirde abstract functions 
// //     //make object of Samsung and Iphone 
// //     //call the function sms() and call()
// // class Iphone extends SmartPhone{
// //     @Override
// //     void sms(){
// //         System.out.println("Iphone way of sms");
// //     }
// //     @Override
// //     String call(int number){
// //         return "calling"+number;
// //         }
// // }

// /*You are building a shape hierarchy for a drawing application
//  * Design an abstract class named "Shape with the following abstract methods.
//  * 
//  * calculateArea():
//  * This method should calculate and return the area of the shape.
//  * 
//  * calculatePerimeter():
//  * This method should calculate and return the perimeter of the shape.
//  * 
//  * Implement the abstract class and provide concrete implementations for the abstract methods. Create subclasses for different shapes such as 'Circle'.
//  * "Rectangle","Triangle."
//  * Each subclass should provide specific implementations for 
//  * calculating the area and perimeter of that shape/
//  * Create instances of each shape class and demonstrate
//  * how you can calculate their respective areas and perimeters.
//  */

 abstract class Shape{
    abstract double calculateArea();
    abstract double calculatePerimeter();

 }

class Circle extends Shape{
    double radius=7;

    @Override
    double calculateArea(){
        return (3.14*radius*radius);
    }
    double calculatePerimeter(){
        return (2*3.14*radius);
    }
}
class Rectangle extends Shape{
    double length=20;
    double breadth=10;
    double calculateArea(){
        return length*breadth;
    }
    double calculatePerimeter(){
        return 2*(length+breadth);
    }
}
class Triangle extends Shape{
    double a1=10;
    double a2=15;
    double a3=12;
    double base=10;
    double height=5;
    double calculateArea(){
        return (base*height)/2;
    }
    double calculatePerimeter(){
        return (a1+a2+a3);
    }
}
