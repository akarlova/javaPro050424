package app.polymorphism.participants;

public class Cat extends Participant {

    private static final int MAX_RUNNING_LENGTH_METRES = 300;

    private static final int MAX_JUMPING_HEIGHT_METRES = 2;

    public Cat(String name) {
        super(name);
    }

    @Override
    public int getMaxRunningLengthMetres() {
        return MAX_RUNNING_LENGTH_METRES;
    }

    @Override
    public int getMaxJumpingHeightMetres() {
        return MAX_JUMPING_HEIGHT_METRES;
    }
    @Override
    public void run() {
        super.run();
    }

    @Override
    public void jump() {
        super.jump();
    }
}
