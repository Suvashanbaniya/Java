public class ThisExample {

    class Student {

        // Variables (instance variables)
        String name;
        int age;

        // Constructor
        Student(String name, int age) {

            // 'this' refers to the current object's variables
            this.name = name;
            this.age = age;
        }

        // Method
        void display() {
            System.out.println("Student Name: " + name);
            System.out.println("Student Age: " + age);
        }

        // Another Method
        void study() {
            System.out.println(name + " is studying Java.");
        }
    }

    public static void main(String[] args) {

        ThisExample obj = new ThisExample();

        Student s1 = obj.new Student("Hari", 20);
        Student s2 = obj.new Student("Ram", 22);

        s1.display();
        s1.study();

        System.out.println();

        s2.display();
        s2.study();
    }
}