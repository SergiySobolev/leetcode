package com.sbk.leetcode.tree;

public class BuildTreeFromPreOAndIO {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildBST(0, 0, preorder.length-1, preorder, inorder);
    }

    private TreeNode buildBST(int rootPos, int inStart, int inEnd, int[] preorder, int[] inorder){
        if(inStart > inEnd || rootPos > preorder.length-1) return null;
        int midPos=0;
        for(int i=inStart;i<=inEnd;i++) {
            if (preorder[rootPos] == inorder[i]) {
                midPos = i;
            }
        }
        TreeNode node = new TreeNode(preorder[rootPos]);
        node.left = buildBST(rootPos+1, inStart, midPos-1, preorder, inorder);
        node.right = buildBST(rootPos+(midPos-inStart)+1, midPos+1, inEnd, preorder, inorder);
        return node;
    }
}
