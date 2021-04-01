package level_1;

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        String val = "code";
        System.out.println(level1(val));
    }

    public static String level1(String s) {
        HashMap<Character, String> braille = new HashMap<>() {{
            put('a', "100000");
            put('b', "110000");
            put('c', "100100");
            put('d', "100110");
            put('e', "100010");
            put('f', "110100");
            put('g', "110110");
            put('h', "110010");
            put('i', "010100");
            put('j', "010110");

            put('k', "101000");
            put('l', "111000");
            put('m', "101100");
            put('n', "101110");
            put('o', "101010");
            put('p', "111100");
            put('q', "111110");
            put('r', "111010");
            put('s', "011100");
            put('t', "011110");

            put('u', "101001");
            put('v', "111001");
            put('x', "101101");
            put('y', "101111");
            put('z', "101011");

            put('w', "010111");

            put('#', "000001");

            put(' ', "000000");
        }};

        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(braille.get('#')).append(braille.get(Character.toLowerCase(c)));
            } else {
                result.append(braille.get(Character.toLowerCase(c)));
            }
        }

        return String.valueOf(result);
    }
}
