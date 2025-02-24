package chapter1.variable;

public class Main {

    public static void main(String[] args) {

        // [자료형] [변수이름];
        int a;
        a=1;
        a=2;
        System.out.println("a = " + a);

        //논리형
        boolean booleanBox = true; //할당
        booleanBox = false; //재할당
        System.out.println("booleanBox = " + booleanBox);

        //문자형
        char charBox = 'A';
        charBox = 'a';
        System.out.println("charBox = " + charBox);

        //큰 정수형
        long longBox = 1;
        longBox = 2;
        System.out.println("longBox = " + longBox);

        //소수점 표현 float double 보통 double을 자주 씀
        //f안 붙이면 자동으로 double 값으로 인식
        //그래서 float엔 반드시 f붙일 것
        float floatBox = 0.12345678f;
        floatBox = 0.1234567890f; //0.12345679 끝 반올림처리
        System.out.println("floatBox = " + floatBox);

        double doubleBox = 0.1234567890;
        System.out.println("doubleBox = " + doubleBox);



        //캐스팅(Casting)
        //다운캐스팅 : 큰 데이터를 -> 작은 상자에
        double bigBox =  10.123;
        int smallBox = (int)bigBox;
        System.out.println("smallBox = " + smallBox);
        //형변환시 소수점이 손실됨 -> 10출력

        //업캐스팅: 작은 데이터 -> 큰 상자
        int smallBox2 = 10;
        double bigBox2 = smallBox2;
        //에러 안남
        //업캐스팅은 자동
        System.out.println("bigBox2 = " + bigBox2);
        //데이터 손실 없음

        //문자열 데이터
        char a1 = 'a';
        String str = "안녕하세요";

        //정수형
        int a2 = 1;
        long a3 = 1;

        //논리형
        boolean b1 = true;
    }
}
