class Solution {
    private int preIndex = 0;
    HashMap<Integer,Integer> hm = new HashMap<>();
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        for(int i=0;i<postorder.length-1;i++){
            hm.put(postorder[i],i);
        }
        return helper(preorder,postorder,0,postorder.length-1);
    }
    private TreeNode helper(int[] preorder,int[] postorder,int left,int right){
        if(left>right || preIndex >= postorder.length){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preIndex++]);

        if(left == right){
            return root;
        }

        int leftSubTree = hm.get(preorder[preIndex]);

        root.left = helper(preorder,postorder,left,leftSubTree);
        root.right = helper(preorder,postorder,leftSubTree+1,right-1);

        return root;
    }
}