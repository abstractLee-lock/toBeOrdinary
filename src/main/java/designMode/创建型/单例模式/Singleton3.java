package designMode.创建型.单例模式;

/**
 * @author Lee
 * @date 2022/3/1 21:07
 */
//双重检查
public class Singleton3 {
    private Singleton3() {
    }

    private static Singleton3 singleton;

    public static Singleton3 getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    return new Singleton3();
                }
            }
        }
        return singleton;
    }
}
