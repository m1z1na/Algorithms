package Book;

public class XMLFormatterImpl implements Formatter {

    @Override
    public String format(Book book) {
        return "<book>\n" +
                "   <title>" + book.getTitle() + "</title>\n" +
                "   <author>" + book.getAuthor() + "</author>\n" +
                "   <year>" + book.getYear() + "</year>\n" +
                "</book>";
    }
}
