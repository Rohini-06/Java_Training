class Student{
    String name;
    int roll;
    double cgpa;
    Student(String n,int r,double c){
        name=n;
        roll=r;
        cgpa=c;
    }
    void display(){
        System.out.println(name+" "+roll+" "+cgpa);
    }
}
public class conss{
    public static void main(String[] args){
        Student s1=new Student("Rohini",129,9.13);
        Student s2=new Student("Sowmiya",154,8.2);
        s1.display();
        s2.display();
    }
}
