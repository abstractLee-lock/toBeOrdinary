package designMode.创建型.单例模式;

/**
 * @author Lee
 * @date 2022/3/1 21:07
 */
//饿汉式 线程安全
public class Singleton {
    private Singleton() {
    }

    private static final Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
    }
}
