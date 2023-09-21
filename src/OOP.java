public class OOP {

        String name;
        Double price;
        String desc;

    }
      class shop{
          public static void main(String[] args) {
              OOP firstClass=new OOP();
              firstClass.name="Twix";
              firstClass.price=2.5;
              firstClass.desc="Chocolate";
              System.out.println(firstClass.name + " " + firstClass.price+ " " + firstClass.desc);
          }

}
