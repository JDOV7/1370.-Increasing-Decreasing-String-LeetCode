package leetcode;

import java.util.Arrays;
import java.util.Vector;

public class IncreasingDecreasingString1370 {

    public void IncreasingDecreasingString1370() {
        String s = "rat";
        StringBuffer sText = new StringBuffer();
        StringBuffer sTextReturn = new StringBuffer();
        char cArr[] = s.toCharArray();
        Arrays.sort(cArr);
        for (int i = 0; i < s.length(); i++) {
            sText.append(cArr[i]);

        }
        while (sText.length() != 0) {
            for (char i = 'a'; i <= 'z' && sText.length() != 0; i++) {
                StringBuffer sTemporal = new StringBuffer();
                sTemporal.append(i);
                if (sText.lastIndexOf(sTemporal.toString()) != -1) {
                    sTextReturn.append(sTemporal.toString());
                    if (i == sText.charAt(sText.length() - 1)) {
                        sText.deleteCharAt(sText.lastIndexOf(sTemporal.toString()));
                        break;
                    } else {
                        sText.deleteCharAt(sText.lastIndexOf(sTemporal.toString()));
                    }
                }
            }
            for (char i = 'z'; i >= 'a' && sText.length() != 0; i--) {
                StringBuffer sTemporal = new StringBuffer();
                sTemporal.append(i);
                if (sText.indexOf(sTemporal.toString()) != -1) {
                    sTextReturn.append(sTemporal.toString());
                    if (i == sText.charAt(0)) {
                        sText.deleteCharAt(sText.indexOf(sTemporal.toString()));
                        break;
                    } else {
                        sText.deleteCharAt(sText.indexOf(sTemporal.toString()));
                    }
                }
            }
        }
        System.out.println(sTextReturn);

    }
}
