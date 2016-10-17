package com.sbk.leetcode.tree;


import java.util.*;

public class RootToLeafPathSum {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(Objects.isNull(root)) return new ArrayList<>();
        List<List<Integer>> allPaths = buildAllPaths(root, new ArrayList<>());
        List<List<Integer>> res = new ArrayList<>();
        for(List<Integer> path : allPaths){
            int pathSum = path.stream().mapToInt(i -> i).sum();
            if(pathSum == sum) {
                res.add(path);
            }
        }
        return res;
    }

    private List<List<Integer>> buildAllPaths(TreeNode root, List<Integer> prevPath) {
        if(Objects.isNull(root.left) && Objects.isNull(root.right)) {
            List<Integer> res = new ArrayList<>(prevPath);
            res.add(root.val);
            return Collections.singletonList(res);
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> newPrevPath = new ArrayList<>(prevPath);
        newPrevPath.add(root.val);
        if(!Objects.isNull(root.left)) {
            res.addAll(buildAllPaths(root.left, newPrevPath));
        }
        if(!Objects.isNull(root.right)) {
            res.addAll(buildAllPaths(root.right, newPrevPath));
        }
        return res;
    }
}
