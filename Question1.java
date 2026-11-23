(a)
public static int max(int a, int b, int c) {
    return Math.max(a, Math.max(b, c));
}

(b)
public static boolean isSquare(int n) {
    if (n < 0) {
        return false;
    }

    int root = (int) Math.sqrt(n);
    return root * root == n;
}

(c)
public static long combination(int n, int k) {
    if (n < 0 || k < 0 || k > n) {
        return 0;
    }

    k = Math.min(k, n - k);
    long result = 1;

    for (int i = 1; i <= k; i++) {
        result = result * (n - i + 1) / i;
    }

    return result;
}

(d)
public static boolean isPentagonal(int n) {
    if (n <= 0) {
        return false;
    }

    for (int i = 1; i <= n; i++) {
        long p = (long) i * (3 * i - 1) / 2;

        if (p == n) {
            return true;
        }

        if (p > n) {
            break;
        }
    }

    return false;
}

(e)
public static void countLettersDigits(String str) {
    int letters = 0;
    int digits = 0;

    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);

        if (Character.isLetter(c)) {
            letters++;
        } else if (Character.isDigit(c)) {
            digits++;
        }
    }

    System.out.println("Letters: " + letters);
    System.out.println("Digits: " + digits);
}

(f)
public static void generateRandom(int[] numbers) {
    for (int i = 0; i < 10; i++) {
        numbers[i] = (int) (Math.random() * 101);
    }
}

(g)
public static void circle(double radius, double[] result) {
    result[0] = Math.PI * radius * radius;
    result[1] = 2 * Math.PI * radius;
}

(h)
public static int firstRepeated() {
    boolean[] appeared = new boolean[11];

    while (true) {
        int n = (int) (Math.random() * 11);

        if (appeared[n]) {
            return n;
        }

        appeared[n] = true;
    }
}
