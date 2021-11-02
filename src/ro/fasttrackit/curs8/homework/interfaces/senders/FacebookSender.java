package ro.fasttrackit.curs8.homework.interfaces.senders;

import ro.fasttrackit.curs8.homework.interfaces.AdvertiseSender;

public class FacebookSender implements AdvertiseSender {
    public void send(String adv){
        System.out.println("Advertise on Facebook " + adv);
    }


}
