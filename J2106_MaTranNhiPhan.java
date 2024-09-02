import java.util.*;
public class J2106_MaTranNhiPhan {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        for( int i=0;i<n;i++){
            int cnt1=0,cnt2=0;
            for( int j=0;j<3;j++){
                int value=sc.nextInt();
                if(value==1){
                    cnt1++;
                }else{
                    cnt2++;
                }
            }
            if(cnt1>cnt2) cnt++;
        }
        System.out.println(cnt);
    } 
}
