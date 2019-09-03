/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * An application that allows users to enter in a friend's address
 *  and stores it in an "address book". This code needs some work!
 * Your job is to turn it into code that uses a model, a view and a controller
 * @author dancye
 */
public class AddressBook {

   public static ArrayList<String> addressBook = new ArrayList<String>();
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean keepGoing=true;
        do
        {
            System.out.println("Please enter a new address");
            String address = sc.nextLine();
            addressBook.add(address);
            System.out.println("Press 1 to enter another address or 0 to quit");
            String userAnswer = sc.nextLine();
            if(Integer.parseInt(userAnswer)!=1)
            {
                keepGoing=false;
            }
        }
        while(keepGoing);
        System.out.println("Your address book contains the following listings:");
        for(String s: addressBook)
        {
            System.out.println(s);
        }
        
    }
    
}
