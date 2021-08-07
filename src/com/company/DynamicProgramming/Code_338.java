package com.company.DynamicProgramming;

public class Code_338 {
    int add2(int a, int b) {
        int carry;
        while (b != 0) {
            carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
}
