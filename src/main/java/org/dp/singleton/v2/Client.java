package org.dp.singleton.v2;

public class Client {
    public static void main(String[] args) {
        ProjectManager zhangsan = ProjectManager.getInstance();
        ProjectManager lisi = ProjectManager.getInstance();

        if (zhangsan == lisi) {
            System.out.println("两位项目经理对象是同一实例");
        }
    }
}
