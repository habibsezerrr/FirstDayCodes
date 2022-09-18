public class Strings {

    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı : " + mesaj.length()); // çıktı --> Eleman sayısı : 21
        System.out.println("5. eleman : " + mesaj.charAt(4)); // çıktı --> 5. eleman : n
        System.out.println(mesaj.concat(" Yaşasın!")); // çıktı --> Bugün hava çok güzel. Yaşasın!
        System.out.println(mesaj.startsWith("B")); // çıktı --> true
        System.out.println(mesaj.endsWith(".")); // çıktı --> true
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler); // çıktı --> Bugün
        System.out.println(mesaj.indexOf("av")); // çıktı --> 7
        System.out.println(mesaj.lastIndexOf("a")); // çıktı --> 9

        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj); // çıktı --> Bugün-hava-çok-güzel.
        System.out.println(mesaj.substring(2,5)); // çıktı --> gün

        for (String kelime : mesaj.split(" ")){    //boşluğa göre hareket ediyor
            System.out.println(kelime); // çıktı -->Bugün
                                        //          hava
                                        //          çok
                                        //          güzel.
        }

        System.out.println(mesaj.toLowerCase()); // çıktı --> bugün hava çok güzel.
        System.out.println(mesaj.toUpperCase()); // çıktı --> BUGÜN HAVA ÇOK GÜZEL.
        System.out.println(mesaj.trim()); // çıktı --> Bugün hava çok güzel.
    }
}
