package chapter1.operator;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        //기본적인 사칙연산
        int sum = a + b;
        System.out.println("sum = " + sum);

        int sub = a - b;
        System.out.println("sub = " + sub);

        int mul = a * b;
        System.out.println("mul = " + mul);

        //나눗셈
        // 10 / 3
        int div = a / b; //소수점 자리 표현 못함 , 나머지가 버려짐
        System.out.println("div = " + div);

        //소수점 연산
        //정수를 소수점으로 나누기 -> 소수점 결과 배출
        double div2 = a / 3.0;
        System.out.println("div2 = " + div2);



        //모둘러 연산자(나머지 연산) - %
        int mod = 10 % 3;
        System.out.println("mod = " + mod);

        int mod2 = 15 % 4;
        System.out.println("mod2 = " + mod2);

        int mod3 = 20 % 7;
        System.out.println("mod3 = " + mod3);


        //시간 연산에 자주 사용됨 모듈러 연산이
        //10시에서 5시간 지나면 몇 시에용 -> 3시
        int mod4 = (10 + 5) % 12;
        System.out.println("mod4 = " + mod4);

        //짝수 홀수 연산
        int mod5 = 6%2;
        System.out.println("mod5 = " + mod5);

        int mod6 = 7%2;
        System.out.println("mod6 = " + mod6);




        //대입 연산자
        int num = 5;//값 할당할때
        //복합 대입 연산자
        num += 3;
        System.out.println("num = " + num);

        num -= 2;
        System.out.println("num = " + num);

        num *= 2;
        System.out.println("num = " + num);

        num /= 2;
        System.out.println("num = " + num);

        num %= 2;
        System.out.println("num = " + num);



        //증감 연산자
        num = 1;
        num++; //+1
        num++; //+1
        num--; //-1
        num--; //-1
        System.out.println("num = " + num);



        //전위 연산(++1) - 연산 후 값이 활용됩니다.
        int intBox = 5;
        System.out.println("(++intBox) = " + (++intBox));

        int intBox2 = 5;
        System.out.println("(intBox2++) = " + (intBox2++));


        //비교연산자
        //같은연산자(==) 같으면 true, 다르면 false
        System.out.println("10 == 10" + (10 == 10));

        //다름연산자(!=)
        System.out.println("10 != 5: " + (10 != 5)); // true

        System.out.println("10 < 5: " + (10 < 5)); // false
        System.out.println("10 >= 10: " + (10 >= 10)); // true
        System.out.println("10 <= 5: " + (10 <= 5)); // false



        //논리 연산자
        //AND 연산 (&&)
        //두 조건이 모두 참일 때 true 반환합니다.
        System.out.println("true && true: " + (true && true));  // true
        System.out.println("true && false: " + (true && false)); // false
        System.out.println("false && false: " + (false && false)); // false

        int age = 20;
        boolean isStudent = true;
        System.out.println(age > 18 && isStudent); // true


        //OR 연산자
        //둘 중 하나라도 참이면 참 반환
        System.out.println("true || false: " + (true || false)); // true
        System.out.println("false || false: " + (false || false)); // false
        System.out.println("true || true: " + (true || true)); // true

        System.out.println(age > 18 || isStudent); // true


        //NOT 연산자
        System.out.println("!true: " + (!true));  // false
        System.out.println("!false: " + (!false)); // true

        System.out.println(age > 18 && isStudent); // true


        //연산자 우선순위 -> 괄호 적극 활용
        System.out.println(10 - 3 * 2);
        // 실행 순서: 10 - (3 * 2)
        // → 10 - 6
        // → 4


        //기본 연산자 우선순위(산술 → 비교 → 논리 → 대입)
        boolean flag = 10 + 5 > 12 && true;
        System.out.println(flag);
        // 실행 순서: (10 + 5) > 12 && true : 산술
        // → 15 > 12 && true : 비교
        // → true && true : 논리
        // → flag = true 대입


       // 비교 연산자와 산술 연산자의 우선순위
        System.out.println(10 - 3 > 5 + 1);
        // 실행 순서: (10 - 3) > (5 + 1) : 산술
        // → 7 > 6 : 비교
        // → true


        //논리 연산자 우선순위( !  → && → || )
        boolean result = true || false && !false;
        // boolean result = true || (false && (!false));
        // 실행 순서: true || (false && false)
        // → true || false
        // → true




        //우선 순위를 생각해보세요!
        System.out.println(10 / 2 + 3 * 2 > 10 || false);
        // 실행 순서: ((10 / 2) + (3 * 2)) > 10 || false
        // → (5 + 6) > 10 || false
        // → 11 > 10 || false
        // → true || false
        // → true

        System.out.println(5 + 3 > 2 * 4 && 10 % 3 == 1);
        // 실행 순서: (5 + 3) > (2 * 4) && (10 % 3) == 1
        // → 8 > 8 && 1 == 1
        // → false && true
        // → false



        //문자열비교!!!!!!!!
//        실무에서 문자열을 비교할 때 `==` 를 사용하는 경우는 거의 없습니다.
//        문자열 비교는 항상 `.equals()` 를 활용하세요.(동등성/동일성 문제)
        String text1 = "Hello";
        String text2 = "Hello";
        boolean isEqual = text1.equals(text2);
        System.out.println("text1과 text2가 같은가? " + isEqual);
        // ==는 주소 복사
        // equals가 순수 문자열 비교


    }
}
