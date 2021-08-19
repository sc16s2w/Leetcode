package com.company.Ali;

public class Code_165 {
    public int compareVersion(String version1, String version2) {
        String[] temp1 = version1.split("\\.");
        String[] temp2 = version2.split("\\.");
        int i1, i2;
        for (int i = 0; i < Math.max(temp1.length, temp2.length); i++) {
            if (i < temp1.length) i1 = Integer.parseInt(temp1[i]);
            else i1 = 0;
            if (i < temp2.length) i2 = Integer.parseInt(temp2[i]);
            else i2 = 0;
            if (i1 != i2) return i1 > i2 ? 1 : -1;
        }
        return 0;
    }


}
