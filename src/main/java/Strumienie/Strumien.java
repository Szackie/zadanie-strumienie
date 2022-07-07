package Strumienie;

import java.io.IOException;

class Strumien {
    private String nazwa;
    private long licznikZnakow=0;
    private boolean zamkniety=false;

    public Strumien(String nazwa){
        this.nazwa=nazwa;
    }
    public void pisz(String lancuch) throws IOException {
        if(!zamkniety)
        this.licznikZnakow+=lancuch.length();
        else
            throw new RuntimeException("Stream already closed");
    }
    public long dajLiczbeZnakow(){
        return licznikZnakow;
    }
    public boolean czyZamkniety(){
        return zamkniety;
    }
    public void zamknij() throws IOException {
        zamkniety=true;
    }
    public String toString() {
        return nazwa + " \n " + dajLiczbeZnakow() + "\n" + czyZamkniety();
    }
}