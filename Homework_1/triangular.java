import java.util.Scanner;

public class triangular {
    public static int ui() {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Input integer number: ");
        int x = sc.nextInt();
        sc.close();
        return x;
    }
    public static int triangular_num(int x) {
        return (x * (x + 1))/2;
    }
    public static void main(String[] args) {
        System.out.printf("Triangular number is " + triangular_num(ui()));
    }
}