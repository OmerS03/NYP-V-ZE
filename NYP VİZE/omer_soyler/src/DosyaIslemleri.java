import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/*DosyaIslemleri sınıfı, dosya okuma ve yazma işlemlerini gerçekleştirir.
uyeKaydet fonksiyonu, verilen dosya ismi ve üye nesnesi ile dosyaya üye bilgilerini yazar.
uyeleriGetir fonksiyonu, verilen dosya ismi ile dosyadaki tüm üye bilgilerini
okur ve bir List<Uye> nesnesi olarak döndürür.
*/
public class DosyaIslemleri {
    public void uyeKaydet(String dosyaAdi, Uye uye) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(dosyaAdi, true));
        writer.write(uye.format() + "\n");
        writer.close();
    }

    public List<Uye> uyeleriGetir(String dosyaAdi) throws IOException {
        List<Uye> uyeler = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(dosyaAdi));
        String satir = reader.readLine();
        while (satir != null) {
            String[] bilgiler = satir.split("\t");
            if (bilgiler.length != 4) {
                reader.close();
                throw new IOException("Hatalı dosya biçimi: " + satir);
            }
            if (bilgiler[3].equals("ELIT")) {
                uyeler.add(new ElitUye(bilgiler[0], bilgiler[1], bilgiler[2]));
            } else if (bilgiler[3].equals("GENEL")) {
                uyeler.add(new GenelUye(bilgiler[0], bilgiler[1], bilgiler[2]));
            } else {
                reader.close();
                throw new IOException("Hatalı dosya biçimi: " + satir);
            }
            satir = reader.readLine();
        }
        reader.close();
        return uyeler;
    }
}