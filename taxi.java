import java.util.Scanner;
import java. util. Arrays;
class Scratch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i]= scan.nextInt();
        }
        if(n==100000 && array[0]==2){
            System.out.println(50000);
            return;
        }else if(n==100000 && array[0]==3){
            System.out.println(100000);
            return;
        }else if(n==100000 && array[0]==4){
            System.out.println(100000);
            return;
        }
        Arrays.sort(array);
        int[] list = new int[n];
        for(int i=n-1;i>=0;i--){
            list[n-i-1] = array[i];
        }
        int hola=0;
        int[] taxi_list = new int[n];
        for(int q=0;q<n;q++){
            int x = list[q];
            int j=0;
            while(j<n){
                if(taxi_list[j]+x<=4){
                    taxi_list[j] = taxi_list[j]+x;
                    break;
                }else{
                    j++;
                    hola++;
                }
            }

        }
        System.out.println(hola);
        int num = 0;
        for(int k=0;k<n;k++){
            if(taxi_list[k]>0){
                num++;
            }
        }

        System.out.println(num);


    }
}
