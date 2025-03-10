package excersices_;
import java.util.Scanner;
public class Objeto {
    String name;
    int id;
    double grades;
    double totalGrades=0;
    int subjects;
     Scanner input = new Scanner(System.in);

    public Objeto(String n, int id){
        this.name=n;
        this.id=id;
        
    }
    public void inputGrades(int s){
        this.subjects=s;
        for(int x=1; x<=s;x++){
            System.out.println("Enter grade for subject "+x+ " :");
            grades= input.nextInt();
            totalGrades+=grades;
        } System.out.println();
    }
    public double calculateAverage(){
        double sum=0;
        return totalGrades/(this.subjects);
    }
    public void displayInfo(){
        System.out.print("Student name: "+this.name+"\n");
        System.out.print("Student ID: "+this.id+"\n");
        System.out.printf("Average Grade: %.2f\n", this.calculateAverage());
    }
    
}
