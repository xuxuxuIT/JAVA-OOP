import java.util.*;
public class Demkitu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        int d1=0,d2=0,d3=0;
        for( int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(Character.isDigit(x)){
                d1++;
            }else if( Character.isAlphabetic(x)){
                d2++;
            }else{
                d3++; // ki tu dac biet
            }
        }
        System.out.println(d1+" "+d2+" "+d3);
    }
}
