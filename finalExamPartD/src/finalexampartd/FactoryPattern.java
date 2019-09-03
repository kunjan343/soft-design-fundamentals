package finalexampartd;

public class FactoryPattern {

    public FitnessTracker fitnessTracker() {
        return new FitnessTracker();
    }

    public Pedometer pedometer() {
        return new Pedometer();
    }

    public HeartRateMonitor monitor() {
        return new HeartRateMonitor();
    }
}
