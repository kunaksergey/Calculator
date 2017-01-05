package ua.shield.operation;

import ua.shield.Calculator;

import java.util.Scanner;

/**
 * Created by sa on 05.01.17.
 */

/**
 * Абстрактный класс операций
 */
public abstract class AbstractOperation implements IOperation{
    float prevResult; //предыдущий результат
    Scanner scanner= Calculator.getScanner();

    /**
    * @return предыдущий результат
     */
    @Override
    public float cancel() {
        return prevResult;
    }
}
