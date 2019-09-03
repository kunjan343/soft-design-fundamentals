package finalexampartc;

import org.junit.Test;

import org.junit.Assert;

public class InterviewSelectorTest {
    private InterviewSelector is = new InterviewSelector();

    @Test
    public void getsAnInterviewGood() {
        System.out.println("getsAnInterviewGood");
        int experience = 3;
        double transcript = 79;
        boolean result = is.getsAnInterview(experience, transcript);
        Assert.assertTrue(result);
    }

    @Test
    public void getsAnInterviewBad() {
        System.out.println("getsAnInterviewBad");
        int experience = 3;
        double transcript = 65;
        boolean result = is.getsAnInterview(experience, transcript);
        Assert.assertFalse(result);
    }

    @Test
    public void getsAnInterviewBoundaryGood() {
        System.out.println("getsAnInterviewBoundaryGood");
        int experience = 3;
        double transcript = 78;
        boolean result = is.getsAnInterview(experience, transcript);
        Assert.assertTrue(result);
    }

    @Test
    public void getsAnInterviewBoundaryBad() {
        System.out.println("getsAnInterviewBoundaryBad");
        int experience = 2;
        double transcript = 78;
        boolean result = is.getsAnInterview(experience, transcript);
        Assert.assertFalse(result);
    }
}
