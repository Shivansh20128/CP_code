import java.util.Scanner;

public class number_of_rectangles {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int m = scan.nextInt();
            long total = ((long) n *(n+1)/2) * ((long) m *(m+1)/2);
            long sub = (long) m *n;
            long ans = total-sub;
            System.out.println(ans);
        }
    }
}
