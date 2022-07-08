package Strumienie;

@SuppressWarnings("unused")
class Konsola extends Strumien {

    private final String separator;

    public Konsola(String nazwa) {
        super(nazwa);
        this.separator = "\n";
    }

    public Konsola(String nazwa, String separator) {
        super(nazwa);
        this.separator = separator;
    }

    public void pisz(String lancuch) {
        super.pisz(lancuch);
        System.out.print(lancuch + separator);
    }

    public String toString() {
        return "Nazwa: "+super.toString();
    }

}
