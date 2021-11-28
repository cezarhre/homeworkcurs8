package ro.fasttrackit.curs8.homework2.interfaces;

public class INGBank implements BankServices {
    private final int deposit;

    public INGBank(int deposit) {
        this.deposit = Math.abs(deposit);
    }

    public String creditOffer() {
        return "The ING BANK credit offer is " + deposit;
    }

    public int withdrawService(int withdraw) {
         if (withdraw <= deposit) {
            return deposit - withdraw;
        } else {
            return deposit;
        }
    }
}

