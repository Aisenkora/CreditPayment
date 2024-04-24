public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double percent = 9.99; //процентная ставка по кредиту (%)
        int amount = 1_000_000; //сумма кредита (руб.)
        int months = 12; //срок кредита (мес.)

        System.out.println(service.calculate(percent, amount, months));
        System.out.println(service.calculate(9.99, 1000000, 24));
        System.out.println(service.calculate(9.99, 1000000, 36));
    }
}



