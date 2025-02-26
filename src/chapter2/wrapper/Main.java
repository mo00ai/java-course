package chapter2.wrapper;

public class Main {
    public static void main(String[] args) {

        //래퍼 클래스(참조형)

        //기본형 변수
        int a = 1;

        //참조형 변수
        Person personA = new Person();
        System.out.println("personA = " + personA);
        //배열도 참조형 변수임

        //래퍼클래스(기본형 변수를 감싸고 있는 클래스)
        //래퍼클래스로 만들어진 객체
        //참조형변수
        Integer num = 100;
        System.out.println("num = " + num);
        //래퍼클래스는 자주 사용돼서 내부적으로 참조주소가 아니라 값을 출력하도록 설정됨

        //객체처럼 사용하기 위해 사용함
        //------> 다양한 편의 기능들을 사용해서 데이터를 처리하기 위해
        // 예를들면 int -> String
        String numb = num.toString();


        //직접 만든 래퍼클래스
        CustomInteger myInteger = new CustomInteger(10);
        System.out.println("myInteger = " + myInteger.toString());


        //객체는 생성자를 통해 만들어야한다고 배웠는데
        //래퍼클래스는 왜 생성자 사용안하나요? ex) Integer num = 100;


        //오토박싱 (기본형 -> 래퍼)
        Integer num3 = 100;
        //같은 자료형이면 자동으로 기본형을 래퍼클래스로 바꿔줌
        //Integer.valueof(10);

        //오토 언박싱 (래퍼-> 기본형)
        int num4 = num3;
        //int a = num.intValue()
    }
}
