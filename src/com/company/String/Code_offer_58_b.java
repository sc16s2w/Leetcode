package com.company.String;

/**
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 * 请定义一个函数实现字符串左旋转操作的功能。
 * 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"
 */
//没看懂高级方法
public class Code_offer_58_b {
    public static String reverseLeftWords(String s, int n) {
        char[] arr = s.toCharArray();
        char[] arrnew = new char[arr.length];
        int j =0;
        for(int i =n;i<arr.length;i++){
            arrnew[j] = arr[i];
            j++;
        }
        for(int i =0; i<n;i++){
            arrnew[j] = arr[i];
            j++;
        }
        return String.valueOf(arrnew);

    }
}
