import java.util.*;
public class m_chuso_tong_s_max {
    public static String check( int m, int s){
        if(s==0 || m==1) return "0";
        if(s==0 || s>m*9) return "-1";
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<m;i++){
            int so= Math.min(9,s);
            sb.append(so);
            s -= so;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt(),s=sc.nextInt();
        System.out.println(check(m,s));
    }
}
