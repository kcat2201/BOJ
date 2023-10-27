import java.util.*;

public class Main {
    static int N;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        N = sc.nextInt();
        List<Person> list = new ArrayList<>();

        for (int i = 0; i < N; i++)
            list.add(new Person(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        //            국어 점수가 감소하는 순서로
//            국어 점수가 같으면 영어 점수가 증가하는 순서로
//            국어 점수와 영어 점수가 같으면 수학 점수가 감소하는 순서로
//            모든 점수가 같으면 이름이 사전 순으로 증가하는 순서로 (단, 아스키 코드에서 대문자는 소문자보다 작으므로 사전순으로 앞에 온다.)
        Comparator<Person> com= (o1, o2) -> {
                        int korDiff=o2.getKor()-o1.getKor();
                        int engDiff=o1.getEng()-o2.getEng();
                        int mathDiff=o2.getMath()-o1.getMath();
                        int nameDiff=o1.getName().compareTo(o2.getName());
        
                        if(korDiff==0&&engDiff==0&&mathDiff==0) return nameDiff;
                        else if(korDiff==0&&engDiff==0) return mathDiff;
                        else if(korDiff==0) return engDiff;
                        else return korDiff;
                    };
        Collections.sort(list,com);
       list.stream().forEach(p-> System.out.println(p.getName()));
    }
    static class Person {
        String name;
        int kor;
        int eng;
        int math;

        Person(String name,
               int kor,
               int eng,
               int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;

        }

        public int getKor() {
            return kor;
        }

        public int getEng() {
            return eng;
        }

        public int getMath() {
            return math;
        }

        public String getName() {
            return name;
        }
    }
}
