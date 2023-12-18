import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        int N=sc.nextInt();
        int total=0;
        for(int i=0;i<N;i++)
            total+=sc.nextInt();
        if(T>total) System.out.println("Padaeng_i Cry");
        else System.out.println("Padaeng_i Happy");
    }
}