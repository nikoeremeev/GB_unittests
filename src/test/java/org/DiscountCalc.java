package test.java.org;

public class DiscountCalc {
    public class discountCalc {
        }

        public static double discountCalculations(double sum, double discount) {
            if (sum <= 0.0) {
                throw new ArithmeticException("Ваша сумма меньше или равна 0. Сумма должна быть больше 0");
            } else if (discount <= 0.0) {
                throw new ArithmeticException("Скидка меньше или равна 0%. Скидка должна быть больше 0% и меньше 100%!");
            } else if (discount >= 100.0) {
                throw new ArithmeticException("Скидка больше или равна 100%. Скидка должна быть больше 0% и меньше 100%!");
            } else {
                double result = (100.0 - discount) * sum / 100.0;
                return result;
            }
        }

}
