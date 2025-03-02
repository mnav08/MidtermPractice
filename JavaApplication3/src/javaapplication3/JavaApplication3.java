package javaapplication3;
import java.util.Scanner;


public class JavaApplication3 {
    public static void main(String[] args) {
        String name;
        int age;
        int rating;
        String position;
        
        Scanner sc= new Scanner(System.in);
      
        System.out.print("Enter player name: ");
        name=  sc.nextLine();
        
         System.out.print("Enter player age: ");
         age=  sc.nextInt();
         
         System.out.print("Enter player rating: ");
        rating=  sc.nextInt();
        // Consume the leftover newline character
        sc.nextLine(); // This is important to move past the newline after nextDouble()
         System.out.print("Enter player position: ");
        position=  sc.nextLine();
        System.out.println();
     
        Player cr= new Player(name,position,age,rating);
        System.out.println("Your player is "+cr.getName());
        System.out.println("His position is "+cr.getPosition());
        System.out.println("His age is "+cr.getAge());
        System.out.println("Rating--> "+cr.getRating());
       
    }
    
}
