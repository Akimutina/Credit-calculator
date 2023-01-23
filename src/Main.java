public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000; //сумма кредита
        int time1 = 12;
        int time2 = 24;
        int time3 = 36;
        double percent = 9.99; //процентная ставка

        double CreditPaymentService1 = service.calculate(credit,time1,percent);
        System.out.printf("Размер ежемесяцного платежа на срок 1 год:  ");
        System.out.printf("%8.0f", CreditPaymentService1);

        double CreditPaymentService2 = service.calculate(credit,time2,percent);
        System.out.printf("\nРазмер ежемесяцного платежа на срок 2 года: ");
        System.out.printf("%8.0f", CreditPaymentService2);

        double CreditPaymentService3 = service.calculate(credit,time3,percent);
        System.out.printf("\nРазмер ежемесяцного платежа на срок 3 года: ");
        System.out.printf("%8.0f", CreditPaymentService3);

    }

}