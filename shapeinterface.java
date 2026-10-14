interface Shape {
    double calcarea();
}
class Square implements Shape {
    int s;
    Square(int s) {
        this.s = s;
    }
    public double calcarea() {
        return s * s;
    }
}
class Circle implements Shape {
    double r;
    Circle(double r) {
        this.r = r;
    }
    public double calcarea() {
        return 3.14 * r * r;
    }
}
public class shapeinterface {
    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println( s.calcarea());
        Circle c = new Circle(2.5);
        System.out.println(c.calcarea());
    }
}