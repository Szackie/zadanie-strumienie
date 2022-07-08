package Strumienie;

class App {
    public static void main(String[] args) {
        DoPliku doPliku = new DoPliku("C:\\Users\\Szymon\\IdeaProjects\\Strumien\\src\\main\\testDoPliku.txt", true);
        doPliku.pisz("a");
        System.out.println(doPliku.dajLiczbeZnakow());
        doPliku.pisz("h");

        System.out.println(doPliku.dajLiczbeZnakow());

        Konsola konsola = new Konsola("konsola1", "TTT");
        konsola.pisz("ala ma kota");
        konsola.pisz("ala ma kota");

        System.out.println();
        System.out.print(konsola);

        Dubler dubler = new Dubler("DUBLER", konsola, doPliku);

        dubler.pisz("albert ma psa");
        dubler.zamknij();
        System.out.println();
        System.out.println(dubler);

    }
}
