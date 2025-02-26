package chapter2.statiz;

public class Person {

    //인스턴스 변수
    String name;

    // ✅ static 변수
    static int population = 0;

    Person() {
        population++;
    }

    //인스턴스 메서드
    void printName() {
        System.out.println("name = " + this.name);
    }

    // ✅ static 메서드
    static void printPopulation() {
//        this.name;
        //인스턴스 변수 사용 못함 static메서드에
        //인스턴스 변수는 객체가 생성되야 만들수 있기 때문에
        System.out.println("현재 인구 수: " + population);
    }
}
