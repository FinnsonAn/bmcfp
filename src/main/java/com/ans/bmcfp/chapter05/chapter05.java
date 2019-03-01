package com.ans.bmcfp.chapter05;

import java.util.ArrayList;
import java.util.Collections;

public class chapter05 {

    /**
     *一个整数可以被分解为多个整数的乘积，例如，6 可以分解为 2x3。
     * 请使用递归编程的方法，为给定的整数 n，找到所有可能的分解（
     * 1 在解中最多只能出现 1 次）。
     * 例如，输入 8，输出是可以是 1x8, 8x1, 2x4, 4x2,
     * 1x2x2x2, 1x2x4, ……
     *
     */
    public static void main(String[] args) {

        fff(8, new ArrayList<Integer>());
    }

    private static void fff(int total, ArrayList<Integer> result) {

        if (total == 1 && result.contains(1)) {
            System.out.println(result);
            return;
        }
        int i = result.contains(1) ? 2 : 1;
        for (; i <= total; i++) {
            ArrayList<Integer> temp = (ArrayList<Integer>) result.clone();
            Collections.copy(temp, result);
            if (total % i != 0) {
                continue;
            }
            temp.add(i);
            fff(total / i, temp);
        }
    }
}
