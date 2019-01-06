package com.algorithm.offerday;

public class JumpFloor {

    //08.青蛙跳台阶 斐波那契数列的应用
    public int JumpFloor(int target) {
        int a = 1, b = 1, c = 0;
        if (target == 1 || target == 2) {
            return 1;
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
