package app.polymorphism.blocks;

import app.polymorphism.participants.Participant;

public class Wall extends Block {


    public Wall(int height) {
        super(0, height);
    }

    @Override
    public void overcome() {
     super.overcome();
    }

    @Override
    public void passBlock(Participant participant) {
       participant.jump();
       overcome();
    }
}
