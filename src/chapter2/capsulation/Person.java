package chapter2.capsulation;

public class Person {

    //멤버변수 필드
    private String name;    // ✅ 외부에서 접근 불가
    private String secret; // ❌ 외부에서 접근 불가

    //생성자
    public Person(String name) {
        this.name = name;
    }

    //기능
    public void methodA() {}  // ✅ 외부에서 접근 가능
    public void methodB() {} // ❌ 외부에서 접근 불가


    //게터 세터
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
