package org.dp.abstractfactory.v2;

public class Image {
    private String address;
    private String theme;

    public Image(String theme) {
        this.theme = theme;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void display() {
        System.out.println("主题"+theme + "显示商品图片：" + address);
    }
}
