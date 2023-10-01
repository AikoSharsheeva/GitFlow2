package Sezi.week13;

public class Movements {
}

interface Movable{
    void moveForward(int distance);
    void moveBackward(int distance);
}

interface Resizable{
    void increaseSize(int factor);
    void decreaseSize(int factor);
}

class Body implements Movable, Resizable{

    int height;
    int width;

    Body(int height, int width){
        this.height = height;
        this.width = width;
    }
    // Implements the moveForward method from the Movable interface
    @Override
    public void moveForward(int distance) {
        height += distance;
    }

    // Implements the moveBackward method from the Movable interface
    @Override
    public void moveBackward(int distance) {
        height -= distance;
    }

    // Implements the increaseSize method from the Resizable interface
    @Override
    public void increaseSize(int factor) {
        height *= factor;
        width *= factor;
    }

    // Implements the decreaseSize method from the Resizable interface
    @Override
    public void decreaseSize(int factor) {
        height /= factor;
        width /= factor;
    }

    // Prints the current size of the body by displaying its height and width
    public void displaySize() {
        System.out.println("Current size: Height=" + height + ", Width=" + width);
    }

    public static void main(String[] args) {
        Body body = new Body(10, 5);
        body.displaySize(); // Current size: Height=10, Width=5

        body.moveForward(3);
        body.displaySize(); // Current size: Height=13, Width=5

        body.moveBackward(2);
        body.displaySize(); // Current size: Height=11, Width=5

        body.increaseSize(2);
        body.displaySize(); // Current size: Height=22, Width=10

        body.decreaseSize(3);
        body.displaySize(); // Current size: Height=7, Width=3
    }
}
