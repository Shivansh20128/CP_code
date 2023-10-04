import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Largest_and_second_largest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0;i<n;i++){
                arr.add(scan.nextInt());
            }
            int count=0;
            int sum=0;

            while(count<2){
                int num = Collections.max(arr);
                count++;
                sum+=num;
                arr.removeAll(Collections.singleton(num));
            }
            System.out.println(sum);
        }
    }

}
