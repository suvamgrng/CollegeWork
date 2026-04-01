package WeekNine;


/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Dog {
    private String name;
    private String breed;
    private int price;
    private int age;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getBreed() {
        return breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        if (price >= 13000) {
        this.price = price;
    }
    else {
        System.out.println("Insufficient amount");
    }
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    if (age > 0) {
        this.age = age;
    }
    else {
        System.out.println("Age cannot be negative");
    }
}
}

public class Main {
    
public static void main(String[] args) {
    Dog dog1 = new Dog();

    dog1.setName("Michael");
    dog1.setBreed("Husky");
    dog1.setPrice(14000);
    dog1.setAge(1);
    
    System.out.println("Name: " + dog1.getName());
    System.out.println("Breed: " + dog1.getBreed());
    System.out.println("Price: " + dog1.getPrice());
    System.out.println("Age: " + dog1.getAge());
    
}
}