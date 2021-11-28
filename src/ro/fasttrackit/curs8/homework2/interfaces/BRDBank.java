package ro.fasttrackit.curs8.homework2.interfaces;

public class BRDBank implements BankServices{
    private final int deposit;

    public BRDBank(int deposit) {
        this.deposit = Math.abs(deposit);
    }

    public String creditOffer() {
        return "The BRD BANK credit offer is " + deposit;
    }

    public int withdrawService(int withdraw) {
        if (withdraw <= deposit) {
            return deposit - withdraw;
        } else {
            return deposit;
        }
    }
}
