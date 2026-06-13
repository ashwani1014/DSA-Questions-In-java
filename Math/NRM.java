package Math;

public class NRM {

    public static double guess(double n) {

        double guess = n;

        while (true) {

            double root = 0.5 * (guess + (n / guess));

            if (Math.abs(guess * guess - n) < 1) {
                break;
            }

            guess = root;
        }

        return guess;
    }

    public static void main(String[] args) {

        double n = 40;

        double ans = guess(n);

        System.out.println("Square Root of " + n + " = " + ans);
    }
}