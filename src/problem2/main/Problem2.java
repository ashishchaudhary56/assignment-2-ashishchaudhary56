package problem2.main;

import java.util.Arrays;

public class Problem2 {
    static int search(int arr[], int x,int n){
        for (int i = 0; i<n ; i++) {
            if(arr[i]==x )
                return i;
            return -1;

        }
        static void printPostOrder(int in[],int pre[],int n){
            int root=search(in,pre[0],n);
            if(root!=0)
                printPostOrder(in, Arrays.copyOfRange(pre,1,n),root);
            if(root!=n-1)
                printPostOrder(Arrays.copyOfRange(in,root+1,n),Arrays.copyOfRange(pre,1+root,n),n-root-1);
            System.out.print(pre[0]+ " ");
        }
    }

    private static void printPostOrder(int[] copyOfRange, int[] copyOfRange1, int i) {

    }


}


