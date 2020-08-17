/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shakil
 */
public class BubbleSort {
    void bubblesort(int a[])
    { int n=a.length;
    for(int i=0;i<n-1;i++);
    for(int j=0;j<n-i-1;j++)
        if(a[j]>a[j+1])
        { 
            int flag=a[j];
            a[j]=a[j+1];
            a[j+1]=flag;
            
        }
    }
    void printarray(int x[])
    {
        int n=x.length;
        for(int i=0;i<n;++i)
            System.out.println(x[i]+"");
                   System.out.println();
    }
    public static void main[String args[])
    {
        BubbleSort 1=new BubbleSort();
        int array[]={1,3,2,4,5};
        1.bubbleSort(array);
        System.out.println("sorted arrays");
        1.printarray(array);
    }
}
