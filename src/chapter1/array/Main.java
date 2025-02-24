package chapter1.array;

public class Main {

    public static void main(String[] args) {

        int[] arr = {3,4,7,10,15,20};

        for(int a : arr) {
            if(a%2==0) {
                System.out.println(a);
            }
        }

    }
}
