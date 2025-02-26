package chapter2.clazz;

public class Main {
    public static void main(String[] args) {
        Person personA = new Person("ahyun",51);
        Person personB = new Person("ahyujn",21);

        //속성에 직접 접근
        System.out.println("설정 전 personA 이름: " + personA.name);
        System.out.println("설정 전 personB 이름: " + personB.name);
        personA.name = "ahyun";
        personB.name = "hahyun";
        System.out.println("설정 전 personA 이름: " + personA.name);
        System.out.println("설정 전 personB 이름: " + personB.name);

        //게터 활용
        String name = personB.getName();
        System.out.println("name = "+ name);

        //세터 활용
        System.out.println("personA의 주소" + personA.address);
        personA.setAddress("서울");
        System.out.println("personA의 주소" + personA.address);


        Car car1 = new Car("붕붕이", "빨강");
        Car car2 = new Car("방방이", "노랑");

        car1.drive();
        car1.accelerate();

        String color = car1.getColor();
        System.out.println("color = " + color);
        car1.setColor("파랑");
        car1.getColor();
        String color2 = car1.getColor();
        System.out.println("color = " + color2);



    }
}
