package designMode.创建型.抽象工厂模式;

/**
 * @author Lee
 * @date 2022/3/7 20:28
 */
public class Truth {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.getAnimal();
        Fruit fruit = animalFactory.getFruit();

    }

    protected interface AbstractFactory {
        public Animal getAnimal();

        public Fruit getFruit();

    }

    ;

    protected static class AnimalFactory implements AbstractFactory {
        @Override
        public Animal getAnimal() {
            return new Cow();
        }

        @Override
        public Fruit getFruit() {
            return new XiGua();
        }
    }

    protected abstract interface Animal {

    }

    protected abstract interface Fruit {

    }

    protected static class Cow implements Animal {

    }

    protected static class XiGua implements Fruit {

    }
}
