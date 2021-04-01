package level_2_1;

class Main {
    public static void main(String[] args) {
        long x = 30;
        long y = 4;
        System.out.println(level2_1(x, y));
    }

    public static long level2_1(long x, long y) {
        long ref = x + (y - 1);
        return (((ref * ref) + ref) / 2) - (y - 1);
    }
}
