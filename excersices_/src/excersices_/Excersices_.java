package excersices_;
import java.util.Scanner;

public class Excersices_ {
    public static void main(String[] args) {
     String name;
     int id;
     double grades;
     int subjects;
     Scanner input = new Scanner(System.in);
     System.out.println("Enter student name: ");
     name= input.nextLine();
     
     System.out.println("Enter student ID: ");
     id= input.nextInt();
     
     System.out.print("Enter number of subjects: ");
     subjects= input.nextInt();
     System.out.println();
     Objeto Student1= new Objeto(name,id);
     Student1.inputGrades(subjects);
     Student1.calculateAverage();
     Student1.displayInfo();
    }
    
}
