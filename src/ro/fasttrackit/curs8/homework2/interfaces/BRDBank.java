package ro.fasttrackit.curs8.homework2.interfaces;

public class BRDBank implements BankServices{
    private int deposit;
    private int amount;

    public BRDBank(int deposit, int amount) {
        this.deposit = Math.abs(deposit);
        this.amount = Math.abs(amount);
    }

    public String creditOffer() {
        return "The BRD BANK credit offer is "+deposit;
    }

    public int withdrawService() {
        return withdrawSold();
    }

    public int withdrawSold() {
        int sold = 0;
        if (amount <= deposit) {
            return sold = deposit - amount;
        } else {
            return sold = deposit;
        }
    }
}
