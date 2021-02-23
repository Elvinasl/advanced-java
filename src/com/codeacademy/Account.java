package com.codeacademy;


import com.codeacademy.exception.AccountException;

class Account {
    private int balance = 100;

    public void withdraw(int amount) throws AccountException {
        if (balance - amount >= 0) {
            balance -= amount;
        } else {
            throw new AccountException("Klaida, neigiamas balansas!", balance);
        }
    }
}

