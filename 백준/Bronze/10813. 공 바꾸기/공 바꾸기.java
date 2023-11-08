import java.util.Scanner;

import static java.util.Collections.swap;

public class Main {
    static int basket[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int N = sc.nextInt();
        int M = sc.nextInt();
        basket = new int[N + 1];
        for (int i = 1; i <= N; i++)
            basket[i] = i;
        for(int i=0;i<M;i++) //M번 swap
        {
            int first=sc.nextInt();
            int second=sc.nextInt();
            swapBall(first,second);
        }
        for (int i=1;i<=N;i++)
        {
            sb.append(basket[i]+" ");
        }
        System.out.println(sb.toString());
    }

    private static void swapBall(int first, int second) {
        int num1=basket[first];
        int num2=basket[second];

        basket[first]=num2;
        basket[second]=num1;
    }
}


