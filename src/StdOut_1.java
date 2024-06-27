import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StdOut_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int int3 = scanner.nextInt();
        scanner.close();

        System.out.println(int1);
        System.out.println(int2);
        System.out.println(int3);
    }
}