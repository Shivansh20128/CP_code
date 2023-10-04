import java.util.Scanner;

public class Chef_and_the_Wildcard_Matching {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            boolean cond=true;
            String s1 = scan.next();
            String s2 = scan.next();
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    if(s1.charAt(i)!='?' && s2.charAt(i)!='?'){
                        System.out.println("No");
                        cond=false;
                        break;
                    }
                }
            }
            if(cond){
                System.out.println("Yes");
            }
        }
    }
}
