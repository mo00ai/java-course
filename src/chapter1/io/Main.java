package chapter1.io;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //sout 자동개행
        System.out.println("Hello");
        System.out.println("Java");

        //줄바꿈 없음
        System.out.print("안녕");
        System.out.print("자바");

        //개행문자 포함 출력
        System.out.println("Hello\nWorld!");
        //System 도 객체임

        //입력(Scanner)
        //스캐너 객체를 스캐너형 박스(scanner)에 넣음
        Scanner scanner = new Scanner(System.in);

        //문자열 입력받기
        System.out.println("좋아하는 문장을 입력하세요: ");
        String sentence = scanner.nextLine();
        System.out.println("sentence = " + sentence);

        //정수형(int,long) 입력받기
        System.out.print("정수(int)를 입력하세요: ");
        int intBox = scanner.nextInt();
        System.out.println("intBox = " + intBox);

        System.out.print("정수(long)을 입력하세요");
        long longBox = scanner.nextInt();
        System.out.println("longBox = " + longBox);

        System.out.print("소수(double)을 입력하세요: ");
        Double Double = scanner.nextDouble();
        System.out.println("Double = " + Double);


    }
}
