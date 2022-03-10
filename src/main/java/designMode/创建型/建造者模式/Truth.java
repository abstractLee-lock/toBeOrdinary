package designMode.创建型.建造者模式;

import lombok.Data;

/**
 * @author Lee
 * @date 2022/3/7 20:00
 */
class Truth {
    public static void main(String[] args) {
        FatherBuilder fatherBuilder = new FatherBuilder();
        Director director = new Director(fatherBuilder);
        director.doIt();
        Product result = director.getResult();
        MotherBuilder motherBuilder = new MotherBuilder();
        Director director1 = director = new Director(motherBuilder);
        director.doIt();
        Product result1 = director1.getResult();
        System.out.println(result);
        System.out.println(result1);
    }

    protected static class Director {
        private Builder builder;

        public Director(Builder builder) {
            this.builder = builder;
        }

        public void doIt() {
            builder.builderName();
            builder.builderNum();
        }

        public Product getResult() {
            return builder.getProduct();
        }
    }


    protected static class MotherBuilder extends Builder {
        @Override
        void builderName() {
            product.setName("张飞");
        }

        @Override
        void builderNum() {
            product.setNum(1);
        }
    }

    protected static class FatherBuilder extends Builder {
        @Override
        void builderName() {
            product.setName("张三");
        }

        @Override
        void builderNum() {
            product.setNum(1);
        }
    }

    protected static abstract class Builder {
        Product product = new Product();

        abstract void builderName();

        abstract void builderNum();

        public Product getProduct() {
            return product;
        }
    }


    @Data
    protected static class Product {
        private String name;
        private int num;

    }
}
