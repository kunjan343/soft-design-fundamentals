/*
 * Copyright (c) 2019. Kunjan Patel/991535676
 */

package passwordValidator;

import org.junit.Assert;
import org.junit.Test;

public class PasswordValidatorTest {
    private PasswordValidator PV = new PasswordValidator();

    /**
     * check password length success
     */
    @Test
    public void checkLengthSuccess() {
        System.out.println("checkLength");
        String pass = "vrwbovrwnvorwnv";
        boolean expResult = true;
        boolean result = PV.checkLength(pass);
        Assert.assertEquals(expResult, result);
    }

    /**
     * Check password length fail
     */
    @Test
    public void checkLengthFail() {
        System.out.println("checkLengthFail");
        String pass = "vrwb";
        boolean expResult = false;
        boolean result = PV.checkLength(pass);
        Assert.assertEquals(expResult, result);
    }

    /**
     * Check password length boundary
     */
    @Test
    public void checkLengthBoundary() {
        System.out.println("checkLengthBoundary");
        String pass = "bdtekhge";
        boolean expResult = true;
        boolean result = PV.checkLength(pass);
        Assert.assertEquals(expResult, result);
    }

    /**
     * Check password contains uppercase success
     */
    @Test
    public void checkUpperCaseSuccess() {
        System.out.println("checkUpperCaseSuccess");
        String pass = "bdtFTHge";
        boolean expResult = true;
        boolean result = PV.checkUpperCase(pass);
        Assert.assertEquals(expResult, result);
    }

    /**
     * Check password contains uppercase fail
     */
    @Test
    public void checkUpperCaseFail() {
        System.out.println("checkUpperCaseFail");
        String pass = "bdtekhge";
        boolean expResult = false;
        boolean result = PV.checkUpperCase(pass);
        Assert.assertEquals(expResult, result);
    }

    /**
     * Check password contains uppercase boundary
     */
    @Test
    public void checkUpperCaseBoundary() {
        System.out.println("checkUpperCaseBoundary");
        String pass = "bdtekHge";
        boolean expResult = true;
        boolean result = PV.checkUpperCase(pass);
        Assert.assertEquals(expResult, result);
    }

    /**
     * Check password contains special character success
     */
    @Test
    public void checkSpecialCharSuccess() {
        System.out.println("checkSpecialCharSuccess");
        String pass = "bdt@k%ge";
        boolean expResult = true;
        boolean result = PV.checkSpecialChar(pass);
        Assert.assertEquals(expResult, result);
    }

    /**
     * Check password contains special character fail
     */
    @Test
    public void checkSpecialCharFail() {
        System.out.println("checkSpecialCharFail");
        String pass = "bdtgk2ge";
        boolean expResult = false;
        boolean result = PV.checkSpecialChar(pass);
        Assert.assertEquals(expResult, result);
    }

    /**
     * Check password contains special character boundary
     */
    @Test
    public void checkSpecialCharBoundary() {
        System.out.println("checkSpec*ialCharBoundary");
        String pass = "bdtgk#ge";
        boolean expResult = true;
        boolean result = PV.checkSpecialChar(pass);
        Assert.assertEquals(expResult, result);
    }
}
