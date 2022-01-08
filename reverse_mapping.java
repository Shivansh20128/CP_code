import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i+1,scan.nextInt());
        }
        HashMap<Integer,Integer> hello = new HashMap<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            hello.put(entry.getValue(), entry.getKey());
        }

        for(int i=0;i<n;i++){
            System.out.print(hello.get(i+1)+" ");
        }

    }
}
