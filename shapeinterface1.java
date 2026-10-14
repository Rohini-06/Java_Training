interface Shape {
    void calcarea(int a);
}
class Square implements Shape {
    public void calcarea(int s) {
        System.out.println(s*s);
    }
}
class Circle implements Shape {
    public void calcarea(int r) {
       System.out.println(3.14 * r * r);
    }
}
public class shapeinterface1 {
    public static void main(String[] args) {
        Square s = new Square();
         s.calcarea(5);
        Circle c = new Circle();
        c.calcarea(3);
    }
}