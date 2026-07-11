// This class represents a Student blueprint
class Student {

    // variables (properties of the class)
    String name;   // stores student name
    int age;       // stores student age

    // constructor (runs automatically when object is created)
    Student(String n, int a) {

        // assigning parameter values to class variables
        name = n;
        age = a;
    }

    // method to display student details
    void show() {

        System.out.println(name); // prints name
        System.out.println(age);  // prints age
    }
}

// Main class (program starts here)
public class Main {

    public static void main(String[] args) {

        // creating object of Student class
        Student s1 = new Student("Suvashan", 26);

        // calling method using object
        s1.show();
    }
}