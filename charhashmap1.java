import java.util.HashMap;

public class charhashmap1 {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
         String s="aabbzce";
         for(int i=0;i<s.length();i++){
             map.put( s.charAt(i),map.getOrDefault( s.charAt(i),0)+1);
        } 
         for(int i=0;i<s.length();i++){
            if(map.get( s.charAt(i))==1){
                System.out.println( s.charAt(i));
                return ;
            }
        }
}
