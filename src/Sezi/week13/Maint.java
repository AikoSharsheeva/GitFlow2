package Sezi.week13;


import java.util.ArrayList;
import java.util.List;

class GameStore{

    double calculateTotalPrice(Game[] listGame){
        double totalPrice = 0.0;
        for(Game game : listGame){
            totalPrice += game.getPrice();
        }
        return totalPrice;
    }
}

class Game{

    String title;
    double price;

    public Game(String title, double price) {
        this.title = title;
        this.price = price;
    }

    String getTitle(){
        return title;
    }
    double getPrice(){
        return price;
    }

}

class ActionGame extends Game{

    public ActionGame(String title, double price) {
        super(title, price);
    }
}


class PuzzleGame extends Game{

    public PuzzleGame(String title, double price) {
        super(title, price);
    }


}