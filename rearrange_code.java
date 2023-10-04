import java.util.Scanner;

public class rearrange_code {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            String str = scan.next();
            String ans="";
//            for(int i=0;i<n;i+=2){
                for(int i = 0; i < str.length(); i = i + 2)
                {
                    if( (str.charAt(i) == '0') && (str.charAt(i+1) == '0') )
                        System.out.print("A");
                    if( (str.charAt(i) == '0') && (str.charAt(i+1) == '1') )
                        System.out.print("T");
                    if( (str.charAt(i) == '1') && (str.charAt(i+1) == '0') )
                        System.out.print("C");
                    if( (str.charAt(i) == '1') && (str.charAt(i+1) == '1') )
                        System.out.print("G");
                }
            System.out.println();
//            }
        }
    }
}
