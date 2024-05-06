import java.util.Scanner;

public class AtividadeModulo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int num = scanner.nextInt();
        scanner.close();

        Integer numWrapper = Integer.valueOf(num);
        System.out.println("Integer value: " + num);
        System.out.println("Integer Wrapper value: " + numWrapper);
    }
}
