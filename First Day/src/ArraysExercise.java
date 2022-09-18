public class ArraysExercise {

    public static void main(String[] args) {

        double[] mylist = {1.2, 6.3, 4.9, 5.5};
        double total = 0;
        double max = mylist [0];
        for (double number : mylist) {
            if (max < number) {
                max = number;
            }
            total += number;
        }
        System.out.println("Toplam: " + total);
        System.out.println("En büyük: " + max);
    }
}
