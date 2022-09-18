public class AmicableNumbers {

    public static void main(String[] args) {

        // 220: 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
        // 284: 1 + 2 + 4 + 71 + 142 = 220

        int number1 = 17296;
        int number2 = 18416;
        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                total1 += i;
            }
        }
        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                total2 += i;
            }
        }
        if (number1 == total2 && number2 == total1) {
            System.out.println(number1 + " and " + number2 + " are amicable numbers");
        }
        else {
            System.out.println(number1 + " and " + number2 + " are not amicable numbers");
        }
    }
}
