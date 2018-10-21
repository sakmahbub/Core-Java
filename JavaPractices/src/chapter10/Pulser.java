package chapter10;

public class Pulser extends Bike {

   

    public void pulsarStartDemo() {
        Engine pulsarEngine = new Engine();

        pulsarEngine.start();
        pulsarEngine.stop();
    }

}
