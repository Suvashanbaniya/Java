public class contructor1 {
    class mobile {
        mobile(String name ){
            System.out.println("This is an android phone"+name);

        }
        mobile (int price){
            System.out.println("The price of the phone is "+price);
        }
        void desc(){
            System.out.println("This is the latest phone and it have a lot of greate features ");
        }



    }

    public static void main(String[] args) {
        contructor1 obj = new  contructor1();
        

        mobile m2 =obj.new mobile("Redmi");
        mobile m3 = obj.new mobile(19000);

        m2.desc();
        


    }
    
}
