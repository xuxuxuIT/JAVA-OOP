import java.util.Scanner;
// dem so lan xuat hien cua cac so trong mang
public class J2007 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        int lan=1;
        while(t-->0){
            int n=sc.nextInt();
            int[]a= new int[n];
            int []cnt=new int [1001];
            for( int i=0;i<n;i++){
                a[i]=sc.nextInt();
                cnt[a[i]]++;
            }
            System.out.println("Test "+lan+":");
            for( int i=0;i<n;i++){
                if(cnt[a[i]] !=0){
                    System.out.println(a[i]+" xuat hien "+cnt[a[i]]+" lan");
                    cnt[a[i]]=0;
                }
            }
            lan++;
        }
    }
}
   
