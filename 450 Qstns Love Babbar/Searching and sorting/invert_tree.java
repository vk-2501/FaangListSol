Invert Tree

Given a binary tree root, invert it so that its left subtree and right subtree are swapped and the children are recursively inverted.

import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public Tree solve(Tree root) {
        if(root==null){
            return root;
        }

        Tree node=root.left;
        
        root.left=root.right;
        root.right=node;

        Tree rn=solve(root.left);
        Tree ln=solve(root.right);

        return root;
    }
}