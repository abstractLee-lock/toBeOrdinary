package designMode.创建型.原型模式;

import lombok.Data;

/**
 * @author Lee
 * @date 2022/3/7 21:21
 */
public class Truth {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        Prototype clone = (Prototype) prototype.clone();
        String name = clone.getName();
        System.out.println(name);

    }

    @Data
    protected static class Prototype implements Cloneable {
        private String name = "张三";

        //浅克隆
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
        //深克隆
    }
}
