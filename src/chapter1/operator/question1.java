package chapter1.operator;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        // TODO: 사용자로부터 첫 번째 문자열 입력받기
        // TODO: 사용자로부터 두 번째 문자열 입력받기
        // TODO: 문자열 비교 결과를 변수 result 에 저장
        // TODO: 결과 출력

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 문자열을 입력하세요: ");
        String first = scanner.nextLine();

        System.out.print("두 번째 문자열을 입력하세요: ");
        String second = scanner.nextLine();

        boolean result = first.equals(second);
        System.out.println("두 문자열이 같은가요? " + result);


    }
}
