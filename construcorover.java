public class construcorover {

    class football{

        football() {
            System.out.println("This is the physical game ");

        }

        football (String name){
            System.out.println("The footballer name is "+name);
        }

        football(int ticket){
            System.out.println("The ticket price is "+ ticket);
            
        }

        void edition(){
            System.out.println("This is the worldcup 6th edition");
        }
        
    }

    public static void main(String[] args) {
        construcorover obj = new construcorover();
        football f1 = obj.new football();
        
        football f2 = obj.new football("Halland");
        football f3 = obj.new football(2000);

    f1.edition();


    }
    
}
