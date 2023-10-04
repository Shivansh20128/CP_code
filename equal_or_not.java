import java.util.Scanner;
class equal_or_not {
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        int testcases = scan.nextInt();
        String[] size = new String[testcases];
        String[] ans = new String[testcases];
        for(int i=0;i<testcases;i++){
            int e=0;int n=0;
            size[i] = scan.next();
            for(int j=0;j<size[i].length();j++){
                if(size[i].charAt(j)=='E'){
                    e++;
                }else if(size[i].charAt(j)=='N'){
                    n++;
                }
                if(n==1){
                    ans[i]="NO";
                }else ans[i]="YES";
            }
        }

        for(int i=0;i<testcases;i++){
            System.out.println(ans[i]);
        }

    }
}
