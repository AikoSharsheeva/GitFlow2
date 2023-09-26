package Encapsulation7;

public class GetterSetter10 {
    private String fruts;
    private  double price;

    public GetterSetter10(String fruts, double price) {
        this.fruts = fruts;
        this.price = price;
    }
    public String getFruts(){
        return fruts;
    }
    public void setFruts(String fruts){
        this.fruts=fruts;
    }

    public double getPrice() {
        return price;
    }


    public void setPrice(double price){
        if (price>0) {
            this.price = price;
        }else{
            System.out.println("Error, can not be 0");
        }

    }


}

class checkingFruts{
    public static void main(String[] args) {
        GetterSetter10 obj=new GetterSetter10("Apple", 5.99);
        System.out.println("obj.getFruts() = " + obj.getFruts());

        System.out.println("obj.getPrice() = " + obj.getPrice());
        obj.setPrice(-2.99);
        System.out.println("obj.getPrice() = " + obj.getPrice());

    }
}
