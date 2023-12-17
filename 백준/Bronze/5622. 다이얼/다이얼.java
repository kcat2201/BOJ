import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=0;

        String dialStr=sc.next();
        dialStr=dialStr.toUpperCase();
        String[] st=dialStr.split("");
        for(String str : st){
            total+=checkDial(str);
        }
        System.out.println(total);
    }

    private static int checkDial(String str) {
        if("ABC".contains(str)){
            return 3;
        }
        if("DEF".contains(str)){
            return 4;
        } if("GHI".contains(str)){
            return 5;
        } if("JKL".contains(str)){
            return 6;
        } if("MNO".contains(str)){
            return 7;
        } if("PQRS".contains(str)){
            return 8;
        } if("TUV".contains(str)){
            return 9;
        } if("WXYZ".contains(str)){
            return 10;
        }
        else return 0;
    }
}