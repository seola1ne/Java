package ch02;

// 해당 월 별 일수 출력 단, 2월은 28일 고정
public class SwitchExam {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]); // 입력된 매개변수를 정수로 형변환(Integer.parseInt)
        int day;

        switch (month) {
            default: // 31일인 달
                day = 31;
                break;
            case 2:
                day = 28;
                break;
            case 4: case 6: case 9: case 11: // 30일인 달끼리 묶음
                day = 30;
                break;
        }

        System.out.println(month + "월의 일 수는 " + day + "입니다.");
    }
}
