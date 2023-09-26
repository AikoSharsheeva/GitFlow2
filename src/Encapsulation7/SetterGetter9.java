package Encapsulation7;

public class SetterGetter9 {
    public static void main(String[] args) {
        Pharmacy tab=new Pharmacy("vitamin a", "ketonal", "chamomile");
        System.out.println("tab.getVitamin() = " + tab.getVitamin());
        tab.setVitamin("vitamin C");
        System.out.println("tab.getVitamin() = " + tab.getVitamin());

        System.out.println("tab.getPainkiller() = " + tab.getPainkiller());
        tab.setPainkiller("painKiller");
        System.out.println("tab.getPainkiller() = " + tab.getPainkiller());

        System.out.println("tab.getHerb() = " + tab.getHerb());
        tab.setHerb("tea hearb");
        System.out.println("tab.getHerb() = " + tab.getHerb());
    }


}
class Pharmacy{
    private String vitamin;
    private String painkiller;
    private String herb;



    public Pharmacy(String vitamin, String painkiller, String herb) {
        this.vitamin = vitamin;
        this.painkiller = painkiller;
        this.herb = herb;

    }

    public String getVitamin(){
        return vitamin;
    }
    public void setVitamin(String vitamin){
        this.vitamin=vitamin;
    }
    public String getPainkiller(){
        return painkiller;
    }
    public void setPainkiller(String painkiller){
        this.painkiller=painkiller;
    }
    public String getHerb(){
        return herb;
    }
    public void setHerb(String herb){
        this.herb=herb;
    }


}
