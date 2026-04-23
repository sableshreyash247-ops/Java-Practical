class Pract7 {

    static int icount(String s1, String s2) {

        int count = 0;

        for (int i = 0; i <= s1.length() - s2.length(); i++) {

            if (s1.startsWith(s2, i)) {
                count++;
            }
        }

        return count;
    }

    static int rcount(String s1, String s2, int index) {

        if (index > s1.length() - s2.length())
            return 0;

        if (s1.startsWith(s2, index))
            return 1 + rcount(s1, s2, index + 1);

        return rcount(s1, s2, index + 1);
    }

    public static void main(String[] args) {

        String s1 = "yummytummy";
        String s2 = "umm";

        int result1 = icount(s1, s2);
        int result2 = rcount(s1, s2, 0);

        System.out.println("Iteration count: " + result1);
        System.out.println("Recursion count: " + result2);
    }
}