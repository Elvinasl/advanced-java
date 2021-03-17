package lt.codeacademy.exception;

public class AccountException extends Exception {

    private int balance = 0;

    public AccountException() {
    }
    public AccountException(String message) {
        super(message);
    }
    public AccountException(String message, int balance) {
        super(message);
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}
