import java.util.Scanner;

public class Stdout_2 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        double dnum = scanner.nextDouble();
        scanner.nextLine();
        String string = scanner.nextLine();

        scanner.close();

        System.out.println("String: " + string);
        System.out.println("Double: " + dnum);
        System.out.println("Int: " + num1);
    }
}
