import java.util.Scanner;
public class srt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        boolean assort=true;
        boolean desort=true;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
           
                if(a[i]>a[i+1]){
                    assort=false;
                }
                if(a[i]<a[i+1]){
                    desort=false;
                }
            }
        if(assort){
          System.out.print("Sorted in ascending");
        }else if(desort){
         System.out.print("sorted in decending");
        }else{
            System.out.println("Not Sorted");
        }
        }
    }
