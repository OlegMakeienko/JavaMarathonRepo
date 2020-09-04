package day11;

public class Warehouse {
    private int balance;
    private int countOrder;


    @Override
    public String toString() {
        return "Warehouse{" +
                "balance=" + balance +
                ", countOrder=" + countOrder +
                '}';
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public int getCountOrder() {
        return countOrder;
    }
}