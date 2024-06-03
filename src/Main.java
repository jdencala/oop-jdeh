import figures.Line;
import figures.Rectangle;
import figures.Square;

public class Main {
    public static void main(String[] args) {
        //Examples for printLine method
        Line line1 = new Line(5);
        line1.printLine();
        Line line2 = new Line(10);
        line2.printLine();
        //Examples for pintSquare method
        Square square1 = new Square(6);
        square1.printSquare();
        Square square2 = new Square(4);
        square2.printSquare();
        //Examples for print rectangle method
        Rectangle rectangle = new Rectangle(6, 4);
        rectangle.printRectangle();
    }
}
