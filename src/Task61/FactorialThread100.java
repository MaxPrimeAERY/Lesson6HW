package Task61;

import java.math.BigInteger;

/**
 * Created by Maximus on 05.09.2017.
 */
public class FactorialThread100 implements Runnable {
    private int number;

    public FactorialThread100(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private BigInteger factorialCalculate(int number) {
        BigInteger factorial = new BigInteger("1");//"1" - начальное значение
        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(new BigInteger(Integer.toString(i)));
        }
        return factorial;
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();
        for (int i = 1; i < this.number; i++) {
            System.out.println(th.getName() + " " + i + "! = " + factorialCalculate(i));
        }
    }
}
