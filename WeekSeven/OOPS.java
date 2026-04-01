// print students name and age
package WeekSeven;


/**
 * Write a description of class OOPS here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

class Student {
    private String name;
    private int age;
    
   public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void printInfo() {
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
    }
}

public class OOPS {
    
    public static void main(String[] args) {
        System.out.println('\u000C');
    Student s1 = new Student("Suvam Gurung", 19);
    s1.printInfo();
    }
}