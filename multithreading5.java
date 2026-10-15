class Mythread extends Thread {
    public void run() {
        for(int i=1;i<=100;i++){
             System.out.println(i);
        }
       
    }
}
class Secondthread extends Thread {
    public void run() {
        for(int i=1;i<=100;i++){
             System.out.println(i);
        }
       
    }
}

public class multithreading5 {
    public static void main(String[] args) {
        Mythread t1= new Mythread();
        Secondthread t2= new Secondthread();
        t1.run();
        t2.run();
    }
}