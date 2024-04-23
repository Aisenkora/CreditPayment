public class CreditPaymentService {
    public int calculate(double percent, int amount, int months) {
        double y = percent / 12 / 100;
        double n = 1 + y;
        double x = Math.pow(n, months);
        double k = (y * x) / (x - 1);
        double payment = amount * k;
        return (int) payment;
    }
}
