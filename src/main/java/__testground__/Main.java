package __testground__;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        var ans = isPrime(451321363);
//        var ans = findDivisors(60);
//        var ans = primeFactors(60);
//
//        for (var entry : ans.entrySet()) {
//            System.out.println(entry.getKey() + "^" + entry.getValue());
//        }
        var ans = gcd(868732, 224555);
        System.out.println(ans);

    }

    static boolean isPrime(long n) {
        if (n <= 1) return false;
        for (long i = 2; i * i <= n; ++i) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static ArrayList<Long> findDivisors(long n) {
        var divisors = new ArrayList<Long>();
        for (long i = 1; i * i <= n; ++i) {
            if (n % i == 0) {
                divisors.add(i);
                // only makes sense to add the other pair if it is not equal.
                if (i != n / i) divisors.add(n / i);
            }
        }

        // Optional: sorts the list
        Collections.sort(divisors);
        return divisors;
    }

    static HashMap<Long, Long> primeFactors(long n) {
        var primeFactorCount = new HashMap<Long, Long>();
        for (long i = 2; i * i <= n; ++i) {
            while (n % i == 0) {
                primeFactorCount.put(i, primeFactorCount.getOrDefault(i, 0L) + 1);
                n /= i;
            }
        }

        if (n > 1) {
            primeFactorCount.put(n, primeFactorCount.getOrDefault(n, 0L) + 1);
        }
        return primeFactorCount;
    }

    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
