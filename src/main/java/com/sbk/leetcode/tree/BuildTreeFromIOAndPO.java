package com.sbk.leetcode.tree;

public class BuildTreeFromIOAndPO {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildBST(postorder.length-1, 0, postorder.length-1, inorder, postorder);
    }
    private TreeNode buildBST(int rootPos, int inStart, int inEnd, int[] inorder, int[] postorder){
        if(inStart > inEnd || rootPos < 0) return null;
        int midPos=0;
        for(int i=inStart;i<=inEnd;i++)
            if(postorder[rootPos] == inorder[i]) midPos = i;
        TreeNode node = new TreeNode(postorder[rootPos]);
        node.left = buildBST(rootPos - (inEnd - midPos) - 1, inStart, midPos-1, inorder, postorder);
        node.right = buildBST(rootPos-1, midPos+1, inEnd, inorder, postorder);
        return node;
    }
}
