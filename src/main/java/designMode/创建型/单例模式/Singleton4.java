package designMode.创建型.单例模式;

/**
 * @author Lee
 * @date 2022/3/1 21:07
 */
//静态内部类 加载外部类时不会加载内部类，实现懒加载
public class Singleton4 {
    private Singleton4() {
    }

    private static class SingletonHolder {
        public static final Singleton4 singleton4 = new Singleton4();

    }

    public static Singleton4 getInstance() {
        return SingletonHolder.singleton4;
    }

    public static void main(String[] args) {
        Singleton4.getInstance();
    }

}
