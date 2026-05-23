package Zzzz;

public class Student {

    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    void printInfo() {
        System.out.printf("Name: %s | Age: %d | GPA: %.1f\n", name, age, gpa);
    }

    public static void main(String[] args) {
       String name ="Suvam Gurung";
        System.out.println("Name: " + name);
    }
}
