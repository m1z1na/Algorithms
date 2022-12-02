package Book;

import java.io.FileWriter;
import java.io.IOException;


public class BookStoreImpl implements BookStore{
    private Formatter format;

    public BookStoreImpl(Formatter format) {
        this.format = format;
    }

    @Override
    public void store(Book book) {

        try
        {
            String filename= "MyLibrary.txt";
            FileWriter fw = new FileWriter(filename,true);
            fw.write(format.format( book ));
            fw.write("\n");
            fw.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }


    }



}
