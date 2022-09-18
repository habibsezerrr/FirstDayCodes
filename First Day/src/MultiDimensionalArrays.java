public class MultiDimensionalArrays {

    public static void main(String[] args) {

        String [][] cities = new String[3][3];

        cities[0][0] = "İzmir";
        cities[0][1] = "Aydın";
        cities[0][2] = "Kütahya";
        cities[1][0] = "Antalya";
        cities[1][1] = "Mersin";
        cities[1][2] = "Adana";
        cities[2][0] = "Diyarbakır";
        cities[2][1] = "Mardin";
        cities[2][2] = "Şanlıurfa";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(cities[i][j]);
            }
        }
    }
}
