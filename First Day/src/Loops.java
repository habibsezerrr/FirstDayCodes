public class Loops {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Loop is over...");

        System.out.println("***************************************");

        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i += 2; // 1'den başlayarak tek sayıları yazdırıyoruz.
        }
        System.out.println("While loop is over");

        System.out.println("***************************************");

        int j = 0;
        do {
            j += 2; // 0'dan başlayarak çift sayıları yazdırıyoruz.
            System.out.println(j);
        }while (j < 10);
        System.out.println("For loop is over...");
    }
}
