/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexampartd;

/**
 * A class that monitors the pulse rate
 * and reports its data over time
 * @author dancye
 */
class HeartRateMonitor 
{
    private int averagePulse;
    public HeartRateMonitor()
    {
        averagePulse=80;
    }
    
    public String reportHeartRate()
    {
        return "Average heart rate: " + averagePulse;
    }
}
