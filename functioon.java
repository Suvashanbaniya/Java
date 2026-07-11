public class functioon {
    class Car {
        String brand;
        String color ;
        int speed;

        void start(){
            System.out.println("Car started");
            
        }
        void stop(){
            System.out.println("car is stopped");
        }
        
    }

    
        public static void main (String[] args){

            functioon obj = new functioon();
            Car c1 =  obj.new Car();

            c1.brand = "Toyata";
            c1.color = "red";


            System.err.println(c1.brand);
            System.err.println(c1.color);

            c1.start();
            c1.stop();
        }
    }
    

