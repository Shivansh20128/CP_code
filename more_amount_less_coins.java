import java.util.Scanner;
class Scratch {
    static void merge(int[] array, int left, int mid, int right) {
        int[] temp_left=new int[mid-left+1];
        int[] temp_right=new int[right-mid];

        for(int i=0;i<mid-left+1;++i){
            temp_left[i]=array[left+i];
        }
        for(int j=0;j<right-mid;++j){
            temp_right[j]=array[mid+1+j];
        }

        int x1=0;
        int x2=0;

        int index=left;
        while(x2<mid-left+1 && x1<right-mid){
            if(temp_left[x2]<=temp_right[x1]){
                array[index]=temp_left[x2];
                x2++;
            }else{
                array[index]=temp_right[x1];
                x1++;
            }
            index++;
        }
        while(x2<mid-left+1){
            array[index]=temp_left[x2];
            x2++;index++;
        }
        while(x1<right-mid){
            array[index]=temp_right[x1];
            x1++;index++;
        }
    }

    static void sort(int[] array, int left, int right) {
        if(left<right){
            sort(array, left, left+(right-left)/2);
            sort(array, left+(right-left)/2 + 1, right);
            merge(array, left, left+(right-left)/2, right);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] coins = new int[n];

        for(int i=0;i<n;i++){
            coins[i] = scan.nextInt();
        }
        sort(coins, 0, coins.length - 1);
        int sum_total=0;
        int sum_twin=0;
        for(int i=0;i<n;i++){
            sum_total=sum_total+coins[i];
        }
        int answer =0;
        for(int i=n-1;i>=0;i--){
            sum_twin = sum_twin+coins[i];
            if(sum_twin>sum_total/2){
                answer=i;
                break;
            }
        }
        System.out.println(n-answer);


    }
}
