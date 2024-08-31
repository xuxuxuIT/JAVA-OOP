import java.util.Scanner;
public class J2014_DiemCanBang {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int []a= new int [n];
            int sum=0;
            for( int i=0;i<n;i++){
                a[i]=sc.nextInt();
                sum += a[i];
            }
            int leftsum=0;
            boolean ok=false;
            for( int i=0;i<n;i++){
                sum -=a[i]; // tong cac phan tu ben phai
                if(leftsum==sum){
                    System.out.println(i+1);
                    ok=true;
                    break;
                }
                leftsum += a[i];
            }
            if(!ok) System.out.println("-1");
        }
    } 
}
