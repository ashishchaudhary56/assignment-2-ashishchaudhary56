/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
// to implement BinarySearchTree
public class MyBinarySearchTree {
    static class TreeNode{
        String data;
        TreeNode left,right;
        TreeNode(String value){
            this.data=value;
            left=right=null;
        }
    }
    TreeNode root;
    public void inOrder(){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.printf("%s",node.data);
        inOrder(node.right);
    }
}
