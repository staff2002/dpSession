package org.dp.singleton.v2;
/*
 * synchronized同步代码块解决线程安全问题
 * 使用volatile杜绝指令重排
 * 二次判空解决的是效率问题。对象只创建一次，之后都是获取对象，第一次判空避免进入同步代码块。第二次判空用于并发时，都通过了第一次判空，
 * 当后一次调用排队进入同步代码块时，由于instance已经被创建，需要判空避免重复创建。
 */
public class ProjectManager {
    private static volatile ProjectManager instance;

    private ProjectManager() {
    }

    public static ProjectManager getInstance() {
        if (instance == null) {
            synchronized (ProjectManager.class) {
                if (instance == null) {
                    instance = new ProjectManager();
                }
            }
        }

        return instance;
    }
}
