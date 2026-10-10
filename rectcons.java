class Rectangle {
    int len;
    int br;

    Rectangle(int len, int br) {
        this.len = len;
        this.br = br;
    }

    int area() {
        return len * br;
    }

    int perimeter() {
        return 2 * (len + br);
    }
}

public class rectcons {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);

        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
    }
}