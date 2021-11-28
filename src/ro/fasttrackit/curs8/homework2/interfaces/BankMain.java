package ro.fasttrackit.curs8.homework2.interfaces;

public class BankMain {
    public static void main(String[] args) {
        BankServices btBank = new BTBank(100000);
        BankServices brdBank = new BRDBank(10000);
        BankServices ingBank = new INGBank(100000);

        Person person = new Person(ingBank);
        person.personRequest();
        Person person1 = new Person(brdBank);
        person1.personRequest();
        Person person2 = new Person(btBank);
        person2.personRequest();

        System.out.println("Credit sold BRD "+brdBank.withdrawService(1000));
        System.out.println("Credit sold BT "+btBank.withdrawService(1500));
        System.out.println("Credit sold ING "+ingBank.withdrawService(2000));

    }
}
