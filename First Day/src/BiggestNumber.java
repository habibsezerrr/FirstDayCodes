import java.util.Scanner;

public class BiggestNumber {

    // 3 sayıdan büyük olanı bulmak
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("First Number: ");
        int number1 = s.nextInt();
        System.out.print("Second Number: ");
        int number2 = s.nextInt();
        System.out.print("Third Number: ");
        int number3 = s.nextInt();

        int max = number1;

        if (max < number2) {
            max = number2;
        }

        if (max < number3) {
            max = number3;
        }
        System.out.println("Biggest number: " + max);
    }
}
