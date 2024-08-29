import java.util.Scanner;
// phan tich thua snt
public class J1008 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        int lan=1;
        while(t-->0){
            int n=sc.nextInt();
            String res="Test "+ lan +": ";
            for( int i=2;i<=Math.sqrt(n);i++){
                int cnt=0;
                while(n%i==0){
                    cnt +=1;
                    n/=i;               
                }
                if(cnt>0) res += i + "(" + cnt + ")";
            }
            if(n>1) res += n + "(1)";
            System.out.println(res);
            lan++;
        }       
    }  
}
