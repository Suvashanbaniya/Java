import java.util.Scanner;
public class input2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the name");
        

        int age = sc.nextInt();
        String name = sc.next();
        System.out.println("hello" +name);
        System.err.println("This is the age of the person"+age);
    }
    
}
