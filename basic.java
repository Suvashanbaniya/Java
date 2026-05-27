import java.util.Scanner;
public class basic {
    public static void main(String[] args) {
        System.out.println("Name: Suvashan Baniya");
        System.out.println("Age:20");
        System.out.println("Height:5.6");
        System.out.println("Student : True");

        
        // learning input from the user 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Enter your age:");
        int age = sc.nextInt();
        sc.nextLine();
        

        System.out.println("Enter your location :");
        
        String location = sc.nextLine();
        sc.nextLine();



        if(age>=18){
            System.out.println("He is eligible for going out alone");

            }

        else{
            System.out.println("He is not eligible to go out ");
        }    
        
        System.out.printf("He is  %s , His age is %d , His location is %s", name,age,location);
        sc.close();


    }
    }

    

         
