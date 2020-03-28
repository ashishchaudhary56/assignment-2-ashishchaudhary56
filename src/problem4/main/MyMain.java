/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    private static final Object ROOT = ;

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a[]=new int[n];
int n=sc.nextInt();
int n=a.length;
        for (int i = 0; i < ; i++) {
            System.out.printf("inserting in %2d",a[i]);
            ROOT=insert(a[i], ROOT,null);
            System.out.printf("Finished insertion.\n");

        }
        System.out.printf("\nPre-Order Traversal :");
        preOrder(ROOT);
        System.out.println("\n===");
        Node successor=null;
        for (int i = 0; i < ; i++) {
            if(successor!=null)
                System.out.printf("%-10d%d\n",a[i],successor.key);
            else
                System.out.printf("%-10d not exist.\n",a[i]);

        }
    }


}
