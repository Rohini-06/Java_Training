public class exception {
     public static void main(String[] args) {
        int a=10;
        int b=0;
        System.out.println("Start");
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by 0");
        }
        System.out.println("Program completed");
    }
}
