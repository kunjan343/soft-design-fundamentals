/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexampartd;

/**
 * Code used for SYST17796 final exam Part D.
 * This class represents a FitnessTracker. It takes input
 * from two types of biological monitors: the heart
 * rate monitor and the pedometer (a pedometer counts how many steps you take).
 *
 * @author dancye, 2019
 */
public class FitnessTracker {
    private static FactoryPattern fc = new FactoryPattern();

    public static void main(String[] args) {
        FitnessTracker fitByte = fc.fitnessTracker();
        fitByte.run();

    }

    /**
     * A method that reports on data from
     * the heart rate monitor and
     * the odometer and prints out a
     * daily report to the user.
     */
    private void run() {
        Pedometer steps = fc.pedometer();
        String pedData = steps.reportStepsTaken();
        HeartRateMonitor heartRate = fc.monitor();
        String pulse = heartRate.reportHeartRate();
        System.out.println("Daily Report:");
        System.out.println(pedData);
        System.out.println(pulse);
    }


}
