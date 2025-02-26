package chapter3.exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Exception exception = new Exception();

        while(true) {
            try {

                System.out.print("아이디를 입력하세요: ");
                String id = scanner.next();
                System.out.print("아이디를 입력하세요: ");
                int pw = scanner.nextInt();
                scanner.nextLine();

                //예외발생 가능성
                exception.exceptId(id, pw);

                System.out.println("로그인 성공");
                break;

            } catch (java.lang.Exception e) {
                System.out.println(e.getMessage());
            }
        }



    }
}
