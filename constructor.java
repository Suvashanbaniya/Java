public class constructor {

    class Laptop {
        String brand;
        int price ; 
        String name ;

    //This is the constructors 

   

    Laptop (){
        System.out.println("This laptop price range starts from 10000 to 600000");

    }

    // this is method 
    void manufacture() {
        System.out.println("This laptop is created in vietnam ");

    }
}
public static void main(String[] args) {
    constructor obj = new constructor ();
    Laptop l1 = obj.new Laptop();
    
    l1.name = "Acer v16 Modified ";
    l1.brand = "Acer";
    l1.price = 1200000;


    l1.manufacture();
   


    System.out.println(l1.brand);
    System.out.println(l1.price);
    System.out.println(l1.name);
}
    
}
