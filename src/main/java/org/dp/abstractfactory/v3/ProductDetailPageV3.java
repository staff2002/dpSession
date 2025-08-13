package org.dp.abstractfactory.v3;
/*
 * V3
 * 增加ThemeWidgetFactory接口，有LightTheme和DarkTheme两个Factory实现
 * 不同Theme工厂负责该Theme所有组件的创建。
 * 优点：无论有多少种组件，切换Theme，只需要修改一行创建工厂的代码。
 * */
public class ProductDetailPageV3 {
    private Image image;
    private Text introduction;

    public ProductDetailPageV3(String imageAddress,
                               String introductionContent) {
        IThemeWidgetFactory widgetFactory = new LightThemeWidgetFactory();

        image = widgetFactory.createImage();
        image.setAddress(imageAddress);

        introduction = widgetFactory.createText();
        introduction.setContent(introductionContent);
    }

    public void display() {
        image.display();
        introduction.display();
    }
}
