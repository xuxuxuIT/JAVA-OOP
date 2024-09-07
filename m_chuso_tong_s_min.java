import java.util.*;
public class m_chuso_tong_s_min {
    public static String check( int m , int s){
        if( s==0 && m==1) return "0";
        if( s==0 && s>m*9) return "-1";
        int []digit= new int[m];
        s--; // danh donvi cho chu so dau tien
        for( int i=m-1;i>0;i--){
            if(s>9){
                digit[i]=9;
                s-=9;
            }else{
                digit[i]=s;
                s=0;
            }
        }
        digit[0]=s+1;
        StringBuilder sb= new StringBuilder();
        for( int x: digit){
            sb.append(x);
        } 
        return sb.toString();
    } 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt(),s=sc.nextInt();
        System.out.println(check(m,s));
    }
}
