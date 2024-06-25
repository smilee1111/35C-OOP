public class Polymorphism{
    public static void main(String[] args){
        MathOperation mo = new MathOperation();
        System.out.println(mo.add(1,2));
        System.out.println(mo.add(2,3,4));
        mo.add();

        // Method overrding
        // Polymorphism allows child object to be
        // held on parent variable
        Document d1 = new Document();
        d1.print("White");
        Document d2 = new MsWord();
        d2.print("Black");
        // when doing so, although the variable is
        // Document it will run the overriden method
        Document d3 = new Office365();
        d3.print("Yellow");
        // Note: When storing child object on parent
        // variable, only the attribute and function
        // of parent can be used
        // EG: d3.online -> cannot be used
    }
}
// Method Overloading - Compiletime polymorphism
// In a class, have same function multiple time with differences
// in parameters
class MathOperation{
    int add(int num1, int num2){
        return num1 + num2;
    }
    // 1. Changing the number of parameters
    int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    // 2. Changing the data type
    double add(double num1, double num2){
        return num1 + num2;
    }
    // Note: Methodoverloading is only possible with unique paramter/arguement data type
    // Cannot make function changing variable name
    // EG: int add(int a, int b) ->
    // cannot be made as function with 2 int is already made
    // Cannot overload just by changing return type
    // EG: double add(int num1, int num2) -> 
    //cannot be made as function with 2 int is already made
    void add(){
        System.out.println("Invalid operation");
    }
}

// Method Overriding - Runtime Polymorphism
// When a child class has the same function as parent class
class Document{
    public void print(String paper){
        System.out.println("Basic Document printing");
    }
}
// Method overriding is only possible in child class 
class MsWord extends Document{
    // when overriding, should be the same function as parent
    @Override
    public void print(String paper){
        System.out.println("Ms word prints");
    }
}
// Method overriding in multi layer inheritance
class Office365 extends MsWord{
    boolean online = false;
    @Override
    public void print(String paper){
        System.out.println("Online printing");
    }
}




// Homework

// Make a class Spreadsheet
// Make a function addRow that takes one int -> print( int row added)
// Make a function addColumn that takes one int -> print( int coloumn added)
// Make a subclass from Spreadsheet, MsExcel
// override both the function and print different output
// make attribute fileType as String
// Make an object of Spreadsheet
// Make an Object of Spreadsheet as MsExcel
// run both function from each object

// Task
// Make a function substraction
// take two int and return int
// take three double and return double
// take 1 double and print invalid operation
// take 1 int and print invalid operation
// take 2 int and double and return double
// call these function from MathOperation object 