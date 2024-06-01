public class FirstOop {
    public static void main(String[] args) {
        // Person p1=new Person();
        // p1.name="Ram";
        // p1.age=10;
        // p1.gender='M';
        // p1.introduction();


        // Person p2=new Person();
        // p2.name="Harry";
        // p2.age=20;
        // p2.gender='F';
        // p2.introduction();

        // Person p3=new Person();
        // p3.name="Muskan";
        // p3.age=19;
        // p2.gender='F';
        // p2.introduction();

        // Square s1=new Square();
        // s1.sides=10;
        // int s1Area=s1.area();
        // System.out.println(s1Area);
        // System.out.println(s1.area());
        // s1.increaseSidex(2);
        // System.out.println(s1.area());

        
        // Rectangle r1=new Rectangle();
        // r1.length=15;
        // r1.breadth=5;
        // r1.info();
        // System.out.println("area of rectangl is: "+r1.area());
        // System.out.println("he perimeter of rectangle is "+r1.perimeter());

        Car c1=new Car();
        c1.name="Creta";
        c1.brand="Hyundai";
        c1.year=2018;

        Car c2=new Car();
        c2.name="exter";
        c2.brand="hyundai";
        c2.year=2020;

        c1.start();
        c2.start();
        c1.stop();
        c2.info();

    }
    
}
// class Rectangle{
//     double length;
//     double breadth;
//     double area(){
//         return length*breadth ;
//     }
//     double perimeter(){
//         return 2*(length+breadth);
//     }
//     void info(){
//         System.out.println("Length"+length+"Breadth"+breadth);
//     }
// }

//Task create class Car
//create attribute name,brand,year
//create a function expiry that returns year added with 100
//create a function start-> prints(name is starting)
//create a function stop -> prints(name,brand is stoping)
//create a function info -> pints(name ,brand and year)
//create 2 objects
//fill attribute of both
//start both object
//stop 1st object
//info of 2nd object


class Car{
    String name;
    String brand;
    int year;
    int exp(){
        return year+100;
    }
    void start(){
        System.out.println( name+""+"is starting.");
    }
    void stop(){
        System.out.println(name+","+brand+"is stopping.");
    }
    void info(){
        System.out.println(name+","+brand+"and"+year);
    }
}
// class Square{
//     int sides;
//     int area(){
//         return sides*sides;
//     }
//     void increaseSidex(int val){
//         sides=sides+val;
//     }
// }
// class Person{
//     String name;
//     int age;
//     char gender;

//     void  introduction(){
//         System.out.println("My name is "+name);
//     }

// }

