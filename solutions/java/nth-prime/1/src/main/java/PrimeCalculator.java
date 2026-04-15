import java.util.ArrayList;

class PrimeCalculator {

    public int nth(int nth) throws IllegalArgumentException {
        if (nth <= 0) {
            throw new IllegalArgumentException("int must be greater than 0");
        }

        ArrayList<Integer> primes = new ArrayList<>();
        boolean prime = false;

        for (int i = 2; primes.size() < nth ; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        return primes.get(nth - 1);
    }

    private boolean isPrime(int n) {
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

}
