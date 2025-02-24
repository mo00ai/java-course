package chapter1.condition;

public class Main {
    public static void main(String[] args) {

        String light = "초록불";               // (1)

        if (light.equals("초록불")) {          // (2)
            System.out.println("건너세요!");    // (3)

        } else if (light.equals("노란불")) {   // (4)
            System.out.println("주의하세요!");   // (5)

        } else {
            System.out.println("멈추세요!");    // (6)
        }

    }
}
