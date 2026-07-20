public class abstract5 {
     abstract class human{
        

        abstract void info();

        void info3(){
            System.out.println("this is the practice of the abstract ");

        }}

        class AI extends human{
            void info(){
                System.out.println("This is the call of the abstract");
            }
        }
         class  robo  extends AI{
            void info5(){
                System.out.println("This iss the info of the person ");
            }

        }

    
    public static void main(String[] args) {
        abstract5 obj = new abstract5();
        AI h1 = obj.new AI();
        robo r1 = obj.new robo();

       
        r1.info5();

    }
    
}
