package com.algorithm.offerday;

public class JumpFloorII {
    //09.变态跳台阶
    //一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级
    public int JumpFloorII(int target) {
        if (target <= 0) {
            return 0;
        }else if (target == 1) {
            return 1;
        }
        else {
            return 2 * JumpFloorII(target -1);
        }
    }
}
