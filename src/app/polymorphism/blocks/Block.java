package app.polymorphism.blocks;

import app.polymorphism.participants.Participant;

public class Block {

    private int length;
    private int height;

    public Block(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }


    public int getHeight() {
        return height;
    }


    public void overcome() {

        System.out.println("through the " + getClass().getSimpleName());
    }

    public void passBlock(Participant participant) {

            System.out.println("Participant is passing the block");
        }

    }



