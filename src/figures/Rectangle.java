package figures;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void printRectangle(){
        System.out.println("----------------- Printing Rectangle (" +  width + " x " + height  +")----------------");
        System.out.println(" ");
        for(int h = 0; h < height; h++) {
            for(int w = 0; w < width; w++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
