package test.java.org;

import static org.assertj.core.api.Assertions.assertThat;

public class Main {
    public static void main(String[] args) {
        assertThat(DiscountCalc.discountCalculations(50, 20)).isEqualTo(40);
        assertThat(DiscountCalc.discountCalculations(5.0, 2.0)).isEqualTo(4.9);
        assertThat(DiscountCalc.discountCalculations(0, 20)).isEqualTo(0);
        assertThat(DiscountCalc.discountCalculations(-50, 20)).isEqualTo(-40);
        assertThat(DiscountCalc.discountCalculations(50, 0)).isEqualTo(50);
        assertThat(DiscountCalc.discountCalculations(50, -50)).isEqualTo(75);
        assertThat(DiscountCalc.discountCalculations(50, 150)).isEqualTo(-25);
    }
}