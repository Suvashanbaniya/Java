public class inheritence3 {
    class Animal {
        String name = "doggo";
        int age = 23 ;
        void info(){

            System.out.println("This is the most human friendly animal");

        }
        void info3(){
            System.out.println("This is consider as the most loyal animal");

        }
    }

        class dog extends Animal{
            void info2(){
                System.out.println("This is the most loyal animal " +name+age);

            }
        }
        

    
    public static void main(String[] args) {
        inheritence3 obj =  new inheritence3();
        dog d1 = obj.new dog();

        d1.info2();
    }
    
}
