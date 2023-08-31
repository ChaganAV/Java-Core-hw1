package ru.gb.lesson1.regular;

/**
 *  Класс декорирующий вывод строковых или числовых значений
 */
public class Decorator {
    /**
     * Метод декорирует вывод строкового значения
     * @param str строковое значение
     */
    public void getDecore(String str){
        System.out.println(String.format("Here is your number ******* %d *******",str));
    }

    /**
     * Метод декорирует вывод целого числа
     * @param num целое число
     */
    public void getDecore(int num){
        System.out.println(String.format("Here is your number ******* %d *******", num));
    }
}
