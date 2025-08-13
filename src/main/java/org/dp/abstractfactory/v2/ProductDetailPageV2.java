package org.dp.abstractfactory.v2;
/*
 * V2
 * Image和Text有两个子类，分别为Dark和Light，实现不同显示方式
 * 问题：切换显示模式，需要修改 ProductDetailPageV2 类中初始化两个组件的代码，如果有100个组件要修改100处
 * */
public class ProductDetailPageV2 {
    private Image image;
    private Text introduction;

    public ProductDetailPageV2(String imageAddress,
                               String introductionContent) {
        image = new DarkImage();
        image.setAddress(imageAddress);

        introduction = new DarkText();
        introduction.setContent(introductionContent);
    }

    public void display() {
        image.display();
        introduction.display();
    }
}
