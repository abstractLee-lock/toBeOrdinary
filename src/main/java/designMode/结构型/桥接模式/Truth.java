package designMode.结构型.桥接模式;

/**
 * @author Lee
 * @date 2022/3/8 19:08
 */
public class Truth {
    public static void main(String[] args) {
        Implatable implatable = new TruthImplatable();
        ExtendClass extendClass = new ExtendClass(implatable);
        extendClass.abstractExtendMethod();
    }

    protected interface Implatable {
        void interfaceMethod();
    }

    protected static class TruthImplatable implements Implatable {

        @Override
        public void interfaceMethod() {
            System.out.println("具体实现方法");
        }
    }

    protected static abstract class Abstraction {
        protected Implatable implatable;

        public Abstraction(Implatable implatable) {
            this.implatable = implatable;
        }

        void abstractExtendMethod() {

        }
    }

    protected static class ExtendClass extends Abstraction {
        public ExtendClass(Implatable implatable) {
            super(implatable);
        }

        @Override
        void abstractExtendMethod() {
            System.out.println("拓展方法");
            implatable.interfaceMethod();
        }
    }


}
