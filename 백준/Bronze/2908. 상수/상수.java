import java.io.IOException;
import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String num1=sc.next();
        String num2=sc.next();
        StringBuilder sb1=new StringBuilder();
        sb1.append(num1);
        sb1.reverse();
        num1= sb1.toString();
        StringBuilder sb2=new StringBuilder();
        sb2.append(num2);
        sb2.reverse();
        num2= sb2.toString();
        if(num1.compareTo(num2)>0) System.out.println(num1);
        else System.out.println(num2);
    }


}
