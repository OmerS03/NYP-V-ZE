public abstract class Uye {
    private String ad;
    private String soyad;
    private String eposta;

    public Uye(String ad, String soyad, String eposta) {
        this.ad = ad;
        this.soyad = soyad;
        this.eposta = eposta;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getEposta() {
        return eposta;
    }

    public abstract String format();
}