public class exception3 {
     public static void main(String[] args) {
        int a=10;
        int b=0;
        System.out.println("Start");
        try{
            System.out.println("Entered Try Block");
            System.out.println(a/b);
            System.out.println("Completed Try Block");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Program completed");
    }

}
