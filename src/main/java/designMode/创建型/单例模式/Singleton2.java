package designMode.创建型.单例模式;

/**
 * @author Lee
 * @date 2022/3/1 21:07
 */
//懒汉式 线程不安全
public class Singleton2 {
    private Singleton2() {
    }

    private static Singleton2 singleton;

    public static Singleton2 getInstance() {
        if (singleton != null) {
            return singleton;
        }
        return new Singleton2();
    }
}
