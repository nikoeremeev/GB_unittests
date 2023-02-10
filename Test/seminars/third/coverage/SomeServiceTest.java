package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SomeServiceTest {
    private SomeService someService;

    @BeforeEach
    void setUp() {
        someService = new SomeService();
    }

    //    /**
//     * 3.1. Метод возвращает Fizz для чисел кратных 3, Buzz для кратных 5, и FizzBuzz для кратных 3 и 5 одновременно
//     */
//    @Test
//    void fizzTest() {
//        assertThat(someService.fizzBuzz(3)).isEqualTo("Fizz");
//    }
//    @Test
//    void buzzTest() {
//        assertThat(someService.fizzBuzz(5)).isEqualTo("Buzz");
//    }
//    @Test
//    void fizzbuzzTest() {
//        assertThat(someService.fizzBuzz(15)).isEqualTo("FizzBuzz");
//    }
//    @Test
//    void NotfizzbuzzTest() {
//        assertThat(someService.fizzBuzz(2)).isEqualTo("2");
//    }
//    //    /**
////     * 3.2. Метод возвращает true для массивов, которые начинаются или заканчиваются 6, и false - если 6 нет ни в начале ни в конце массива
////     */
//    @Test
//    void firstElement6() {
//        assertTrue(someService.firstLast6(new int[]{6,2,3}));
//    }
//    @Test
//    void lastElement6() {
//        assertTrue(someService.firstLast6(new int[]{1,6,6}));
//    }
//
//    @Test
//    void Element() {
//        assertFalse(someService.firstLast6(new int[]{1,6,3}));
//    }

    //    /**
//     * 3.3. Метод подсчета скидки
//     */

    //    @Test
//    void insufficientCoverageTest() {
//
//        System.out.println(someService.calculatingDiscount(2000.0, 10));
//        assertThat(someService.calculatingDiscount(2000.0, 50))
//                .isEqualTo(1000); // обычная скидка
//        assertThat(someService.calculatingDiscount(2000.0, 100))
//                .isEqualTo(0); // обычная скидка
//        assertThat(someService.calculatingDiscount(2000.0, 0))
//                .isEqualTo(2000); // обычная скидка
//
//
//        assertThatThrownBy(() ->
//                someService.calculatingDiscount(2000.0, 110))
//                .isInstanceOf(ArithmeticException.class)
//                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки больше 100%
//
//        assertThatThrownBy(() ->
//                someService.calculatingDiscount(2000.0, -10))
//                .isInstanceOf(ArithmeticException.class)
//                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки меньше 0
//
//        assertThatThrownBy(() ->
//                someService.calculatingDiscount(-100, 10))
//                .isInstanceOf(ArithmeticException.class)//сумма покупки меньше 0
//                .hasMessage("Сумма покупки не может быть отрицательной");
//
//    }
//    @Test
//    void DiscountAmount(){
//        assertThat(someService.calculatingDiscount(2000.0, 10)).isEqualTo(1800); // обычная скидка
//    }
//    @Test
//    void ExcessDiscount(){
//        assertThatThrownBy(() ->
//                someService.calculatingDiscount(2000.0, 110))
//                .isInstanceOf(ArithmeticException.class)
//                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки больше 100%
//    }
//
//    @Test
//    void NegativeDiscount(){
//        assertThatThrownBy(() ->
//                someService.calculatingDiscount(2000.0, -10))
//                .isInstanceOf(ArithmeticException.class)
//                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки меньше 0
//    }
//
//    @Test
//    void NegativePurchase(){
//        assertThatThrownBy(() ->
//                someService.calculatingDiscount(-100, 10))
//                .isInstanceOf(ArithmeticException.class)//сумма покупки меньше 0
//                .hasMessage("Сумма покупки не может быть отрицательной");
//    }

    /**
     //     * 3.4. Метод принимает на вход 3 числа (int a, b, c). Нужно вернуть их сумму. Однако, если одно из значений равно 13,
     //     * то оно не учитывается в сумме. Так, например, если b равно 13, то считается сумма только a и c.
     //     */
//    @Test
//    void luckySumA13() {
//        assertThat(someService.luckySum(13,2,3)).isEqualTo(5) ;
//    }
//    @Test
//    void luckySumB13() {
//        assertThat(someService.luckySum(1,13,3)).isEqualTo(4) ;
//    }
//    @Test
//    void luckySumC13() {
//        assertThat(someService.luckySum(1,2,13)).isEqualTo(3) ;
//    }
//    @Test
//    void luckySumNo13() {
//        assertThat(someService.luckySum(1,2,3)).isEqualTo(6) ;
//    }

    /**
    //Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false) */
    @Test
    void IsEven(){
        assertTrue(someService.evenOddNumber(4));
    }
    @Test
    void IsOdd(){
        assertFalse(someService.evenOddNumber(5));
    }
    /**
    //метод который проверяет, попадает ли переданное число в интервал (25;100) возвращает true,
    //если попадает и false - если нет */

    @Test
    void NumberIn(){
        assertTrue(someService.numberInInterval(46));
    }
    @Test
    void NumberOut(){
        assertFalse(someService.numberInInterval(103));
    }
}