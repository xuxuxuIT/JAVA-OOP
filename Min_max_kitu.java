import java.util.*;
// tim ki tu co tsxh max,min
public class Min_max_kitu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        int []d= new int[256];
        for( int i=0;i<s.length();i++){
            d[s.charAt(i)]++;
        }
        int min_fre=(int)1e9,max_fre=0;
        char min_val='a' , max_val='a';
        for( char c=0;c<256;c++){
            if(d[c]>=max_fre){
                max_val=c;
                max_fre=d[c];    
            }
            if( d[c]>0 && d[c]<min_fre){
                min_val=c;
                min_fre=d[c];
            }
        }
        System.out.println(min_val+" "+min_fre);
        System.out.println(max_val+" "+max_fre);
        
    }
}
