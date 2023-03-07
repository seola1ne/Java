package ch03;

public class ContinueExam {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++) {
            if (i == 5) {
                continue;
                // 5을 제외한 나머지 출력
            }
            System.out.println(i + "\t");
        }
    }
}
