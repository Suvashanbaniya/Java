public class function3 {

    class student{
        String name ; 
        int age ; 
        String faculty ;

        void study(){
            System.out.println("The student is very good in math ");

        }

        void  play (){
            System.out.println("This student play game in the free time ");

        }


    }

    public static void main(String[] args) {

        function3 obj = new function3();
        student s1 = obj.new student();

        student s2 = obj.new student();

        s1.name = "Hari das ";
        s2.faculty = "Scienece";
        s1.age = 13 ;


        s1.play();
        s2.study();
        


        System.out.println(s1.name);
        System.out.println(s2.faculty);
        System.out.println(s1.age);
        
    }
    
}
