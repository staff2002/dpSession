package org.dp.abstractfactory.v1;

public class Text {
    private String content;

    public void display() {
        System.out.println("商品介绍：" + content);
    }

    public void setContent(String content) {
        this.content = content;
    }
}
