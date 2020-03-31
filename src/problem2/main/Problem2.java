package problem2.main;

import problem1.node.TreeNode;

import java.util.Arrays;

public class Problem2 {
    void printPostorder(TreeNode node){
        if(node==null)
            return;
        printPostorder(node.getLeft());
        printPostorder(node.getRight());
        System.out.println(node.getData()+ "");
    }
    void printInorder(TreeNode node){
        if(node==null)
            return;
        printInorder(node.getLeft());
        System.out.println(node.getData()+"");
        printInorder(node.getRight());
    }
    void printPreorder(TreeNode node){
        if(node==null)
            return;
        System.out.println(node.getData()+ " ");
        printPreorder(node.getLeft());
        printPreorder(node.getRight());
    }}



