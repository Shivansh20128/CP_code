import java.util.Scanner;

public class cost_of_groceries {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int x = scan.nextInt();
            int[] val = new int[n];
            int[] cost = new int[n];
            int total_cost=0;
            for(int i=0;i<n;i++){
                val[i] = scan.nextInt();
            }
            for(int i=0;i<n;i++){
                cost[i] = scan.nextInt();
            }
            for(int i=0;i<n;i++){
               if(val[i]>=x){
                   total_cost+=cost[i];
               }
            }
            System.out.println(total_cost);
        }
    }
}
