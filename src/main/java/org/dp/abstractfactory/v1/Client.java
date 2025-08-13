package org.dp.abstractfactory.v1;

public class Client {
    public static void main(String[] args) {
        ProductDetailPageV1 productDetailPage =
                new ProductDetailPageV1("phone.jpg","这是一款跨时代的手机");
        productDetailPage.display();
    }
}
