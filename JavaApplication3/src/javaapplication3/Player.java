package javaapplication3;
public class Player {
    // attributes 
    private String name;
    private int rating;
    private int age;
    private String position;
    
    public Player(String n, String pos, int a, int rt){ // Constructor to initialize the object
        this.name=n;
        this.rating=rt;
        this.position=pos;
        this.age=a;
    }
    
    public String getName(){
        return this.name;
    }
     public int getRating(){
        return this.rating;
    }
     public int getAge(){
        return this.age;
    }
     public String getPosition(){
        return this.position;
    }
     
    
    
}
