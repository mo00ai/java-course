package chapter3.collection;

public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart();
        Product onion = new Product("양파", 3000);
        Product apple = new Product("사과", 10000);
        Product fish = new Product("생선", 5000);
        Product tofu = new Product("두부", 2000);

        //장바구니 상품추가
        cart.addProduct(onion);
        cart.addProduct(apple);
        cart.addProduct(fish);
        cart.addProduct(tofu);

        //목록 조회
        cart.printCart();
        System.out.println();

        //상품 삭제
        cart.removeProduct(apple);

        //목록 조회
        cart.printCart();
        System.out.println();

        //총 가격 계산
        int total = cart.calculateTotalPrice();
        System.out.println("총 가격: " + total);



    }
}
