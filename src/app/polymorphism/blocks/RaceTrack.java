package app.polymorphism.blocks;

import app.polymorphism.participants.Participant;

public class RaceTrack extends Block {

    public RaceTrack(int length){
        super(length, 0);
    }

    @Override
    public void overcome() {
       super.overcome();
    }

    @Override
    public void passBlock(Participant participant) {
        participant.run();
        overcome();
    }
}
