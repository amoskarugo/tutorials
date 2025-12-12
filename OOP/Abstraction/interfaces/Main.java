package OOP.Abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        Engine powerEngine = new PowerEngine();
        Engine electricEngine = new ElectricEngine();


//        car.acc();
//        car.stop();
//        car.start();

//        Media media  = new Car();
//
//        media.start();

        NiceCar niceCar = new NiceCar(electricEngine, mediaPlayer);



        niceCar.start();
        niceCar.stop();
        niceCar.playMusic();

    }
}
