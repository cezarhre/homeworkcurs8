package ro.fasttrackit.curs8.homework.interfaces.senders;

import ro.fasttrackit.curs8.homework.interfaces.AdvertiseSender;

public class EmailSender implements AdvertiseSender {
    public void send(String adv){
        System.out.println("Advertise by Email "+adv);
    }

}
