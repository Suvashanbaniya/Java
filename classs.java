public class classs{

    class bike  {
        int numb ;
        String name ;
        String model ;
    

    void descr(){
        System.out.println("This is the modern bike ");
    }

    void info(){
        System.out.println("This is the bike of the hero ");
    }
}

    public static void main(String[] args) {
        classs obj = new classs();
        bike b1 = obj.new bike();


        b1.numb = 123 ;
        b1.name = "hero honda ";
        b1.model = "f3";

        b1.descr();
        b1.info();


    System.out.println(b1.numb);
    System.err.println("This is the brand name "+b1.name);
    System.out.println("This is the model name "+ b1.model);
    }



}