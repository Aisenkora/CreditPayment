public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double percent =9.99; //процентная ставка по кредиту (%)
        int amount = 1_000_000; //сумма кредита (руб.)
        int months = 36; //срок кредита (мес.)

        double payment = service.calculate(percent, amount, months);
        System.out.println(payment);
    }
}



