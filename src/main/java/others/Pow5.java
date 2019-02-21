package others;

/**
 * 幂函数
 */
public class Pow5 {

    public static void main(String[] args) {
        double x = 2;
        double n = 10;
        System.out.println(Math.pow(x, n));
        System.out.println(pow(x, n));
    }

    /**
     * 递归。
     * 指数为奇数，拆分为偶数（指数减一）幂乘以一个底数的形式，变为偶数幂递归；
     * 指数为偶数，拆分为底数两两相乘，指数减半的形式递归，直到指数为一，即为终值。
     *
     * @param x 底数
     * @param n 指数
     * @return
     */
    private static double pow(double x, double n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 1 / pow(x, -n);
        if (n % 2 == 0)
            return pow(x * x, n / 2);
        return pow(x * x, (n - 1) / 2) * x;
    }

    /**
     * 非递归
     *
     * @param x 底数
     * @param n 指数
     * @return
     */
    private static double pow2(double x, double n) {

        return 0;
    }

}
