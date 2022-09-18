public class Arrays {

    public static void main(String[] args) {
        //bunların tek tek çıktısını almak zor olur. O yüzden dizileri kullanacağız.
        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-----------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0]="Engin";
        ogrenciler[1]="Derin";
        ogrenciler[2]="Salih";
        ogrenciler[3]="Ahmet";
        ogrenciler[4]="Ali"; // bu 5. index olduğu için çalıştırırsak hata alırız.

        for(int i = 0; i < ogrenciler.length; i++){
            System.out.println(ogrenciler[i]); //çıktıda 4 ismi alırız
        }
        System.out.println("-----------------------");

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci); //çıktıda 4 ismi alırız
        }
    }
}