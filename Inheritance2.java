public class Inheritance2 {

    // Parent Class
    class Person {

        String name;
        int age;

        // Constructor
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method
        void displayPerson() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    // Child Class
    class Student extends Person {

        String faculty;
        int semester;

        // Constructor
        Student(String name, int age, String faculty, int semester) {

            // Calls the constructor of the Person class
            super(name, age);

            this.faculty = faculty;
            this.semester = semester;
        }

        // Method
        void displayStudent() {
            System.out.println("Faculty: " + faculty);
            System.out.println("Semester: " + semester);
        }

        void study() {
            System.out.println(name + " is studying Java.");
        }
    }

    public static void main(String[] args) {

        // Create object of outer class
        Inheritance2 obj = new Inheritance2();

        // Create object of inner class Student
        Student s1 = obj.new Student("Suvashan", 22, "BICT", 4);

        // Parent class method
        s1.displayPerson();

        // Child class method
        s1.displayStudent();

        // Child class method
        s1.study();
    }
}