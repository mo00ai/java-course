package chapter2.interfaceexample;

public class Main {
    public static void main(String[] args) {
        //인스턴스화
        SpeedCar speedCar = new SpeedCar();
        LuxuryCar luxuryCar = new LuxuryCar();

        //활용
        luxuryCar.drive();
        luxuryCar.stop();

//        speedCar.move();//없음
//        speedCar.stop();//없음
        speedCar.drive();

        //일관성이 없는 문제를 해결할 떄 인터페이스 활용

        //인터페이스 활용
        luxuryCar.stop();
        speedCar.drive();


        luxuryCar.Charge();
        speedCar.autoParking();



    }
}
