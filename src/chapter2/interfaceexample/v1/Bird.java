package chapter2.interfaceexample.v1;

public class Bird implements Animal,Flyable {
    //인터페이스 다중구현
    //다중 상속..?
    //여러 인터페이스에서 영향받음
    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

    //인터페이스 (설계도)
    //- 부모 구현X, 틀만 가지고 자식이 반드시 구현
    //정리하는 파일 폴더같은 것?

    //상속
    //- 부모 구현 O, 자식이 고대로 물려받거나 재정의(오버라이딩)
    //코듲 ㅐ사용성을 높이고 객체 지향의 확장성 제공


}
