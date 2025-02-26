package chapter2.clazz;

public class Person {

    //1.속성 /필드 - 변수 선언으로 표현
    String name;
    int age;
    String address;

    //2. 생성자 - 조립 설명서
    //눈에 보이지 않지만 클래스 만들면 기본 생성자가 생김
//    Person() {
//    }

    //생성자를 정의하는 순간 기본생성자는 사라짐
//    Person personA = new Person();
    //이렇게 호출못한다는 뜻임. 꼭 밑에 매개변수를 입력해야함

    //생성자의 특징:
    // 클래스와 이름이 같음
    // 반환 타입이 존재하지 않음
    // 여러개가 존재할 수 있음
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }



    //3. 기능 (메서드 부분) - 클래스와 관련된 기능으로 할 것
    int sum (int value1, int value2) {
        int result = value1 + value2;
        return result;
    }

    //게터 - 필드를 외부에서 가지고 올 수 있도록 하는 거
    //속성을 가져오는 기능
    String getName () {
        return this.name;
    }


    //세터
    void setAddress (String address) {
        this.address = address;
    }



}
