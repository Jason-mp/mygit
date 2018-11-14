package com.algorithm.offerday;

public class DyadicArraySearch {

    /*
        从题目上来看，易知突破点应该在右（左）上角，作为本行（列）最大的数
        目标数target > 角落的数，则该往下（右）移动，反之则反方向，然后递归
     */
    public boolean Find(int target, int [][] array) {

        int row = array.length - 1;
        int i = 0;
        while (row >=0 && (i < array[0].length)) {
            if (target > array[row][i]) {
                i++;
            } else if (target < array[row][i]) {
                row--;
            } else{
                return true;
            }
        }
        return false;
    }
}
