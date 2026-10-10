import java.util.Scanner;
class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{

}
public class inheritbasic{
    public static void main(String[] args){
        Dog d=new Dog();
        d.sound();
    }
}
