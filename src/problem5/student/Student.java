/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;

import java.util.Scanner;

// to store student information and properties
public class Student {
    private String name;
    private int rollno,backlog,appearingcount;
    private Scanner sc;
    private Student(){
        sc=new Scanner(System.in);
        System.out.print("Name :");
        this.name=sc.next();
        System.out.print("roll no.");
        this.rollno=sc.nextInt();
        System.out.print("backlog count");
        this.backlog=sc.nextInt();
        System.out.println("appearing_count");
        this.appearingcount=sc.nextInt();
    }
    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name=name;
    }
    public int getRollno(int rollno){
        this.rollno=rollno;
    }
public void setRollno(int rollno){
        this.rollno=rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", backlog=" + backlog +
                ", appearingcount=" + appearingcount +
                ", sc=" + sc +
                '}';
    }
    public int getBacklog(){
        return backlog;
    }
    public void setBacklog(int backlog){
        this.backlog=backlog;
    }
    public int getAppearingcount(){
        return appearingcount;
    }
    public void setAppearingcount(int appearingcount){
        this.appearingcount=appearingcount;
    }
}
