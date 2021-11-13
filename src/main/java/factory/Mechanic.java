package factory;

public class Mechanic implements Worker{
    @Override
    public void doWork() {
        System.out.println("Механик собирает автомобиль");
    }
}
