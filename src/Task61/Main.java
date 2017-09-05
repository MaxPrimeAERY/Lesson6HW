package Task61;

/**
 * Created by Maximus on 05.09.2017.
 */
public class Main {
    public static void main(String[] args) {
        int number = 100;

        for (int i = 1; i <=number ; i++) {
            Thread thread = new Thread(new FactorialThread100(number));
            thread.start();
        }

    }
}
