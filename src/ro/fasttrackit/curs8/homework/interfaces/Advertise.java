package ro.fasttrackit.curs8.homework.interfaces;

public class Advertise {
    private AdvertiseSender advertiseSender;

    public Advertise(AdvertiseSender advertiseSender){
        this.advertiseSender = advertiseSender;
    }

    public void sendAdvertise(String adv){
        advertiseSender.send(" J A V A "+adv);
    }
}
