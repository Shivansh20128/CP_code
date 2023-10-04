import java.util.Locale;
import java.util.Scanner;
class strings_comparision {
    static int row;static int column;
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        str1 = str1.toLowerCase(Locale.ROOT);
        str2 = str2.toLowerCase(Locale.ROOT);
        int ans = (str1.compareTo(str2));
        if(ans<0){
            System.out.println(-1);
        }else if(ans==0){
            System.out.println(0);
        }else if(ans>0){
            System.out.println(1);
        }

    }
}
