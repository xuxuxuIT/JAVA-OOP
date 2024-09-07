import java.util.*;
public class J3005_Chuanhoahoten2 {
    public static String chuanHoa( String s){
        s=s.trim().replaceAll("\\s+", " ");
        String[]a= s.split(" ");
        StringBuilder sb= new StringBuilder();
        for( String x: a){
            sb.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1).toLowerCase()).append(" ");
        }
        return sb.toString().trim();
    }
    public static String TiengAnh(String s){
        s=chuanHoa(s);
        String[]a= s.split(" ");
        String ho= a[0].toUpperCase();
        StringBuilder hoten= new StringBuilder();
        for( int i=1;i<a.length;i++){
            hoten.append(a[i]).append(" ");
        }
        return hoten.toString().trim()+", "+ho; 
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            System.out.println(TiengAnh(s));
        }
    }
}
