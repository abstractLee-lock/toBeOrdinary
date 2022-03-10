package designMode.创建型.策略模式;

/**
 * @author Lee
 * @date 2022/3/7 20:56
 */
public class Truth {
    public static void main(String[] args) {
        Context context = new Context();
        SA sa = new SA();
        context.setStrategy(sa);
        System.out.println(context.getSort());
        SB sb = new SB();
        context.setStrategy(sb);
        System.out.println(context.getSort());
    }

    static class Context {
        private Strategy strategy;

        public Strategy getStrategy() {
            return strategy;
        }

        public void setStrategy(Strategy strategy) {
            this.strategy = strategy;
        }

        public int getSort() {
            return strategy.sort();
        }
    }

    interface Strategy<T> {
        int sort();
    }

    static class SA implements Strategy<SA> {
        @Override
        public int sort() {
            return 1;
        }
    }

    static class SB implements Strategy<SB> {
        @Override
        public int sort() {
            return 2;
        }
    }

}
