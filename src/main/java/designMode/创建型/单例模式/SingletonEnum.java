package designMode.创建型.单例模式;

/**
 * @author Lee
 * @date 2022/3/1 21:07
 */
//枚举单例 不仅可以解决线程同步，也可以防止反序列化
public enum SingletonEnum {
    INSTANCE;

    public static void main(String[] args) {
        SingletonEnum instance = SingletonEnum.INSTANCE;
    }


}
