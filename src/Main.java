import figures.Line;
import figures.Rectangle;
import figures.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option = 0;
        do{
            System.out.println("1. Create Line");
            System.out.println("2. Create Square");
            System.out.println("3. Create Rectangle");
            System.out.println("4. Exit");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    createLine();
                    break;
                case 2:
                    createSquare();
                    break;
                case 3:
                    createRectangle();
                    break;
                case 4:
                    System.out.println("----Exit System----");
                        break;
            }

        } while(option != 4);
    }

    public static void createRectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a width for Rectangle: ");
        int width = sc.nextInt();
        System.out.println("Please enter a height for Rectangle: ");
        int height = sc.nextInt();
        Rectangle rc = new Rectangle(width, height);
        rc.printRectangle();
    }

    public static void createSquare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a length for Square: ");
        int squareLength = sc.nextInt();
        Square sq = new Square(squareLength);
        sq.printSquare();
    }

    public static void createLine() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a length for line: ");
        int lineLength = sc.nextInt();
        Line line = new Line(lineLength);
        line.printLine();
    }
}
