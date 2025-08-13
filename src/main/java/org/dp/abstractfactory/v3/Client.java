package org.dp.abstractfactory.v3;

public class Client {
    public static void main(String[] args) {
        ProductDetailPageV3 productDetailPage =
                new ProductDetailPageV3("phone.jpg","这是一款跨时代的手机");
        productDetailPage.display();
    }
}
