package app.polymorphism.participants;

import app.polymorphism.blocks.Block;
import app.polymorphism.blocks.RaceTrack;
import app.polymorphism.blocks.Wall;

public class Participant {

    private static final int MAX_RUNNING_LENGTH_METRES = 1000;

    private static final int MAX_JUMPING_HEIGHT_METRES = 1000;

    private String name;

    public Participant(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public int getMaxRunningLengthMetres() {
        return MAX_RUNNING_LENGTH_METRES;
    }

    public int getMaxJumpingHeightMetres() {
        return MAX_JUMPING_HEIGHT_METRES;
    }

    public void run() {
        System.out.print(getClass().getSimpleName() + " is running ");
    }

    public void jump() {
        System.out.print(getClass().getSimpleName() + " is jumping ");
    }

    public static void overcomeBlock(Participant[] participants, Block[] blocks) {


        for (Participant participant : participants) {

            int totalDistance = 0;

            int distance = 0;

            int healthRest = participant.getMaxRunningLengthMetres();

            for (Block block : blocks) {

                distance = block.getHeight()+block.getLength();



                if (participant.getMaxRunningLengthMetres() < block.getLength() || healthRest< block.getLength()||
                        participant.getMaxJumpingHeightMetres() < block.getHeight()) {
                    System.out.println(participant.getName() + " couldn't overcome block " +
                            block.getClass().getSimpleName() + " on the distance " + distance +
                            " metres. It has been overcome " + totalDistance + ". Rest of health: " + healthRest);
                    break;

                } else if (participant.getMaxRunningLengthMetres() > block.getLength() ||
                        participant.getMaxJumpingHeightMetres() > block.getHeight()) {
                    System.out.println(participant.getName() + " has overcome block " +
                            block.getClass().getSimpleName() + " on the distance " + distance
                            + " metres. Rest of health: " + healthRest);

                } else {
                    block.passBlock(participant);
                }

                totalDistance += block.getLength() + block.getHeight();

                healthRest = healthRest  - block.getLength();//I guess we can't run more than accumulated MAX

            }
        }
    }

}
