public class Main {
    public static void main(String[] args) {
        //Examples for printLine method
        printLine(5);
        printLine(10);
        printLine(15);
    }
    public static void printLine(int n){
        for(int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println(" ");
    }
}
