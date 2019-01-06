package com.algorithm.mytry;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {10, 7, 2, 4, 7, 62, 3, 4, 2, 1, 8, 9, 19};
        heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print("  ");
        }
    }


    public static void heapSort(int[] arrays) {
        int n = arrays.length-1;
        for(int i=(n-1)/2;i>=0;i--) {
            //构造大顶堆，从下往上构造
            //i为最后一个根节点，n为数组最后一个元素的下标
            buildHeap(arrays,i,n);
        }
        for(int i=n;i>0;i--) {
            //把最大的数，也就是顶放到最后
            //i每次减一，因为要放的位置每次都不是固定的
            swap(arrays,i);
            //再构造大顶堆
            buildHeap(arrays,0,i-1);
        }
    }

    public static void buildHeap(int[] arrays,int parent,int length) {
        int temp = arrays[parent];
        //2*parent+1是其左孩子节点
        for(int i=parent*2+1;i<=length;i=i*2+1) {
            //如果左孩子大于右孩子，就让i指向右孩子
            if(i<length && arrays[i]<arrays[i+1]) {
                i++;
            }
            if(temp>=arrays[i]) {
                break;
            }
            //如果父节点小于孩子节点，那就把孩子节点放到父节点上
            arrays[parent] = arrays[i];
            //把孩子节点的下标赋值给parent
            //让其继续循环以保证大根堆构造正确
            parent = i;
        }
        //将刚刚的父节点中的数据赋值给新位置
        arrays[parent] = temp;

    }

    public static void swap(int[] arr,int i)
    {
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
    }

}
