public class shapemor {

    static int area(int s) {
        return s * s;
    }

    static int area(int l, int b) {
        return l * b;
    }

    static double area(double r) {
        return 3.14 * r * r;
    }

    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(5, 10));
        System.out.println(area(2.5));
    }
}