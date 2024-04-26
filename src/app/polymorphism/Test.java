package app.polymorphism;

import app.polymorphism.blocks.*;
import app.polymorphism.participants.*;

public class Test {

    public static void main(String[] args) {


        Participant[] participants = {
                new Human("Tom"),
                new Human("Paul"),
                new Cat("Garfild"),
                new Cat("Oggy"),
                new Robot("Verter"),
                new Robot("XYZ2")

        };

        Block[] blocks = {
                new Wall(2),
                new RaceTrack(400),
                new RaceTrack(560),
                new Wall(1),
                new Wall(5),
                new RaceTrack(39800)
        };

      Participant.overcomeBlock(participants, blocks);
    }
}
