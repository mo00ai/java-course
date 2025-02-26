package chapter2.wrapper;

public class CustomInteger {
    // 속성
    int value;

    // 생성자
    CustomInteger(int value) {
        this.value = value;
    }

    // 기능
    // 값을 가져오는 메서드
    int getValue() {
        return value;
    }

    // 값을 설정하는 메서드
    void setValue(int value) {
        this.value = value;
    }

    //3. 기능
    //자동으로 문자열로 변환해주는 기능
    // toString() 오버라이딩 (값을 출력할 수 있도록)
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
