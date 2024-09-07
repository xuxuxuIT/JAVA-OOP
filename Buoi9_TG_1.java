import java.util.*;
// tim cac tu giao cua hai xau khong phan biet hoa thuong , in ra theo thu tu tu dien
public class Buoi9_TG_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HashSet<String> se1= new HashSet<>();
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String []a= s1.trim().split("\\s+");
        String []b= s2.trim().split("\\s+");
        TreeSet<String> tm= new TreeSet<>();
        for( String x : a){
            x=x.toLowerCase();
            se1.add(x);
        }
        for( String x: b){
            x=x.toLowerCase();
            if(se1.contains(x)){
                tm.add(x);
            }           
        }
        for(String x: tm){
            System.out.print(x+" ");
        }
    }
}
