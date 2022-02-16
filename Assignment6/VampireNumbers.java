package Assignment6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VampireNumbers {
    static boolean areFangs(int f1, int f2, long num) {
        String f1Str = String.valueOf(f1);
        String f2Str = String.valueOf(f2);
        String vampireNumStr = String.valueOf(num);

        if(f1Str.length() != f2Str.length() || (f1Str.endsWith("0") && f2Str.endsWith("0"))) {
            return false;
        }

        char[] vampireNumChars = vampireNumStr.toCharArray();
        Arrays.sort(vampireNumChars);

        String factorsConcat = f1Str + f2Str;
        char[] factorsConcatChars = factorsConcat.toCharArray();
        Arrays.sort(factorsConcatChars);

        String sortedVampireNum = new String(vampireNumChars);
        String sortedFactorConcat = new String(factorsConcatChars);

        if(sortedVampireNum.equals(sortedFactorConcat)) {
            return true;
        }

        return false;
    }

    static boolean isVampire(long num) {
        int f1, f2;
        int numLength = String.valueOf(num).length();

        if(numLength%2 != 0)
            return false;

        int start = (int)Math.pow(10, numLength/2-1);
        int end = (int)Math.pow(10, numLength/2) - 1;

        for(int i=start; i<end; i++) {
            if(num%i == 0) {
                f1 = i;
                f2 = (int)num/f1;

                if(areFangs(f1, f2, num)) {
                    return true;
                }
            }
        }

        return false;
    }
}
