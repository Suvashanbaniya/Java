public class multilevel {
    class anime {
        String eg = "naruto ,sasuke";
        void naruto(){
            
            System.err.println("This is the most famous anime");
            
        }
    }

    class animation extends anime{
        int popular = 12000000;
        void minion(){
            System.err.println("Minion is called animation movie :");
            System.out.println("anime are "+eg);
        }
    }
    class manwa extends animation{
        String name ="chinese anime";
        void infomanwa(){
            System.out.println("Manwa is mostly popular in china");
            System.out.println("They sold"+popular);
            System.out.println(eg);
        }

    }

    public static void main(String[] args) {
        multilevel obj = new multilevel();
        anime a1 = obj.new anime();
        manwa m2 = obj.new manwa();

        m2.infomanwa();
    }
    
}
