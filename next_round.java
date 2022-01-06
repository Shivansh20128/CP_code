import java.util.Scanner;
class Scratch {
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        boolean cond = false;
        int ans=0;
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = scan.nextInt();
        }
        for(int x=0;x<n;x++){
            if(array[x]>0){
                cond=true;
            }
        }
        for(int i=0;i<n;i++){

            if(array[i]>=array[k-1] && cond && array[i]>0){
                ans++;
            }
        }
        System.out.println(ans);




    }
}
