package ro.fasttrackit.curs8.homework2.interfaces;

public class BTBank implements BankServices {
    private final int deposit;

    public BTBank(int deposit) {
        this.deposit = Math.abs(deposit);
    }

    public String creditOffer() {
        return "The BT BANK credit offer is "+deposit;
    }

    public int withdrawService(int withdraw) {
        if (withdraw <= deposit) {
            return deposit - withdraw;
        } else {
            return deposit;
        }
    }
}