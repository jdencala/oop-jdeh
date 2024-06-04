package figures;

public class Square {
    private int length;

    public Square() {}

    public Square(int length) {
        this.length = length;
    }

    public void printSquare() {
        System.out.println("----------------- Printing Square (" +  length  +")----------------");
        System.out.println(" ");
        for(int h = 0; h < length; h++) {
            for(int w = 0; w < length; w++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    public void printPerimeter() {
        double perimeter = length * 4;
        System.out.println("Square Perimeter: " + perimeter + " [cm]");
    }

    public int getLength() {
        return  length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
