package com.algorithm.offerday;

public class RectCover {
    //10.矩形覆盖
    // 2*1的小矩形横着或者竖着去覆盖更大的矩形

    public int RectCover(int target) {
        int a = 2, b = 1, c = 0;
        if (target == 1) {
            return 1;
        }else if (target == 2) {
            return 2;
        } else {
            for (int i = 3; i <= target; i++) {
                c = a + b;
                b = a;
                a = c;
            }
            return c;
        }
    }
}
