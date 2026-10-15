class Mythread extends Thread {
    public void run() {
        for(int i=1;i<=5;i++){
             System.out.println(i);
        }
       
    }
}
class Secondthread extends Thread {
    public void run() {
        for(int i=1;i<=5;i++){
             System.out.println(i);
        }
       
    }
}

public class multithreading3 {
    public static void main(String[] args) {
        Mythread t1= new Mythread();
        Secondthread t2= new Secondthread();
        t1.start();
        t2.start();
    }
}