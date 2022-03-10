package designMode.结构型.模板方法模式;

/**
 * @author Lee
 * @date 2022/3/10 19:13
 */
public class Truth {
    public static void main(String[] args) {
        MethodClass methodClass = new MethodClass();
        methodClass.templateMethod();
    }

    protected static abstract class AbstarctMethodClass {
        void templateMethod() {
            SpecificMethod();
            abstractMethod1();
            abstractMethod2();
            abstractMethod3();
        }

        //具体方法
        public void SpecificMethod() {
            System.out.println("抽象类中的具体方法被调用...");
        }

        public abstract void abstractMethod3();

        public abstract void abstractMethod2();

        public abstract void abstractMethod1();
    }

    protected static class MethodClass extends AbstarctMethodClass {


        @Override
        public void abstractMethod3() {
            System.out.println("子类实现抽象方法3");
        }

        @Override
        public void abstractMethod2() {
            System.out.println("子类实现抽象方法2");
        }

        @Override
        public void abstractMethod1() {
            System.out.println("子类实现抽象方法1");
        }
    }

}
