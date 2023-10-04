import java.util.Scanner;
class go_to_a_cell_diagonally {
    public static void main(String[] args){
        int dr;
        int dc;
        Scanner scan  = new Scanner(System.in);
        int testcases = scan.nextInt();
        int[] size = new int[2*testcases];
        int[] start = new int[2*testcases];
        int[] destination = new int[2*testcases];
        for(int i=0;i<2*testcases;i+=2){
            size[i] = scan.nextInt();
            size[i+1] = scan.nextInt();
            start[i] = scan.nextInt();
            start[i+1] = scan.nextInt();
            destination[i] = scan.nextInt();
            destination[i+1] = scan.nextInt();
        }

        for(int i=0;i<2*testcases;i+=2){
            int time=0;
            dr=1;dc=1;

            while(true) {
                if(destination[i]==start[i] || destination[i+1]==start[i+1]){
                    break;
                }
                if (start[i] + dr > size[i]) {
                    dr = dr*-1;
                }
                start[i]=start[i]+dr;
                if (start[i + 1] + dc > size[i + 1]) {
                    dc = dc*-1;
                }
                start[i+1]=start[i+1]+dc;
                time++;

            }
            System.out.println(time);
        }

    }
}
