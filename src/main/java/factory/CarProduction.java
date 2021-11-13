package factory;

public class CarProduction {
    public static void main(String[] args) {
        final WorkerFactory workerFactory = CarProduction.createWorker("mechanic");
        Worker worker = workerFactory.createWorker();
        worker.doWork();


    }
public static WorkerFactory createWorker(String work) {
        if (work.equalsIgnoreCase("painter")) {
            return new PainterFactory();
        } else if (work.equalsIgnoreCase("mechanic")) {
            return new MechanicFactory();
        }else {
            throw new RuntimeException();
        }
    }
}

