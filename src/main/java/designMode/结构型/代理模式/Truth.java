package designMode.结构型.代理模式;

/**
 * @author Lee
 * @date 2022/3/7 21:50
 */
public class Truth {
    public static void main(String[] args) {
        ProxyClass proxyClass = new ProxyClass();
        proxyClass.preMethod();
        proxyClass.proxyMethod();
        proxyClass.posMethod();
    }

    protected interface AbstractClass {
        void method();
    }

    protected static class TruthClass implements AbstractClass {

        @Override
        public void method() {
            System.out.println("真实类方法");
        }
    }

    protected static class ProxyClass {
        private TruthClass truthClass = new TruthClass();

        protected void preMethod() {
            System.out.println("前置访问");
        }

        protected void proxyMethod() {
            if (truthClass == null) {
                truthClass = new TruthClass();
            }
            System.out.println("通过代理类访问");
            truthClass.method();
        }

        protected void posMethod() {
            System.out.println("后置访问");
        }
    }


}
