import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class attack_on_kingdom {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0;i<n;i++){
                arr.add(scan.nextInt());
            }
            int min= Collections.min(arr);
            arr.removeAll(Collections.singleton(min));
            int ans = Collections.min(arr);
            System.out.println(ans);
        }
    }
}
