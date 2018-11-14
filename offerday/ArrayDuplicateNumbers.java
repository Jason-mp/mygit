package com.algorithm.offerday;

public class ArrayDuplicateNumbers {

    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        //解题思路：转换为字符串，遍历，某个数字出现的index与它最后出现的index不同时，即为重复出现

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            sb.append(numbers[i] + "");
        }
        for (int j = 0; j < length; j++) {
            if (sb.indexOf(numbers[j] + "") != sb.lastIndexOf(numbers[j] + "")) {
                duplication[0] = numbers[j];
                return true;
            }
        }
        return false;

    }

    public boolean duplicate2(int numbers[],int length,int [] duplication) {
        //解题思路：本题中是将0~n-1的数放入length为n的数组中，那么可以假设该数字与index对应，不对应的话就为重复



        return false;
    }
}
