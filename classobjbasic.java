class Student {
    String name;
    int roll;
    double cgpa;
}

public class classobjbasic {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rohini";
        s1.roll = 129;
        s1.cgpa = 9.13;

        Student s2 = new Student();
        s2.name = "Sowmiya";
        s2.roll = 154;
        s2.cgpa = 8.2;
        System.out.println(s1.name);
    }
}