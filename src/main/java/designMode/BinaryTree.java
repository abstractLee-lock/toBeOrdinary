package designMode;

import lombok.Data;

/**
 * @author Lee
 * @date 2022/3/9 21:53
 */
public class BinaryTree {
    private Node root;

    protected static void init() {
        Node node = new Node("1");
    }

    @Data
    protected static class Node {
        public Node(String data) {
            this.data = data;
        }

        private Node leftNode;
        private Node rightNode;
        private String data;
    }
}
