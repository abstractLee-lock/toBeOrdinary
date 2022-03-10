package designMode.结构型.适配器模式;

/**
 * @author Lee
 * @date 2022/3/7 22:05
 */
public class Truth {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.requerst();

    }

    protected static class ExistClass {
        void existMethod() {
            System.out.println("现存组件接口");
        }
    }

    protected interface Target {
        void requerst();
    }

    protected static class Adapter extends ExistClass implements Target {

        @Override
        public void requerst() {
            existMethod();
        }
    }
}
