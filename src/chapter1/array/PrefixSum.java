package chapter1.array;

public class PrefixSum {
    public static void main(String[] args) {

        int[] num = {2,5,8};

        int temp = 0;
        for(int a : num) {
            temp += a;
        }
        System.out.println("누적합: " + temp);

    }
}
