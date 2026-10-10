public class methodreturn {
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20));

        int r = add(15, 15);
        System.out.println(r);
    }
}