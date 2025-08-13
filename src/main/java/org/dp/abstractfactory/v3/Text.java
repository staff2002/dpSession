package org.dp.abstractfactory.v3;

public class Text {
    private String content;
    private String theme;

    public Text(String theme){
        this.theme = theme;
    }

    public void setContent(String content){
        this.content=content;
    }

    public void display() {
        System.out.println("主题"+theme + "显示商品介绍：" + content);
    }
}
