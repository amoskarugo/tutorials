package OOP.Abstraction.interfaces;

public class NiceCar {

    private final Engine engine;
    private final MediaPlayer mediaPlayer;
    public NiceCar()
    {
        engine = new ElectricEngine();
        mediaPlayer = new MediaPlayer();
    }
    public NiceCar (Engine engine, MediaPlayer mediaPlayer){
        this.engine = engine;
        this.mediaPlayer = mediaPlayer;

    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }


    public void playMusic(){
        mediaPlayer.start();
    }
}
