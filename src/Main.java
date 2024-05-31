public class Main {
    public static void main(String[] args) {
        //Examples for printLine method
        printLine(5);
        printLine(10);
        //Examples for pintSquare method
        printSquare(6);
        printSquare(4);
    }
    public static void printLine(int n){
        System.out.println("----------------- Printing Line (" +  n  +")----------------");
        System.out.println(" ");
        for(int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println(" ");
    }

    public static void printSquare(int n) {
        System.out.println("----------------- Printing Square (" +  n  +")----------------");
        System.out.println(" ");
        for(int h = 0; h < n; h++) {
            for(int w = 0; w < n; w++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
