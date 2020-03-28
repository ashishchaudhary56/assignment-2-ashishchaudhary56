/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import java.util.Arrays;
import java.util.Collections;

public class MyPriorityQueue {
    static void twoWaySort(Integer arr[],int n,int length)
    {
        int i=0,r=n-1;
        int k=0;
        while(i<r){
            while(arr[i]%2 !=0){
                i++;
                k++;
            }
            while(arr[r]%2==0 && i<r)
                r--;
            if(i<r){
                int temp=arr[i];
                arr[i]=arr[r];
                arr[r]=temp;
            }
        }
        Arrays.sort(arr,0,k, Collections.reverseOrder());
        Arrays.sort(arr,k,n);
    }
}
