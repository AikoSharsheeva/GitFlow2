package Interface28;

public class InterfaceIntro28 {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        shape.calculateArea();
    }
}

interface Shape {
    void calculateArea();
}

class Rectangle implements Shape {
    @Override
    public void calculateArea() {
        System.out.println(1 + 1);
    }
}