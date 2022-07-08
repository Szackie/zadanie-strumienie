package Strumienie;

@SuppressWarnings("unused")
class Dubler extends Strumien {

    Strumien lewy;
    Strumien prawy;

    public Dubler(String nazwa, Strumien lewy, Strumien prawy) {
        super(nazwa);
        this.lewy = lewy;
        this.prawy = prawy;
    }

    public void pisz(String lancuch) {
        if (lewy == null || prawy == null)
            throw new NullPointerException("At least one of streams is null");

            lewy.pisz(lancuch);
            prawy.pisz(lancuch);

    }

    public long dajLiczbeZnakow() {
        if (lewy == null || prawy == null)
            throw new NullPointerException("At least one of streams is null");
        return lewy.dajLiczbeZnakow() + prawy.dajLiczbeZnakow();
    }

    public boolean czyZamkniety() {
        if (lewy == null || prawy == null)
            throw new NullPointerException("At least one of streams is null");

        return lewy.czyZamkniety() && prawy.czyZamkniety();
    }

    public void zamknij() {
        if (lewy == null || prawy == null)
            throw new NullPointerException("At least one of streams is null");

            lewy.zamknij();
            prawy.zamknij();

    }

    public String toString() {
        if (lewy == null || prawy == null)
            throw new NullPointerException("At least one of streams is null");

        return
                super.toString() +
                        "\nLewy: " + lewy.toString() +
                        "\nPrawy:" + prawy.toString() +
                        "\n łączna liczba wypisanych znaków: " + this.dajLiczbeZnakow() +
                        "\n stan strumienia: " + this.czyZamkniety();
    }

}
