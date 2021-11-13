package factory;

public class PainterFactory implements WorkerFactory{
    @Override
    public Worker createWorker() {
        return new Painter();
    }
}
