public class hybrid {
    interface sport{
        String eg = "football , cricket , badminton";
        void info();
    }
    interface esport{
        String eg2 = "dota, pubg , valorent";
        void info2();
    }
    class Physical implements sport,esport{
        public void info (){
            
            System.out.println("There are the pysical sport"+eg); 

        }
        public void info2(){
            System.out.println("They are the esports and indoor game "+eg2);
        }
    }

    public static void main(String[] args) {
        hybrid obj = new hybrid();
        Physical p1 = obj.new Physical();

        p1.info();
        p1.info2();
    }
}
