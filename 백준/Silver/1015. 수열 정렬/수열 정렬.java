import java.util.*;


public class Main {
    static int N;
    static StringBuilder sb = new StringBuilder();
    static int P[];
    static List<Integer> A = new ArrayList<>();
    static List<Integer> origin= new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        P=new int[N];
        for (int i = 0; i < N; i++) {
            int num=sc.nextInt();
                A.add(num);
                origin.add(num);
        }
        Collections.sort(A); //오름차순 정렬
        for (int i = 0; i < N; i++) {
            int num=A.get(i);
            int idx = origin.indexOf(num);
            origin.set(idx,-1);
            P[idx]=i;
        }
        for(int i=0;i<P.length;i++)
            sb.append(P[i]).append(" ");
        System.out.println(sb.toString());
    }
}

