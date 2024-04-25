public class CreditPaymentService {
    public int calculate(double percent, int amount, int months) {
        double monthPercent = percent / 12 / 100;
        double n = 1 + monthPercent;
        double x = Math.pow(n, months);
        double coefficient = (monthPercent * x) / (x - 1);
        double payment = amount * coefficient;
        return (int) payment;
    }
}
