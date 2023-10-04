import java.util.Scanner;

public class color_the_cube {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int x1 = scan.nextInt();
            int x2 = scan.nextInt();
            int x3 = scan.nextInt();
            int x4 = scan.nextInt();
            int x5 = scan.nextInt();
            int x6 = scan.nextInt();
            if(n%2!=0){
                n=n+1;
            }
            n=n/2;
            long ans = (x1+x2+x3+x4+x5+x6);
            ans = ans*n;
            System.out.println(ans);
        }
    }
}
