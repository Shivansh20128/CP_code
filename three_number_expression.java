import java.util.Scanner;

public class three_number_expression {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            long a = scan.nextLong();
            long b = scan.nextLong();
            long c = scan.nextLong();
            if(a+b+c==0 || a+b-c==0 || a-b+c==0 || a-b-c==0 || -a+b+c==0 || -a+b-c==0 || -a-b+c==0 || -a-b-c==0){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}
