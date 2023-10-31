import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input="";
        while((input=br.readLine())!=null){
            String[] number=input.split(" ");
            int A= Integer.parseInt(number[0]);
            int B= Integer.parseInt(number[1]);
            System.out.println(A+B);
        }
    }
}
