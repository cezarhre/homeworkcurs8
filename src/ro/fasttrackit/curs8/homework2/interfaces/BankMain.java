package ro.fasttrackit.curs8.homework2.interfaces;

public class BankMain {
    public static void main(String[] args) {
        BankServices BTBank = new BTBank(1000000,10000);
        BankServices BRDBank = new BRDBank(10000,1000);
        BankServices INGBank = new INGBank(100000,100000);

        System.out.println(BRDBank.creditOffer());
        System.out.println(INGBank.creditOffer());
        System.out.println(BTBank.creditOffer());

        System.out.println("Credit sold BRD "+BRDBank.withdrawService());
        System.out.println("Credit sold BT "+BTBank.withdrawService());
        System.out.println("Credit sold ING "+INGBank.withdrawService());

    }
}
