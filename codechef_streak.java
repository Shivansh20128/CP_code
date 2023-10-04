import java.util.Scanner;

public class codechef_streak {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int[] A = new int[n];
            int[] B = new int[n];
            for(int i=0;i<n;i++){
                A[i] = scan.nextInt();
            }
            for(int i=0;i<n;i++){
                B[i] = scan.nextInt();
            }

            int a = 0;int b = 0;
            int c=0;
            for(int i=0;i<n;i++){
                if(A[i]==0){
                    a = Math.max(a,c);
                    c=0;
                }else{
                    c++;
                }
            }
            a = Math.max(a,c);
            c=0;
            for(int i=0;i<n;i++){
                if(B[i]==0){
                    b = Math.max(b,c);
                    c=0;
                }else{
                    c++;
                }
            }
            b = Math.max(b,c);

            if(a>b){
                System.out.println("Om");
            }else if(a==b){
                System.out.println("Draw");
            }else System.out.println("Addy");



        }
    }
}
