package chapter3.collection;

import java.util.ArrayList;

public class Cart {

    private ArrayList<Product> products;

    Cart() {
        products = new ArrayList<>();
    }


    //상품추가
    public void addProduct(Product product) {
        products.add(product);
    }

    //장바구니 목록 출력
    public void printCart(){
        for (Product product : products) {
            System.out.println("[" + product.getName() + "," + product.getPrice() + "]");
        }
    }

    //상품 삭제
    public void removeProduct(Product product) {
        products.remove(product);
    }

    //총 가격 계산
    public int calculateTotalPrice() {
        int total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

}
