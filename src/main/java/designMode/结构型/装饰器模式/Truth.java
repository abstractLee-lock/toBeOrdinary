package designMode.结构型.装饰器模式;

/**
 * @author Lee
 * @date 2022/3/8 19:40
 */
public class Truth {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decorator = new ConcreteDecorator(component);
        decorator.operation();
    }

    interface Component {
        void operation();
    }

    protected static class ConcreteComponent implements Component {
        public ConcreteComponent() {
            System.out.println("创建具体构建角色");
        }

        @Override
        public void operation() {
            System.out.println("具体构建角色的方法");
        }
    }

    //抽象装饰
    protected static class Decorator implements Component {
        protected Component component;

        public Decorator(Component component) {
            this.component = component;
        }

        @Override
        public void operation() {
            component.operation();
        }
    }

    protected static class ConcreteDecorator extends Decorator {
        public ConcreteDecorator(Component component) {
            super(component);
        }

        @Override
        public void operation() {
            component.operation();
            addOperation();

        }

        public void addOperation() {
            System.out.println("装饰方法");
        }
    }

}
