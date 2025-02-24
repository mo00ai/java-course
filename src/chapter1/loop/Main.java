package chapter1.loop;

public class Main {
    public static void main(String[] args) {
        //로봇한테 10번 인사 반복시키기
        System.out.println("안녕하세요!");

        int cum = 5;
        for(int i =0; i<5; i++){
            if(i==4) {
                break;
            }
            System.out.println(i);
        }

    }
}
