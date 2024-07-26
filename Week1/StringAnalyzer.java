// import java.util.ArrayList;
// import java.util.List;

// public class AssignmentOop {
//     public static void main(String[] args) {
// //         // Student s1=new Student();
// //         // s1.printProfile(1, "Muskan KC",3.90);
// //         // s1.updateGPA(4);
// //         // Create a new shopping cart
// // ShoppingCart cart = new ShoppingCart("12345", "John Doe");

// // // Add items to the cart
// // Product book = new Product("Harry Potter", 19.99);
// // Product headphones = new Product("Noise-Cancelling Headphones", 99.99);
// // cart.addItem(book);
// // cart.addItem(headphones);

// // // Remove an item from the cart
// // cart.removeItem(book);

// // // Calculate the total cost
// // double total = cart.calculateTotal();
// // System.out.println("Total cost: $" + total);
//     }
// }
// // class Student{
// //     public int studentID;
// //     public String name;
// //     public double GPA;
// //     public void updateGPA(double newGPA){
// //         this.GPA=newGPA;
// //         System.out.println("new GPA is "+this.GPA);
// //     }
// //     public void printProfile(int studentID,String name, double GPA){
// //         this.studentID=studentID;
// //         this.name=name;
// //         this.GPA=GPA;
// //         System.out.println("Student ID"+this.studentID);
// //         System.out.println("Name:"+this.name);
// //         System.out.println("GPA:"+this.GPA);
// // }
// // }
// // class Product{
// //     private String name;
// //     private double price;
// //     public Product(String name,double price){
// //         this.name=name;
// //         this.price=price;
// //     }
// //         public String getName() {
// //             return this.name;
// //         }
// //         public double getPrice() {
// //             return this.price;
// //         }
// // }
// // class ShoppingCart{
// //     private String cartID;
// //     private String cusname;
// //     private List<Product> items;
// //     public ShoppingCart(String cartID,String customerName){
// //         this.cartID=cartID;
// //         this.cusname=cusname;
// //         this.items=new ArrayList<>();


// //     }
// //     public void addItem(Product product){
// //         this.items.add(product);
// //         System.out.println(product.getName()+"Added to cart");
        
// //     }
// //     public void removeItem(Product product) {
// //         if (this.items.remove(product)) {
// //             System.out.println("Removed " + product.getName() + " from the cart.");
// //         } else {
// //             System.out.println(product.getName() + " is not in the cart.");
// //         }
// //     }

// //     public double calculateTotal() {
// //         return this.items.stream().mapToDouble(Product::getPrice).sum();
// //     }

// //     public String getCartID() {
// //         return this.cartID;
// //     }

// //     public String getCusName() {
// //         return this.cusname;
// //     }

// //     public List<Product> getItems() {
// //         return this.items;
// //     }
// // }
// import java.util.Scanner;

// public class EmailValidator {

//     public static void main(String[] args) {
//         try {
//             String email = getUserInput();
//             System.out.println("Valid email: " + email);
//         } catch (InvalidEmailException e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }

//     public static String getUserInput() throws InvalidEmailException {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a valid email address: ");
//         String input = scanner.nextLine();

//         if (!isValidEmail(input)) {
//             throw new InvalidEmailException("Invalid email address format.");
//         }

//         return input;
//     }

//     private static boolean isValidEmail(String email) {
//         int atIndex = email.indexOf("@");
//         int dotIndex = email.lastIndexOf(".");

//         return (atIndex > 0 && dotIndex > atIndex && dotIndex < email.length() - 1);
//     }

//     public static class InvalidEmailException extends Exception {
//         public InvalidEmailException(String message) {
//             super(message);
//         }
//     }
// }
// import java.util.Scanner;

// public class ArrayOperations {

//     public static void main(String[] args) {
//         int[] numbers = getUserInput();
//         int maxValue = max(numbers);
//         int indexOfHighest = indexOfHighest(numbers);

//         System.out.println("Entered integers: ");
//         printArray(numbers);
//         System.out.println("Maximum value: " + maxValue);
//         System.out.println("Index of highest element: " + indexOfHighest);
//     }

//     public static int[] getUserInput() {
//         Scanner scanner = new Scanner(System.in);
//         int[] numbers = new int[5];

//         System.out.println("Enter 5 integer values:");
//         for (int i = 0; i < 5; i++) {
//             numbers[i] = scanner.nextInt();
//         }

//         return numbers;
//     }

//     public static int max(int[] numbers) {
//         int maxValue = numbers[0];
//         for (int i = 1; i < numbers.length; i++) {
//             if (numbers[i] > maxValue) {
//                 maxValue = numbers[i];
//             }
//         }
//         return maxValue;
//     }

//     public static int indexOfHighest(int[] numbers) {
//         int maxValue = max(numbers);
//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] == maxValue) {
//                 return i;
//             }
//         }
//         return -1; // If no elements are found, return -1
//     }

//     public static void printArray(int[] numbers) {
//         for (int num : numbers) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }
// }
import java.util.Scanner;

public class StringAnalyzer {

    public static void main(String[] args) {
        String sentence = getUserInput();
        int vowelCount = countVowels(sentence);
        int consonantCount = countConsonants(sentence);

        System.out.println("Entered sentence: " + sentence);
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        return scanner.nextLine();
    }

    public static int countVowels(String sentence) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < sentence.length(); i++) {
            if (vowels.contains(String.valueOf(sentence.charAt(i)))) {
                count++;
            }
        }
        return count;
    }

    public static int countConsonants(String sentence) {
        int count = 0;
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        for (int i = 0; i < sentence.length(); i++) {
            if (consonants.contains(String.valueOf(sentence.charAt(i)))) {
                count++;
            }
        }
        return count;
    }
}