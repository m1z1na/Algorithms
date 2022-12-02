package Book;

public class Book {

    private String title;
    private String author;
    private Short year;
    private final String  delimeter = ","; // Разделитель


    public Book(String text ){

        String[] subStr;
        subStr = text.split(delimeter);

        for(int i = 0; i < subStr.length; i++) {
//            1961,Джозеф Хеллер,Уловка-22
            if (i == 0){
                this.year = Short.valueOf(subStr[i]);
            }
            else if(i == 1 ){
                this.author = subStr[i];
            }
            else if(i == 2 ){
                this.title = subStr[i];
            }

        }
    }



    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Short getYear() {
        return year;
    }


}
