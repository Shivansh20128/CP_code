import java.util.Scanner;

class make_rectangle {
    public static void main(String[] args) {
        int l1,l2,l3;

        Scanner scan  = new Scanner(System.in);
        int testcases = scan.nextInt();
        int[] array = new int[3*testcases];
        String[] answers = new String[3*testcases];
        for(int i=0;i<3*testcases;i+=3){
            array[i] = scan.nextInt();
            array[i+1] = scan.nextInt();
            array[i+2] = scan.nextInt();
            if(array[i]==array[i+1] && array[i+2]%2==0){
                answers[i] = "YES";
            }else if(array[i+1]==array[i+2] && array[i]%2==0){
                answers[i] = "YES";
            }else if(array[i]==array[i+2] && array[i+1]%2==0){
                answers[i] = "YES";
            }else if(array[i]+array[i+1]==array[i+2] || array[i+1]+array[i+2]==array[i] || array[i]+array[i+2]==array[i+1]){
                answers[i] = "YES";
            }else answers[i] = "NO";
        }



        for(int i=0;i<3*testcases;i+=3){
            System.out.println(answers[i]);
        }
    }
}
