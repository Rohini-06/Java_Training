@FunctionalInterface
interface Check {
    void more5(String a);
}

public class strinterface1 {
    public static void main(String[] args) {
        Check c = (a) -> {
            if (a.length() > 5) {
                System.out.println("More than 5 Characters");
            } else {
                System.out.println("5 or Fewer Characters");
            }
        };

        c.more5("Rohini");
    }
}