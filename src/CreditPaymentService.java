public class CreditPaymentService {
        public double calculate(int credit, int time, double percent) {
            double result = credit * ((percent/12/100 * (Math.pow((1 + percent/12/100), time))) / ((Math.pow((1 + percent/12/100), time)) - 1));
            return result;
        }
    }


