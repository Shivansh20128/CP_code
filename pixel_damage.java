import java.util.Scanner;

public class pixel_damage {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int h = scan.nextInt();
            int w = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            int k = scan.nextInt();
            int s1 = (x-w)*(x-w);
            int s2 = (y-h)*(y-h);
            int s = s1+s2;
            double d = Math.sqrt(s);
            if(d<k){
                System.out.println(1);
            }else System.out.println(0);
        }
    }
}
