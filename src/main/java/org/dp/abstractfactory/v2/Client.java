package org.dp.abstractfactory.v2;

public class Client {
    public static void main(String[] args) {
        ProductDetailPageV2 productDetailPage =
                new ProductDetailPageV2("phone.jpg","这是一款跨时代的手机");
        productDetailPage.display();
    }
}
