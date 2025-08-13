package org.dp.abstractfactory.v1;

public class Image {
    private String address;

    public void display() {
        System.out.println("商品图片：" + address);
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
