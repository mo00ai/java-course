package chapter2.statiz;

public class Main {
    public static void main(String[] args) {

        //클래스 멤버
        //객체 생성 안하고 바로 class 단위로 접근 가능
        System.out.println("static 변수 활용: " + Person.population);
        Person.printPopulation();



        //인스턴스 멤버 활용
        Person p1 = new Person();
        Person p2 = new Person();

        //인스턴스 변수 활용
        p1.name ="ahyun";
        p2.name ="asyun";

        //인스턴스 메서드 활용
        p1.printName();
        p2.printName();

        //인스턴스 변수,메서드는 객체 생성없이 사용할 수 없음
        //각 객체가 개별적으로 값을가짐(공유영역이 아님, static이 아님)

        Person.printPopulation();
        //객체 두번 생성해서 생성자 2번 사용하니 +2됨


    }
}
