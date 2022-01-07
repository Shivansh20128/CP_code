import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.next();
        int number = Integer.parseInt(num);
        ArrayList<Integer> array = new ArrayList<>();
        for(int i=4;i<number;i++){
            String ss = String.valueOf(i);
            int x=0;
            for(int p=0;p<ss.length();p++){
                if(ss.charAt(p)=='4' || ss.charAt(p)=='7'){
                    x++;
                }
            }
            if(x==ss.length()){
                array.add(i);
            }
        }

        int lucky=0;
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)=='4' || num.charAt(i)=='7'){
                lucky++;

            }
        }
        boolean yes=false;

        if(lucky==num.length()) {
            System.out.println("YES");
        }
        else{
            for(int z=0;z<array.size();z++){

                if(number% array.get(z)==0){
                    System.out.println("YES");
                    yes=true;
                    break;
                }
            }
            if(!yes) System.out.println("NO");

        }

    }
}
