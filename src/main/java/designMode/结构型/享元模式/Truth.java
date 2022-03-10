package designMode.结构型.享元模式;

import lombok.Data;

import java.util.HashMap;

/**
 * @author Lee
 * @date 2022/3/8 20:59
 */
public class Truth {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        flyweightFactory.getFlyweight("a").operation(new UnsharedConcreteFlyweight("bb"));
        flyweightFactory.getFlyweight("a").operation(new UnsharedConcreteFlyweight("cc"));
        flyweightFactory.getFlyweight("a").operation(new UnsharedConcreteFlyweight("dd"));

    }

    @Data
    protected static class UnsharedConcreteFlyweight {
        public UnsharedConcreteFlyweight(String name) {
            this.name = name;
        }

        protected String name;
    }

    interface Flyweight {
        public void operation(UnsharedConcreteFlyweight state);
    }

    protected static class ConcreteFlyweight implements Flyweight {
        private String key;

        public ConcreteFlyweight(String key) {
            this.key = key;
            System.out.print("具体享员对象创建:" + key);
        }

        @Override
        public void operation(UnsharedConcreteFlyweight state) {
            System.out.println("非享元信息被调用:" + state.getName());
        }
    }

    protected static class FlyweightFactory {
        private HashMap<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

        public Flyweight getFlyweight(String key) {
            if (flyweights.get(key) == null) {
                System.out.println("具体享元已被创建");
                ConcreteFlyweight concreteFlyweight = new ConcreteFlyweight(key);
                flyweights.put(key, concreteFlyweight);
                return concreteFlyweight;
            } else {
                System.out.println("具体享元存在，被调用");
                return flyweights.get(key);
            }
        }
    }
}
