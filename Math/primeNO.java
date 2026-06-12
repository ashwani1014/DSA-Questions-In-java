package Math;

public class PrimeNo {

    public static boolean Prime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int n = 9;
        System.out.println(Prime(n));
    }
}