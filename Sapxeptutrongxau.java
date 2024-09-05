import java.util.*;
// sxep theo thu tu tu dien tang dan
// sap xep theo chieu dai tang dan,co cung cd thi tu nao co thu tu tu dien nho hon in trc
public class Sapxeptutrongxau {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String []a= s.trim().split("\\s+");
        Arrays.sort(a); // in theo thu tu tu dien tang dan
        for( String x:a){
            System.out.print(x+" ");
        }   
        System.out.println("");
        Arrays.sort(a,new Comparator<String>(){
            @Override
            public int compare(String t, String t1) {
                if(t.length()!= t1.length())
                    return t.length()-t1.length();
                return t.compareTo(t1);              
            }          
        });
        for(String x: a){
            System.out.print(x+" ");          
        }
    }   
}
