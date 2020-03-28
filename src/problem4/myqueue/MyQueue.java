/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

public class MyQueue {
    static class Node{
       int key;
       Node left;
       Node right;
       Node parent;
    }
    static Node insert (int key,Node root,Node parent){
        if(root==null){
            Node node=new Node();
            if(node!=null){
                node.key=key;
                node.left=node.right=null;
                node.parent=parent;
                return node;
            }
        else
                System.out.println("not access memory");
        }
        else if(key==root.key)
            System.out.println("no duplicates"+"allowed in BST");
        else
            root.left=insert(key,root.left,root);
        return root;

}
static Node search (int key,Node root){
    if(root==null)
        return null;
    else if(key==root.key)
        return root;
    else if(key > root.key)
        return search(key,root.right);
    else
        return search(key,root.left);
    }
    static Node preOrderSuccessor(int key,Node root){
        Node node=search(key,root);
        if(node==null)
        {
            System.out.println(key);
            return null;
        }
        if(node.left!=null)
            return node.left;
        else if(node.right!=null)
            return node.right;
        else
        {
            Node temp=node.parent;
            while(temp!=null)
            {
                if(key < temp.key && emp.right!=null)
                    break;
                temp=temp.parent;
            }
            return temp !=null ? temp.right : null;
        }
    }
    static void preOrder(Node root)
    {
        if(root!=null){
            System.out.println("%d",root.key);
            preOrder(root.left);
            preorder(root.right);
        }
    }

}
