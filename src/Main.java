public class Main {
    public static void main(String[] args) {
        int sqrtsum = 0;
        int sumsqrt = 0;
        for (int i = 0; i < 101; i++) {
            sqrtsum = sqrtsum + (int)Math.pow(i,2);
            sumsqrt = sumsqrt+i;
        }
        sumsqrt = (int)Math.pow(sumsqrt,2);
        System.out.println(sumsqrt -sqrtsum);

    }
}