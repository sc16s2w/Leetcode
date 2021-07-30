package com.company.String;

/**
 * 给你一个字符串 columnTitle ，表示 Excel 表格中的列名称。返回该列名称对应的列序号。
 */
public class Code_171 {
    public int titleToNumber(String columnTitle) {
        char[] ch = columnTitle.toCharArray();
        int sum = 0;
        int multiple = 1;
        for(int i = ch.length-1;i>=0;i--){
            int k = (ch[i]-'A')+1;
            sum += k*multiple;
            multiple*=26;
        }
        return sum;
    }
    public static void main(String[] args){
        String s = "A";
        System.out.println(s.charAt(0)-'A');
    }
}
