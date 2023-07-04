package main.java.homework.homework2;

public abstract class LiveBeing implements Action{
    @Override
    public abstract void run();
    @Override
    public abstract void jump();
    @Override
    public abstract void stop();
    @Override
    public abstract int getHeight();
    @Override
    public abstract int getRun();
    public abstract String getName();
}
