package level_2_2;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        int[] val = {3, 1, 4, 1};
        System.out.println(level2_2(val));
    }

    public static int level2_2(int[] l) {
        ArrayList<Integer> list = new ArrayList<>(l.length);
        for (int i : l) {
            list.add(i);
        }
        list.sort((o1, o2) -> o2.compareTo(o1));

        for (int i = list.size(); i > 0; i--) {
            int res = combination(list, i);
            if(res != 0){
                return res;
            }
        }

        return 0;
    }

    public static int combination(ArrayList<Integer> elements, int k) {
        int N = elements.size();

        if (k > N) {
            return 0;
        }

        int[] pointers = new int[k];

        int r = 0; // index for combination array
        int i = 0; // index for elements array

        while (r >= 0) {
            if (i <= (N + (r - k))) {
                pointers[r] = i;
                if (r == k - 1) {
                    String s = "";
                    for (int pos : pointers) {
                        s += elements.get(pos);
                    }
                    int num = Integer.parseInt(s);
                    if (num % 3 == 0) {
                        return num;
                    }
                    i++;
                } else {
                    i = pointers[r] + 1;
                    r++;
                }
            } else {
                r--;
                if (r >= 0) {
                    i = pointers[r] + 1;
                }

            }
        }
        return 0;
    }
}
