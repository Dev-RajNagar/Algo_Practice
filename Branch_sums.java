import java.util.*;

public  class Branch_sums {
        public static class BinaryTree
        {
            int value;
            BinaryTree left;
            BinaryTree right;
            BinaryTree(int value){
                this.value=value;
                this.left=null;
                this.right=null;
            }
        }
        public static void main(String[] args) {
           
        }
        public static List<Integer> branchSums(BinaryTree root){
            List<Integer> sums= new ArrayList<Integer>() ;
            calculateBranchSums(root,0,sums);
            return sums;
        }   
        public static void calculateBranchSums(BinaryTree node , int runningSum , List<Integer> sums){
            if(node == null){
                return;
            }
            int newRunningSums = runningSum + node.value;
            if(node.left==null && node.right == null){
                sums.add(newRunningSums);
                return;
            }
            calculateBranchSums(node.left,newRunningSums,sums);
            calculateBranchSums(node.right,newRunningSums,sums);

        }
}
