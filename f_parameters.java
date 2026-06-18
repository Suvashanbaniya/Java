public class f_parameters {
    static void greet(String name ) {
        System.out.println("Hello " + name);    
    }

    static void add(int a, int b ){
        int sum = a + b ; 
        System.out.println(sum);
    }

    
    public  static void main( String[] args){
    greet("Suvashan");
    greet("Hero");
    add( 1 ,2 );
    }
}
