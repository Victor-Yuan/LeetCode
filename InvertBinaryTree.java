class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }
        if(root.left == null && root.right != null) {
            TreeNode node = root.right;
            root.left = new TreeNode(0);
            root.left = node;
            root.right = null;
        }else if(root.left != null && root.right == null) {
            TreeNode node = root.left;
            root.right = new TreeNode(0);
            root.right = node;
            root.left = null;
            //return root;
        }else if(root.left != null && root.right != null) {
            TreeNode node = root.left;
            root.left = root.right;
            root.right = node;
        }
        invertTree(root.left);
        invertTree(root.right);
            
        return root;
    }
}

/**
 * 解题时可以不用判断那么多次
 * 只有判断root是否为空即可
 */