package OOP.Abstraction.interfaces;

public class MediaPlayer implements Media{

    @Override
    public void start() {
        System.out.println("Play Music");
    }

    @Override
    public void stop() {
        System.out.println("Stop Music");
    }
}
