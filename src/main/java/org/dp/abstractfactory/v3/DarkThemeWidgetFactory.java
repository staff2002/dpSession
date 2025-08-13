package org.dp.abstractfactory.v3;

public class DarkThemeWidgetFactory implements IThemeWidgetFactory {
    @Override
    public Text createText(){
        return new DarkText();
    }
    @Override
    public Image createImage(){
        return new DarkImage();
    }
}
