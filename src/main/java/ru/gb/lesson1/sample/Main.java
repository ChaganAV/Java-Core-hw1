package ru.gb.lesson1.sample;

import ru.gb.lesson1.regular.Decorator;
import ru.gb.lesson1.regular.MathClass;

public class Main {
    /**
     * Точка вхождения в программу
     * javac -sourcepath ./java -d out java/ru/gb/lesson1/sample/Main.java
     * java -classpath ./out ru.gb.lesson1.sample.Main
     * javadoc -encoding utf-8 -d docs -sourcepath ./java -cp ./out -subpackages ru
     *
     * https://www.docker.
     * @param args
     */
    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        if (args.length>0 && args.length<=2) {
            String str1 = args[0];
            String str2 = args[1];
            a = Integer.parseInt(str1);
            b = Integer.parseInt(str2);
        }
        MathClass mathClass = new MathClass();
        Decorator decorator = new Decorator();
        decorator.getDecore(mathClass.getSum(a,b));
        decorator.getDecore(mathClass.getDiff(a,b));
        decorator.getDecore(mathClass.getPower(a,b));
        decorator.getDecore(mathClass.getDiv(a,b));
    }
}
