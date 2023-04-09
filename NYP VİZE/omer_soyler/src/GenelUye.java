/*GenelUye sınıfı, üyelerin isim, soyisim ve e-posta bilgilerini tutar ve
bu bilgilere erişim için get/set fonksiyonları sağlar.
GenelUye Uye sınıfını extends eder.

*/
public class GenelUye extends Uye {
    public GenelUye(String ad, String soyad, String eposta) {
        super(ad, soyad, eposta);
    }

    @Override
    public String format() {
        return getAd() + "\t" + getSoyad() + "\t" + getEposta() + "\tGENEL";
    }

    @Override
    public String toString() {
        return "Genel Üye - Ad: " + getAd() + ", Soyad: " + getSoyad() + ", E-posta: " + getEposta();
    }
}
