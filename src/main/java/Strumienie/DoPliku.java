package Strumienie;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

@SuppressWarnings("unused")
class DoPliku extends Strumien{
    private RandomAccessFile plik;

    public DoPliku(String sciezka, boolean czyNadpisac) {
        super(sciezka);

            File file = new File(sciezka);
            if (file.exists()&&!czyNadpisac)
                throw new RuntimeException("File already exists");

{
            try {
                FileWriter file2=new FileWriter(sciezka,false);
                plik = new RandomAccessFile(sciezka, "rw");

            } catch (IOException e) {
                System.out.println(e.getMessage());
                zamknij();
            }
        }
    }
    public void pisz(String lancuch) {
        super.pisz(lancuch);
        try {
        if(plik!=null)
            plik.writeUTF(lancuch);
        else
            throw new NullPointerException();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void zamknij(){
        try {
            if(!czyZamkniety())
                plik.close();
            super.zamknij();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
