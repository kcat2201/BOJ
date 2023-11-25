import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int light = sc.nextInt();

        if(light>=620 && light<=780) System.out.println("Red");
        else if(light>=590) System.out.println("Orange");
        else if(light>=570 ) System.out.println("Yellow");
        else if(light>=495 ) System.out.println("Green");
        else if(light>=450) System.out.println("Blue");
        else if(light>=425 ) System.out.println("Indigo");
        else if(light>=380) System.out.println("Violet");
    }
}


