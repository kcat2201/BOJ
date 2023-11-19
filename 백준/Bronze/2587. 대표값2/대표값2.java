import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int[] nums=new int[5];
        for(int i=0;i<5;i++)
            nums[i]=sc.nextInt();
        Arrays.sort(nums);
        int avg= (int) Arrays.stream(nums).average().getAsDouble();
        sb.append(avg).append("\n");
        sb.append(nums[2]);
        System.out.println(sb);
    }
}
