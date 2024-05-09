package ch02.sec12;

public class PrintExample {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("%d\n", value);
        System.out.printf("%6d\n", value);
        System.out.printf("%-6d\n", value);
        System.out.printf("%06d\n", value);
    }
}
