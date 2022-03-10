package designMode.创建型.工厂模式;

/**
 * @author Lee
 * @date 2022/3/3 20:34
 */
public class BeanFactory {
    protected static Product getProduct(String productName) {
        if ("草莓".equals(productName))
            return new CaoMei();
        if ("苹果".equals(productName))
            return new PingGuo();
        return null;
    }

    public static void main(String[] args) {
        Product caomei = BeanFactory.getProduct("草莓");
        caomei.doSomething();
    }
}
