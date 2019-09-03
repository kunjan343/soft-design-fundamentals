/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MidtermExamPartC;

import java.util.Scanner;

/**
 * @author Kunjan Patel
 */
public class AccountTester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account = new Account();

        System.out.println("Please enter your username:");
        String username = input.nextLine();
        account.setUserID(username);

        System.out.println("Please select your account_type:");
        for (int i = 0; i < Account.account_options.values().length; i++) {
            System.out.println((i + 1) + ") " + Account.account_options.values()[i]);
        }
        int accountType = input.nextInt();
        String type = Account.account_options.values()[accountType - 1].toString();
        account.setAccountType(type);

        System.out.println("Your account detail:");
        System.out.println(account.getAccountNum());
        System.out.println(account.getAccountType());
        System.out.println(account.getUserName());

    }
    /* Add your code here */
}
