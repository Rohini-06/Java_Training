class Student {
    int m1;
    int m2;
    int m3;

    Student(int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    double average() {
        return (m1 + m2 + m3) / 3.0;
    }

    char grade() {
        double avg = average();

        if (avg >= 90)
            return 'A';
        else if (avg >= 70)
            return 'B';
        else if (avg >= 60)
            return 'C';
        else if (avg >= 40)
            return 'D';
        else if (avg >= 30)
            return 'E';
        else
            return 'F';
    }

    String result() {
        if (m1 >= 35 && m2 >= 35 && m3 >= 35)
            return "Pass";
        else
            return "Fail";
    }
}

public class markclass {
    public static void main(String[] args) {
        Student s1 = new Student(80, 90, 70);

        System.out.println("Average: " + s1.average());
        System.out.println("Grade: " + s1.grade());
        System.out.println("Result: " + s1.result());
    }
}