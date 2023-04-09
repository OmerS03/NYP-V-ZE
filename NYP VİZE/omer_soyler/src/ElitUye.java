/*ElitUye sınıfı, üyelerin isim, soyisim ve e-posta bilgilerini tutar ve
bu bilgilere erişim için get/set fonksiyonları sağlar.
ElitUye Uye sınıfını extends eder.

*/
public class ElitUye extends Uye {
    public ElitUye(String ad, String soyad, String eposta) {
        super(ad, soyad, eposta);
    }

    @Override
    public String format() {
        return getAd() + "\t" + getSoyad() + "\t" + getEposta() + "\tELIT";
    }



}