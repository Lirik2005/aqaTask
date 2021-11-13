package factory;

public class MechanicFactory implements WorkerFactory{
    @Override
    public Worker createWorker() {
        return new Mechanic();
    }
}
