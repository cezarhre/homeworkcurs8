package ro.fasttrackit.curs8.homework.interfaces;

import ro.fasttrackit.curs8.homework.interfaces.senders.EmailSender;
import ro.fasttrackit.curs8.homework.interfaces.senders.FacebookSender;
import ro.fasttrackit.curs8.homework.interfaces.senders.PrintSender;

public class MainSender {
    public static void main(String[] args) {
        AdvertiseSender facebookSender = new FacebookSender();
        Advertise advertise = new Advertise(facebookSender);
        advertise.sendAdvertise("JAVA UTILITIES");

        AdvertiseSender emailSender = new EmailSender();
        Advertise advertise1 = new Advertise(emailSender);
        advertise1.sendAdvertise("JAVA APPLICABILITIES");

        AdvertiseSender printSender = new PrintSender();
        Advertise advertise3 = new Advertise(printSender);
        advertise3.sendAdvertise("JAVA IS INTERESTING");

    }
}
