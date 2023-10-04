import java.util.Scanner;

public class blobby_volley_scores {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            String str = scan.next();
            int serve=0;
            int a=0;int b=0;
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='A'){
                    if(serve==0){
                        a++;
                    }else serve=0;
                }else{
                    if(serve==1){
                        b++;
                    }else serve=1;
                }
            }
            System.out.println(a+ " " +b);
        }
    }
}
