import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line;
        StringBuilder sb=new StringBuilder();
        while(!(line=sc.nextLine()).equals("0 0")){
            String[] nums=line.split(" ");
            int result=Integer.valueOf(nums[0])+Integer.valueOf(nums[1]);
            sb.append(result+"\n");
        }
        System.out.println(sb.toString());
    }
}


