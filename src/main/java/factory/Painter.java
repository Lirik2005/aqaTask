package factory;

public class Painter implements Worker{
    @Override
    public void doWork() {
        System.out.println("Маляр красит кузовные элементы");
    }
}
