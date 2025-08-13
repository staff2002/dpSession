package org.dp.abstractfactory.v1;
/*
 * V1 Page类含有Image和Text两个页面组件成员变量
 * Image和Text组件仅支持一种显示方式
 * 问题：不支持多种显示模式
 * */
public class ProductDetailPageV1 {
    private Image image;
    private Text introduction;

    public ProductDetailPageV1(String imageAddress, String introductionContent) {
        image = new Image();
        image.setAddress(imageAddress);

        this.introduction = new Text();
        this.introduction.setContent(introductionContent);
    }

    public void display() {
        image.display();
        introduction.display();
    }
}
