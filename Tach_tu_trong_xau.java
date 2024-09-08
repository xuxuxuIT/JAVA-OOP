import java.util.*;
public class Tach_tu_trong_xau {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= "ngon   ?ngu lap.trinh!";
        s=s.replace('?',' ');
        s=s.replace('.', ' ');
        s=s.replace('!', ' ');
        String []a= s.split("\\s+");
        for(String x:a ){
            System.out.println(x+" ");
        }     
    }  
}
