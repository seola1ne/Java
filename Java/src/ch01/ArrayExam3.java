package ch01;

public class ArrayExam3 {
    public static void main(String[] args) {
        int a[];
        int b[];
        int[] c = {31, 32, 33}; // 초기화 할 때 값을 세팅, 길이 3
        
        a = new int[4]; // 힙 영역에서 0으로 초기화됨
        b = new int[]{21, 22, 23, 24};
        c = b; // c가 가지고 있는 주소값이 b가 가지고 있는 주소값으로 바뀜
        
        // c.length == 4
        System.out.println(a.length + " " + b.length + " " + c.length);
    }
}
