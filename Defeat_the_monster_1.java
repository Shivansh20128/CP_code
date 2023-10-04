import java.util.Scanner;

public class Defeat_the_monster_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int h = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (-x + y >= 0) {
                System.out.println(0);
            }else System.out.println(1);
        }
    }
}
