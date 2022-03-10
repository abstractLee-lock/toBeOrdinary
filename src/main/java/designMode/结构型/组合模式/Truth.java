package designMode.结构型.组合模式;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Lee
 * @date 2022/3/9 21:26
 */
public class Truth {
    public static void main(String[] args) {
        Composite composite = new Composite();
        Leaf leaf1 = new Leaf("叶子节点1");
        Leaf leaf2 = new Leaf("叶子节点2");
        Leaf leaf3 = new Leaf("叶子节点3");
        composite.add(leaf1);
        composite.add(leaf2);
        composite.add(leaf3);
        composite.operation();
        System.out.println("--------------------------");
        composite.getChild(2).operation();
    }

    protected interface Component {
        void operation();
    }

    //树叶构件
    protected static class Leaf implements Component {
        private String name;

        public Leaf(String name) {
            this.name = name;
        }

        @Override
        public void operation() {
            System.out.println("树叶" + name + "被调用");
        }
    }

    //树枝构件
    protected static class Composite implements Component {
        private List<Component> componentList = new ArrayList<Component>();

        public void add(Component component) {
            componentList.add(component);
        }

        public void remove(Component component) {
            componentList.remove(component);
        }

        public Component getChild(int i) {
            return componentList.get(i);
        }

        @Override
        public void operation() {
            for (Component component : componentList) {
                component.operation();
            }
        }
    }
}
