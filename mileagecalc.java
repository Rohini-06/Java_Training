class MileageCalculator{
    void mileage(double distance,double fuel){
        System.out.println(distance/fuel);
    }
    void cost(double distance,double mileage,double price){
        System.out.println(price*(distance/mileage));
    }
    void fuel(double distance,double mileage){
        System.out.println(distance/mileage);
    }
}
public class mileagecalc {
    public static void main(String[] args){
        MileageCalculator c=new MileageCalculator();
        c.mileage(30,2);
        c.cost(30,15.0,108);
        c.fuel(40,10);

    }
}
