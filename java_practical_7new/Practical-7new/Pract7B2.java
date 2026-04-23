class Pract7 {


    static int icount(String s1, String s2) {

        int count = 0;
        int index = 0;

        while ((index = s1.indexOf(s2, index)) != -1) {
            count++;
            index++;   // overlapping count
        }

        return count;
    }

    
    static int rcount(String s1, String s2, int index) {

        index = s1.indexOf(s2, index);

        if (index == -1)
            return 0;

        return 1 + rcount(s1, s2, index + 1);
    }

    public static void main(String[] args) {

        String s1 = "yashuyashuyashu";
        String s2 = "yashu";

        int result1 = icount(s1, s2);
        int result2 = rcount(s1, s2, 0);

        System.out.println("Iteration Count: " + result1);
        System.out.println("Recursion Count: " + result2);
    }
}