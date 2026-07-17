public class inheritence {
    class Animal{
       void eat(){
        System.out.println("This animal eat the food ");
       }
    }

    class Birds extends Animal {
        Birds(){
            System.out.println("this is the most famous bird name in nepal");

        }
    }

    public static void main(String[] args) {
        inheritence obj = new inheritence();
        Birds b1 = obj.new Birds();

      b1.eat();
      b1.Birds();
    }
    
}
