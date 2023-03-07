package ch01;

// 기본 자료형 배열
public class ArrayExam1 {
    public static void main(String[] args) { // main -> 자동 완성됨
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 힙 영역에 공간 할당, 스택 영역의 a가 주소 가지고 있음
        for(int i = 0; i < a.length; i++) { // a.length == 10
            System.out.println("a[" + i + "] = " + a[i]); // sout -> 자동 완성됨
        }
    }
}
