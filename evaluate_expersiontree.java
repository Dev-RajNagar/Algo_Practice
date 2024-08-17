import java.util.*;

class Program {
    // Input class
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public int evaluateExpressionTree(BinaryTree tree) {
        if (tree.value >= 0) {
            return tree.value;
        }
        int leftValue = evaluateExpressionTree(tree.left);
        int rightValue = evaluateExpressionTree(tree.right);

        if (tree.value == -1) {
            return leftValue + rightValue;
        } else if (tree.value == -2) {
            return leftValue - rightValue;
        } else if (tree.value == -3) {
            return leftValue / rightValue;
        }
        return leftValue * rightValue;
    }
}
