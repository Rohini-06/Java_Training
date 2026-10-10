class Student {
    String name;
    int roll;
    double cgpa;

    void display() {
        System.out.println(name + " " + roll + " " + cgpa);
    }
}

public class classobj {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rohini";
        s1.roll = 129;
        s1.cgpa = 9.13;

        Student s2 = new Student();
        s2.name = "Sowmiya";
        s2.roll = 154;
        s2.cgpa = 8.2;

        s1.display();
        s2.display();
    }
}