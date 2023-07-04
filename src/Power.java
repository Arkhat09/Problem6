public class Power {

    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * power(a, n - 1);
        }
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 10;

        int powerOfA = power(a, n);

        System.out.println(a + "^" + n + " = " + powerOfA);
    }
}
