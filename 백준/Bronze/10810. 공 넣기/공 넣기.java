import java.io.IOException;
import java.util.Scanner;

public class Main {

    static int S[];
    static StringBuilder sb= new StringBuilder();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M=sc.nextInt();
        int basket[]=new int[N+1];

        for(int i=0;i<M;i++){
            int nums[]=new int[3];//1번부터 2번까지 3번 공 넣기
            for(int j=0;j<3;j++){
                nums[j]=sc.nextInt();
            }
            for(int k=nums[0];k<=nums[1];k++){
                basket[k]=nums[2];
            }
        }

        for(int i=1;i<=N;i++){
            sb.append(basket[i]+" ");
        }
        System.out.println(sb.toString());


    }


}
