import java.util.*;

public class UniquePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = sc.nextInt();

        // Get all substrings of length l
        List<String> substrings = contiguous_Substring(s, l);

        // To store unique primes
        Set<Integer> uniquePrimes = new HashSet<>();

        for (String sub : substrings) {
            // Generate all permutations of the substring
            Set<String> perms = new HashSet<>();
            permute("", sub, perms);

            // Check each permutation
            for (String p : perms) {
                int num = Integer.parseInt(p);
                if (isPrime(num)) {
                    uniquePrimes.add(num);
                }
            }
        }

        // Print result in your required format
        System.out.println("Unique Prime Numbers: " + uniquePrimes);
        System.out.println("Count: " + uniquePrimes.size());
    }

    // Generate substrings of fixed length l
    public static List<String> contiguous_Substring(String str, int l) {
        List<String> list = new ArrayList<>();
        if (l <= 0 || l > str.length()) {
            System.out.println("Invalid substring length");
            return list;
        }

        for (int i = 0; i <= str.length() - l; i++) {
            list.add(str.substring(i, i + l));
        }
        return list;
    }

    // Permutation generator
    public static void permute(String prefix, String remaining, Set<String> result) {
        if (remaining.length() == 0) {
            // Avoid numbers with leading zeros
            if (!prefix.startsWith("0")) {
                result.add(prefix);
            }
            return;
        }
        for (int i = 0; i < remaining.length(); i++) {
            permute(prefix + remaining.charAt(i),
                    remaining.substring(0, i) + remaining.substring(i + 1),
                    result);
        }
    }

    // Check prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
