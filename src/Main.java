public class Main {
    public static void main(String[] args) {
        // Решаем пример (5 * 3 + 3) / 2
        int i = 5;
        i *= 3;
        i += 3;
        i /= 2;
        System.out.printf("(5 * 3 + 3) / 2 = %d\n", i);

        // N школьников делят K яблок поровну, неделящийся остаток остается в корзинке.
        // Сколько яблок останется в корзинке?
        int n = 3;
        int k = 14;
        System.out.printf("В корзине останется 14 %% 3 = %d яблока\n", k % n);
    }
}