package ch01;

public class ArrayExam2 {
    public static void main(String[] args) {
        String[] str = new String[3]; // 참조형 변수(C언어의 포인터와 유사)
        str[0] = "Hello";
        str[1] = "java";
        str[2] = "World";


        // iter
        for (String s : str) {
            System.out.println(s);
        }
    }
}
