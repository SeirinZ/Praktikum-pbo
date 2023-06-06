/* File      : LambdaHashmap.java		
   Penulis   : Satria Bintang Adyatma Putra / 24060121140099
   Deskripsi : Ekspresi lambda pada hashmap, digunakan untuk parameter pada method.*/

import java.util.HashMap;
import java.util.Map;
 
public class LambdaHashmap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("2406012113216125", "ruben");
        mahasiswaMap.put("2406012111361369", "rama");
        mahasiswaMap.put("2406012111361367", "pragos");
 
        mahasiswaMap.forEach((nim, nama) -> System.out.println( nim + ": " + nama));
    }
}