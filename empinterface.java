import java.util.Scanner;
interface Employee{
    double calculateSalary();
}
class FullTime implements Employee{
    String name;
    double salary=30000;
    FullTime(String name){
        this.name=name;
    }
    public double calculateSalary(){
        return salary;
    }
    public void display(){
        System.out.println(name+"="+calculateSalary());
    }
}
class PartTime implements Employee{
    String name;
    int hrate;
    int hwork;
    PartTime(String name,int hrate,int hwork){
        this.name=name;
        this.hrate=hrate;
        this.hwork=hwork;
    }
    public double calculateSalary(){
        return hwork*hrate;
    }
    public void display(){
        System.out.println(name+"="+calculateSalary());
    }
}

    public class empinterface {
    public static void main(String[] args){
        FullTime f=new FullTime("Rohini");
        f.calculateSalary();
        f.display();
        PartTime p=new PartTime("Sowmiya",500,6);
        p.calculateSalary();
        p.display();
    }
}
