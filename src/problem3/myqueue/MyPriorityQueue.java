/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

import java.util.Arrays;
import java.util.Collections;

public class MyPriorityQueue {
    private Node front;
    private Node rear;
    public MyPriorityQueue(){
        this.front=null;
        this.rear=null;

    }
    public boolean isEmpty(){
        return front==null;
    }
    public void insert(int dat,int proirity){
        Node n=new Node(data,proirity);
        if(isEmpty()||n.getPriority()< front.getPriority()){
            n.setNext();ext(front);
            front=n;

        }
        else{
            Node tem=front;
            while(tem.getNext()!=null && tem.getNext().getPriority()<=n.getPriority()) {
                tem = tem.getNext();
            }
            n.setNext(tem.getNext());
            tem.setNext(n);
            }

        }
        public void display(){
        if(isEmpty()){
            System.out.println("undeflow");

        }
        else{
            Node tem=front;
            while(tem!=null){
                System.out.println(tem.getData()+ " "+tem.getPriority());
                tem=tem.getNext()
            }
        }
    }

}
