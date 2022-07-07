package Strumienie;

class App {
    public static void main(String [] args){
        DoPliku doPliku=new DoPliku("C:\\Users\\Szymon\\IdeaProjects\\Strumien\\src\\main\\testDoPliku.txt",true);
        doPliku.pisz("a");
        System.out.println(doPliku.dajLiczbeZnakow());
        doPliku.pisz("h");

        System.out.println(doPliku.dajLiczbeZnakow());

        doPliku.zamknij();

        Konsola konsola = new Konsola("konsola1","TTT");
        konsola.pisz("ala ma kota");
        konsola.pisz("ala ma kota");
        konsola.pisz("ala ma kota");
        System.out.println();
        System.out.print(konsola);


    }
}
