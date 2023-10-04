import java.util.Scanner;

public class lucky_number {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            long n = scan.nextLong();
            int c=0;
            while(n%2==0){
                n=n/2;
                c++;
            }
            if(c%2==0){
                System.out.println("1");
            }else System.out.println("0");
        }
    }
}
