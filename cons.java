import java.util.Scanner;
class Account{
    String name;
    int Amount;
    Account(String name,int Amount){
        this.name=name;
        this.Amount=Amount;
    }
    void deposit(int a){
        Amount+=a;
    }
    void withdraw(int a){
        Amount-=a;
    }
    void balance(){
        System.out.print(Amount);
    }
}
public class cons {
    public static void main(String[] args){
        Account a1=new Account("Rohini",2000);
        a1.deposit(1000);
        a1.withdraw(500);
        a1.balance();
    }
}
