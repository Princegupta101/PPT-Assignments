/*
Question 4

You need to construct a binary tree from a string consisting of parenthesis and integers.
The whole input represents a binary tree. It contains an integer followed by zero, one or two pairs of parenthesis. The integer represents the root's value and a pair of parenthesis contains a child binary tree with the same structure.
You always start to construct the left child node of the parent first if it exists.


Input: s = "4(2(3)(1))(6(5))"
Output: [4,2,6,3,1,5]
 */

//   Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Question_4 {
    public static String tree2str(TreeNode root) {
        if (root == null)
            return "";
        String output = String.valueOf(root.val);
        if (root.left != null || root.right != null)
            output += "(" + tree2str(root.left) + ")";
        if (root.right != null)
            output += "(" + tree2str(root.right) + ")";

        return output;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(10);
        TreeNode n2 = new TreeNode(11);
        TreeNode n3 = new TreeNode(12);
        TreeNode n4 = new TreeNode(13);
        TreeNode n5 = new TreeNode(14);
        TreeNode n6 = new TreeNode(15);
        n1.left = n2;
        n2.left = n3;
        n3.left = n4;
        n1.right = n5;
        n5.left = n6;
        System.out.println(tree2str(n1));  // 10(11(12(13)))(14(15))
    }
}
