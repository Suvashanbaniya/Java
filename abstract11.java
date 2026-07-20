public class abstract11 {
    abstract class games{
        abstract void info();
    
        void info2(){
            System.out.println("This is the example of game of thrones");
        }
       
    }

    class Desci extends games{
        @Override
        void info(){
            System.out.println("These are the games that we usaualluy play in the lap[topo");
        }
    }

    public static void main(String[] args) {
        abstract11 obj = new abstract11();
        Desci d1 = obj.new Desci();
        d1.info();
        d1.info2();
    }

    
}
