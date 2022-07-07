package Strumienie;

@SuppressWarnings("unused")
class Konsola extends Strumien {

    private String separator;
    private boolean firstSeparator=true;

    public Konsola(String nazwa) {
        super(nazwa);
        this.separator="\n";
    }

    public Konsola(String nazwa, String separator) {
        super(nazwa);
        this.separator = separator;
    }
    public void pisz(String lancuch){
        if(firstSeparator)
        System.out.print(lancuch);
        else
            System.out.print(separator+lancuch);
        firstSeparator=false;
    }

    public String toString(){
        return "toString from Konsola class, they didn't specified what the method should display :( ";
    }

}
