package level_3_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        String val = "15";
        System.out.println(level3_1(val));
    }

    public static int level3_1(String val) {
        BigInteger intVal = new BigInteger(val);
        String binary = intVal.toString(2);
        int count = 0;
        while (binary.length() > 1) {
            if (binary.charAt(binary.length() - 1) == '0') {
                binary = binary.substring(0, binary.length() - 1);
                count++;
            } else if (binary.charAt(binary.length() - 1) == '1') {
                if (binary.charAt(binary.length() - 2) == '0') {
                    binary = binary.substring(0, binary.length() - 1);
                    count += 2;
                } else {
                    if (binary.length() == 2) {
                        binary = binary.substring(0, binary.length() - 1);
                        count += 2;
                    } else {
                        binary = addBinary(binary, "1");
                        count++;
                    }
                }
            }
        }
        if (binary.equals("0")) return ++count;
        return count;
    }

    static String addBinary(String a, String b) {
        String result = "";
        int s = 0;
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0 || s == 1) {
            s += ((i >= 0) ? a.charAt(i) - '0' : 0);
            s += ((j >= 0) ? b.charAt(j) - '0' : 0);
            result = (char) (s % 2 + '0') + result;
            s /= 2;
            i--;
            j--;
        }
        return result;
    }
}
