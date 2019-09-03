package hockeyregistrar;

import org.junit.Assert;
import org.junit.Test;

public class HockeyRegistrarValidatorTest {
    private HockeyRegistrarValidator HRV = new HockeyRegistrarValidator();

    @Test
    public void checkValidateBirthYearSuccess() {
        System.out.println("checkValidateBirthYearSuccess");
        int pass = 2012;
        boolean expResult = true;
        boolean result = HRV.validateBirthYear(pass);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void checkValidateBirthYearFail() {
        System.out.println("checkValidateBirthYearFail");
        int pass = 2005;
        boolean expResult = false;
        boolean result = HRV.validateBirthYear(pass);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void checkValidateBirthYearBoundary() {
        System.out.println("checkValidateBirthYearBoundary");
        int pass = 2009;
        boolean expResult = true;
        boolean result = HRV.validateBirthYear(pass);
        Assert.assertEquals(expResult, result);
    }
}
