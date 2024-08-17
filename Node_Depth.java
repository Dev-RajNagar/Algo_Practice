import java.util.*;
public class Node_Depth {
    public static int nodeDepths(BinaryTree root){
        int sumOfDepths = 0;
        List<level> stack = new ArrayList<level>();
        stack.add(new level(root,0));
        while(stack.size()>0){
            level top= stack.remove(stack.size()-1);
            BinaryTree node = top.root;
            int depth = top.depth;
            if(node==null) continue;
            sumOfDepths+=depth;
            stack.add(new level(node.left,depth+1));
            stack.add(new level(node.right,depth+1));
        }
        return sumOfDepths;
    }
    static class level{
        public BinaryTree root;
        int depth;
        public level(BinaryTree root, int depth){
            this.root=root;
            this.depth=depth;
        }
    }
    static class BinaryTree{
        int value;
        BinaryTree left;
        BinaryTree right;
        public BinaryTree(int value){
                this.value=value;
                left= null;
                right=null;
        }
    }
}
