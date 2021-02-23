package com.codeacademy;


import com.codeacademy.exception.AccountException;

public class Main {

    public static void main(String[] args) {
        Account a = new Account();
        try {
            a.withdraw(90);
            System.out.println("Pinigai nuskaityti");
            a.withdraw(50);
            System.out.println("Pinigai nuskaityti"); // won't be reached!
        } catch (AccountException e) {
            System.out.println(e.getMessage() + " balansas: " + e.getBalance());
        }
    }
}
