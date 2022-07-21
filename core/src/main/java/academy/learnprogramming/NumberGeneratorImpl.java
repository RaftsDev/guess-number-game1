package academy.learnprogramming;

import java.util.Random;

public class NumberGeneratorImpl implements NumberGenerator {

    //== fields ==

    private final Random random = new Random();
    private int MaxNumber = 100;

    //== public methods ==
    @Override
    public int next() {
        return random.nextInt(MaxNumber);
    }

    @Override
    public int getMaxNumber() {
        return MaxNumber;
    }
}
