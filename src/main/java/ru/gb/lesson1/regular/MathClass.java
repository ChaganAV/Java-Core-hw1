package ru.gb.lesson1.regular;

/**
 * Математический класс
 */
public class MathClass {
    /**
     * Метод вычисления суммы двух целых чисел
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return возвращает целое число
     */
    public int getSum(int a, int b){
        return a + b;
    }

    /**
     * Метод вычисления разности двух целых чисел
     * @param a первое целое число
     * @param b второе целое число
     * @return возвращает разницу двух чисел в виде целого числа
     */
    public int getDiff(int a, int b){
        return a - b;
    }

    /**
     * Метод вычисления произведения двух целых чисел
     * @param a первый множитель
     * @param b второй множитель
     * @return возвращает целое число
     */
    public int getPower(int a, int b){
        return a * b;
    }

    /**
     * Метод вычисления деления от двух целых чисел
     * @param a делимое
     * @param b делитель
     * @return возвращает результат в виде целого числа
     */
    public int getDiv(int a, int b){
        return a/b;
    }
}
