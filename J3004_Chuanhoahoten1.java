import java.util.*;
public class J3004_Chuanhoahoten1 {
    public static String chuanHoa(String s){
        s=s.trim().replaceAll("\\s+", " ");
        String[] a =s.split(" ");
        StringBuilder sb= new StringBuilder();
        for(String x:a){
            sb.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1).toLowerCase()).append(" ");
        }
        return sb.toString().trim();        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            System.out.println(chuanHoa(s));
        }
    }
}

