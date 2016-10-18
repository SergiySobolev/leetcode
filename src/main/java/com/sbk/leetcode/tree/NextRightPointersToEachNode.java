package com.sbk.leetcode.tree;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NextRightPointersToEachNode {
    public void connect(TreeLinkNode root) {
        if(Objects.isNull(root)) return;
        List<List<TreeLinkNode>> levels = new ArrayList<>();
        List<TreeLinkNode> curLevel = new ArrayList<>();
        curLevel.add(root);
        while(!curLevel.isEmpty()) {
            List<TreeLinkNode> newLevel = new ArrayList<>();
            for(TreeLinkNode n : curLevel) {
                if(!Objects.isNull(n.left)) {
                    newLevel.add(n.left);
                    newLevel.add(n.right);
                }
            }
            levels.add(curLevel);
            curLevel = newLevel;
        }
        for(List<TreeLinkNode> level : levels) {
            for(int i=0;i<level.size()-1;i++){
                level.get(i).next = level.get(i+1);
            }
        }
    }
}
