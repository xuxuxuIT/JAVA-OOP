import java.util.*;
public class J2037_DayUuthe {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            String[]a= s.split(" ");
            int c1=0,c2=0;
            int n=a.length;
            for(String x: a){
                int val=Integer.parseInt(x);
                if(val%2==0){
                    c1++;
                }else{
                    c2++;
                }
            }
            if((n%2==0 && c1>c2)||(n%2==1&&c1<c2)) System.out.println("YES");
            else System.out.println("NO");
        }
    }   
}
