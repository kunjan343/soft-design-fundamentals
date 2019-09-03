/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexampartc;

/**
 * The program below uses utility methods to determine whether
 * a candidate will be selected for an interview.
 * This is used as the basis for the final exam question C
 * @author dancye, 2019
 */
public class InterviewSelector {

    /**
     * A method that returns whether or not a candidate for
     * a job will be given an interview.
     * @param yearsExperience - how many years work experience
     * @param transcriptAverage - their average from their college transcript
     * @return true if their experience + average >80, false otherwise
     */
    public static boolean getsAnInterview(int yearsExperience, double transcriptAverage)
    {
        boolean interview = false;
        if((yearsExperience + transcriptAverage)>80)
        {
            interview = true;
        }
        return interview;
    }
    
}
