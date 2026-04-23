  class Pract7B1 {

  static int func(String s1, String s2, int i) {

        if (i > s1.length() - s2.length()) {
            return 0;
        }

        int count = 0;

        if (s1.substring(i, i + s2.length()).equals(s2)) {
            count = 1;
        }

        return count + func(s1, s2, i + 1);
    }

    public static void main(String[] args) {

        String s1 = "yummytummy";
        String s2 = "ummy";
        int countIterative = 0;

        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            if (s1.substring(i, i + s2.length()).equals(s2)) {
                countIterative++;
            }
        }

        System.out.println("Iterative Count: " + countIterative);

        int countRecursive = func(s1, s2, 0);

        System.out.println("Recursive Count: " + countRecursive);
    }
}