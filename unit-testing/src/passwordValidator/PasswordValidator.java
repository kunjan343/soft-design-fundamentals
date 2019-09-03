/*
 * Copyright (c) 2019. Kunjan Patel/991535676
 */

package passwordValidator;

public class PasswordValidator {
    public static void main(String[] args) {

    }


    /**
     * Check whether password length is valid or not
     *
     * @param pass password string
     * @return boolean
     */
    public boolean checkLength(String pass) {
        return pass.length() >= 8;
    }

    /**
     * Check whether password contains uppercase
     *
     * @param pass password string
     * @return boolean
     */
    public boolean checkUpperCase(String pass) {
        return !pass.equals(pass.toLowerCase());
    }

    /**
     * Check whether password contains special character
     *
     * @param pass password string
     * @return boolean
     */
    public boolean checkSpecialChar(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) >= 33 && pass.charAt(i) <= 47 || pass.charAt(i) == '@') {
                return true;
            }
        }
        return false;
    }
}
