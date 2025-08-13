package org.dp.abstractfactory.v3;

public class LightThemeWidgetFactory implements IThemeWidgetFactory {
    @Override
    public Text createText() {
        return new LightText();
    }

    @Override
    public Image createImage() {
        return new LightImage();
    }
}
