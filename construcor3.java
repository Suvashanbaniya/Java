public class construcor3 {
    class person{
        String name = "hari";
        int age = 20;

        //constructor
         person(String name , int age){
            this.name = name;
            this.age = age;
            System.out.println("The name and age of the person is "+name+age);

 
        }
    }
    public static void main(String[] args) {
        construcor3 obj = new construcor3();
        person p1 = obj.new person("ari",23);

        
    }
}
