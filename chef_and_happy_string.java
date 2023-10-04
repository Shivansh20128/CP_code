import java.util.Scanner;

public class chef_and_happy_string {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            String str = scan.next();
            boolean cond=true;
            for(int i=0;i+2<str.length();i++){
                if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                    if(str.charAt(i+1)=='a' || str.charAt(i+1)=='e' || str.charAt(i+1)=='i' || str.charAt(i+1)=='o' || str.charAt(i+1)=='u'){
                        if(str.charAt(i+2)=='a' || str.charAt(i+2)=='e' || str.charAt(i+2)=='i' || str.charAt(i+2)=='o' || str.charAt(i+2)=='u'){
                            System.out.println("Happy");
                            cond=false;
                            break;
                        }
                    }
                }
            }
            if(cond){
                System.out.println("Sad");
            }
        }
    }
}
