import java.util.Scanner;
class unique_digit_year {
    public static boolean isUnique(String str){
        char a = str.charAt(0);
        char b = str.charAt(1);
        char c = str.charAt(2);
        char d = str.charAt(3);
        if(a==b || a==c || a==d || b==c || b==d || c==d){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        while(true) {
            String year = String.valueOf(n+1);
            if (isUnique(year)) {
                System.out.println(year);
                break;
            } else {
                n++;
            };
        }


    }
}
