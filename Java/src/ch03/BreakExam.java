package ch03;

public class BreakExam {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++) {
            System.out.println(i + "\t");
            if (i == 5) {
                break; 
                // 가장 가까운 반복문을 빠져나옴
                // 5까지만 출력
            }
        }
    }
}
