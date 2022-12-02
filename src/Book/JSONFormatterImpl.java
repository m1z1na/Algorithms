package Book;

public class JSONFormatterImpl implements Formatter {
    @Override
    public String format(Book book) {
        return "{\n" +
                "\"title\": '" + book.getTitle() + "'," + '\n' +
                "\"author\": '" + book.getAuthor() + "'," + '\n' +
                "\"year\": " + book.getYear()  + '\n' +
                "}";
    }
}

