class PerformanceEvaluvator {

    static void f1() {
        for (int i = 0; i < 25; i++) {
            System.out.println("2000000");
        }
    }

    static void f2() {
        System.out.println("2000000");
        System.out.println("2000000");
        System.out.println("2000000");
        System.out.println("2000000");
        System.out.println("2000000");
        System.out.println("2000000");
        System.out.println("2000000");
        System.out.println("2000000");
        System.out.println("2000000");
        System.out.println("2000000");

        System.out.println("2000000");
        System.out.println("2000000");
        System.out.println("2000000");
        System.out.println("2000000");
        System.out.println("2000000");
        System.out.println("2000000");
        System.out.println("2000000");
        System.out.println("2000000");
        System.out.println("2000000");
        System.out.println("2000000");

        System.out.println("2000000");
        System.out.println("2000000");
        System.out.println("2000000");
        System.out.println("2000000");
        System.out.println("2000000");
    }

    public static void main(String args[]) {

        long f1_avg, f2_avg;
        long f1_tt = 0, f2_tt = 0;
        long st, et;
        int no_of_times = 40;

        
        for (int i = 0; i < no_of_times; i++) {
            st = System.currentTimeMillis();   
            f1();
            et = System.currentTimeMillis();   
            f1_tt += (et - st);
        }

        f1_avg = f1_tt / no_of_times;   

        
        for (int i = 0; i < no_of_times; i++) {
            st = System.currentTimeMillis();
            f2();
            et = System.currentTimeMillis();
            f2_tt += (et - st);
        }

        f2_avg = f2_tt / no_of_times;

        System.out.println("Overall Time taken by f1: " + f1_tt);
        System.out.println("Avg Time taken by f1: " + f1_avg);

        System.out.println("Overall Time taken by f2: " + f2_tt);
        System.out.println("Avg Time taken by f2: " + f2_avg);
    }
}