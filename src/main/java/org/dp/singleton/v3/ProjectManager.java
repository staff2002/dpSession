package org.dp.singleton.v3;
/*
* 饿汉式创建
* 利用的JVM加载机制，确保静态对象的唯一性，并且线程安全
* 问题：由于提前创建，可能造成大量用不到的对象占据内存
* */
public class ProjectManager {
    private static ProjectManager instance = new ProjectManager();

    private ProjectManager() {
    }

    public static ProjectManager getInstance(){
        return instance;
    }
}
