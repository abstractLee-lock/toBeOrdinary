package designMode.创建型.工厂方法模式;

/**
 * @author Lee
 * @date 2022/3/10 18:19
 */
public class Truth {
    public static void main(String[] args) {
        Product1Factory product1Factory = new Product1Factory();
        AbstractProduct product = product1Factory.getProduct();
        product.productOperation();
        Product2Factory product2Factory = new Product2Factory();
        AbstractProduct product2 = product2Factory.getProduct();
        product2.productOperation();

    }

    interface AbstractFactory {
        AbstractProduct getProduct();
    }

    interface AbstractProduct {
        void productOperation();
    }

    protected static class Product1 implements AbstractProduct {
        @Override
        public void productOperation() {
            System.out.println("产品一");
        }
    }

    protected static class Product2 implements AbstractProduct {
        @Override
        public void productOperation() {
            System.out.println("产品二");
        }
    }

    protected static class Product1Factory implements AbstractFactory {

        @Override
        public AbstractProduct getProduct() {
            return new Product1();
        }
    }

    protected static class Product2Factory implements AbstractFactory {

        @Override
        public AbstractProduct getProduct() {
            return new Product2();
        }
    }
}
