package sample;

public class Tuote {

    private String Nimi;
    private String Tuotetyyppi;
    private String Kayttoonottopaiva;
    private double myyntihinta;

    public Tuote() {
    }

    public Tuote(String nimi, String tuotetyyppi, String kayttoonottopaiva, double myyntihinta) {
        Nimi = nimi;
        Tuotetyyppi = tuotetyyppi;
        Kayttoonottopaiva = kayttoonottopaiva;
        this.myyntihinta = myyntihinta;
    }

    public String getNimi() {
        return Nimi;
    }

    public void setNimi(String nimi) {
        Nimi = nimi;
    }

    public String getTuotetyyppi() {
        return Tuotetyyppi;
    }

    public void setTuotetyyppi(String tuotetyyppi) {
        Tuotetyyppi = tuotetyyppi;
    }

    public String getKayttoonottopaiva() {
        return Kayttoonottopaiva;
    }

    public void setKayttoonottopaiva(String kayttoonottopaiva) {
        Kayttoonottopaiva = kayttoonottopaiva;
    }

    public double getMyyntihinta() {
        return myyntihinta;
    }

    public void setMyyntihinta(double myyntihinta) {
        this.myyntihinta = myyntihinta;
    }

    @Override
    public String toString() {
        return "Tuote{" +
                "Nimi='" + Nimi + '\'' +
                ", Tuotetyyppi='" + Tuotetyyppi + '\'' +
                ", Kayttoonottopaiva='" + Kayttoonottopaiva + '\'' +
                ", myyntihinta=" + myyntihinta +
                '}';
    }
}
