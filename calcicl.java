class Calculator {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void sub(int a, int b) {
        System.out.println(a - b);
    }

    void mul(int a, int b) {
        System.out.println(a * b);
    }

    void mul(int a, float b) {
       System.out.println(a*b);
    }

    void div(int a, int b) {
         if (b == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            System.out.println(a / b);
    }
}
}

public class calcicl {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.add(10, 20);
        c.add(10, 20, 30);
        c.sub(20, 10);
        c.mul(10, 5);
        c.mul(10, 2.5f);
        c.div(10, 5);
        c.div(10,0);
    }
}