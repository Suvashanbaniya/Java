public class interface5 {
    interface hobby {
        void sound();
       
    }
    interface games{
        void physical();
    }


    class person implements hobby,games{
        @Override
        public void sound(){
            System.out.println("guitar is the sound of game");
        }
        @Override
        public void physical(){
            System.out.println("This is the physical sport");

        }
        

    }
    public static void main(String[] args) {
        interface5 obj = new interface5();
        person p1 = obj.new person();

        p1.sound();
        p1.physical();
    }
    
}
