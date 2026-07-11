public class function2 {

    class movie {
        String name ;
        int length ;
        String director ; 


        void start (){
            System.err.println("This movie will release in 2028");
        }

        void budget(){
            System.err.println("This movie budget is $400000");
        }
    }

    public static void main(String[] args) {
        
        function2 obj = new function2();

        movie m1 = obj.new movie();

        m1.name = "Dune";
        m1.length = 12;

        System.out.println(m1.name);
        System.out.println(m1.length);

        m1.start();
        m1.budget();

    }
    
}
