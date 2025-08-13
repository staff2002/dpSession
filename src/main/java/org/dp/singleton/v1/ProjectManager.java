package org.dp.singleton.v1;
/*
* 私有化构造函数，杜绝通过new创建对象
* 提供创建实例的唯一入口方法getInstance
* 问题：线程并发时，可能创建出多个实例
*/
public class ProjectManager {
    private static ProjectManager instance;

    private ProjectManager() {
    }

    public static ProjectManager getInstance(){
        if(instance==null){
            instance = new ProjectManager();
        }

        return instance;
    }
}
