class Mythread extends Thread {
    public void run() {
        for(int i=1;i<=5;i++){
             System.out.println(i);
        }
       
    }
}

public class multithreading2 {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();
    }
}