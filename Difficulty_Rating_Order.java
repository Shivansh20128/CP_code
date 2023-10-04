import java.util.Scanner;

public class Difficulty_Rating_Order {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testcases = scan.nextInt();
        while(testcases-->0){
            boolean cond=true;
            int n = scan.nextInt();
            int[] arr = new int[n];
            int i=0;
            while(i<n){
                arr[i]=scan.nextInt();
                i++;
            }
            i=1;
            while(i<n){
                if(arr[i]<arr[i-1]){
                    cond=false;
                    System.out.println("No");
                    break;
                }
                i++;
            }
            if(cond){
                System.out.println("Yes");
            }
        }
    }
}
