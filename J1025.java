import java.util.Scanner;
public class J1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
        int x3 = sc.nextInt(), y3 = sc.nextInt(), x4 = sc.nextInt(), y4 = sc.nextInt();
        int minX = Math.min(x1, x3);
        int maxX = Math.max(x2, x4);
        int minY = Math.min(y1, y3);
        int maxY = Math.max(y2, y4);
        int dai = maxX - minX;
        int rong = maxY - minY;
        int canh = Math.max(dai, rong);
        System.out.println(canh * canh);
    }   
}
