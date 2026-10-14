import java.util.Scanner;
interface Employee{
    void calculateSalary(int hwork);
}
class FullTime implements Employee{
    public void calculateSalary(int hwork){
        System.out.println("30,000");
    }
}
class PartTime implements Employee{
    int hrate=500;
    int hwork;
    public void calculateSalary(int hwork){
        System.out.println(hwork*hrate);
    }
}

    public class employeeinterface {
    public static void main(String[] args){
        FullTime f=new FullTime();
        f.calculateSalary(12);
        PartTime p=new PartTime();
        p.calculateSalary(6);
    }
}
