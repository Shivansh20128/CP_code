import java.util.Scanner;
class Scratch {
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int a = scan.nextInt();
        int x;int y;
        if(n%a==0){
            x=n/a;
        }else x=(n/a)+1;

        if(m%a==0){
            y=m/a;
        }else y=(m/a)+1;
        long ans = (long) x *y;
        System.out.println(ans);



    }
}
