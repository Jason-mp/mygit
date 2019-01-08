package com.algorithm.offerday;

import java.util.ArrayList;

/**
 * @Author xp
 * @Date: 2019-01-08
 */
public class PrintMatrix {
    /*
        19. 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
        例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
        则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
     */

    /**
     * 思路：暴力破解就是每个方向都一个循环，然后外面接一层大大循环，控制好边角条件
     */
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if (matrix.length == 0) {
            return list;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        //二维数组非法
        if (columns == 0) {
            return list;
        }
        int layer = (Math.min(rows, columns) - 1) / 2 + 1;
        for (int i = 0; i < layer; i++) {
            //从左到右
            for (int k = i; k < columns - i; k++) {
                list.add(matrix[i][k]);
            }
            //从右上到右下
            for (int j = i+1; j < rows - i; j++) {
                list.add(matrix[j][columns - i - 1]);
            }
            //从右下到左下
            for (int k = columns - i - 2; (k >= i && rows - i - 1 != i); k--) {
                list.add(matrix[rows - i - 1][k]);
            }
            //从左下到左上
            for (int j = rows - i - 2; j > i && columns - i - 1 != i; j--) {
                list.add(matrix[j][i]);
            }
        }

        return list;
    }

}
