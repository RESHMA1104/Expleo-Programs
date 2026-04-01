package javaCore;
abstract class BankTransactionException extends Exception {
    private int errorCode;
    public BankTransactionException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    public int getErrorCode() {
        return errorCode;
    }
}
class InsufficientFundsException extends BankTransactionException {
    private double shortfall;
    public InsufficientFundsException(double shortfall) {
        super("Shortfall: " + shortfall, 1002);
        this.shortfall = shortfall;
    }
    public double getShortfall() {
        return shortfall;
    }
}
class InvalidAccountException extends BankTransactionException {
    private String accountId;
    public InvalidAccountException(String accountId) {
        super("Account ID cannot be empty", 1001);
        this.accountId = accountId;
    }
    public String getAccountId() {
        return accountId;
    }
}
class TransactionLimitException extends BankTransactionException {
    private double limit;
    public TransactionLimitException(double limit) {
        super("Limit: " + limit, 1003);
        this.limit = limit;
    }
    public double getLimit() {
        return limit;
    }
}
class TransactionValidator {
    public static void validateTransaction(String accountId, double balance,double amount, double dailyLimit) throws BankTransactionException {
        if (accountId == null || accountId.isEmpty()) {
            throw new InvalidAccountException(accountId);
        }
        if (amount > balance) {
            double shortfall = amount - balance;
            throw new InsufficientFundsException(shortfall);
        }
        if (amount > dailyLimit) {
            throw new TransactionLimitException(dailyLimit);
        }
        System.out.println("Transaction Valid!");
    }
}
public class Question3 {
    public static void main(String[] args) throws BankTransactionException {
        try {
            TransactionValidator.validateTransaction("", 1000, 500, 2000);
        } catch (InvalidAccountException e) {
            System.out.println("InvalidAccountException: " + e.getMessage()
                    + " [Code: " + e.getErrorCode() + "]");
        } catch (InsufficientFundsException e) {
            System.out.println("InsufficientFundsException: " + e.getMessage()
                    + " [Code: " + e.getErrorCode() + "]");
        } catch (TransactionLimitException e) {
            System.out.println("TransactionLimitException: " + e.getMessage()
                    + " [Code: " + e.getErrorCode() + "]");
        } finally {
            System.out.println("Validation complete.\n");
        }
        try {
            TransactionValidator.validateTransaction("ACC001", 200, 500, 2000);
        } catch (InvalidAccountException e) {
            System.out.println("InvalidAccountException: " + e.getMessage()
                    + " [Code: " + e.getErrorCode() + "]");
        } catch (InsufficientFundsException e) {
            System.out.println("InsufficientFundsException: " + e.getMessage()
                    + " [Code: " + e.getErrorCode() + "]");
        } catch (TransactionLimitException e) {
            System.out.println("TransactionLimitException: " + e.getMessage()
                    + " [Code: " + e.getErrorCode() + "]");
        } finally {
            System.out.println("Validation complete.\n");
        }
        try {
            TransactionValidator.validateTransaction("ACC002", 5000, 3000, 2000);
        } catch (InvalidAccountException e) {
            System.out.println("InvalidAccountException: " + e.getMessage()
                    + " [Code: " + e.getErrorCode() + "]");
        } catch (InsufficientFundsException e) {
            System.out.println("InsufficientFundsException: " + e.getMessage()
                    + " [Code: " + e.getErrorCode() + "]");
        } catch (TransactionLimitException e) {
            System.out.println("TransactionLimitException: " + e.getMessage()
                    + " [Code: " + e.getErrorCode() + "]");
        } finally {
            System.out.println("Validation complete.\n");
        }
    }
}