package Book;

import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.Scanner;

public class BookExec {
    public static void main(String[] args) throws IOException, SAXException {
        Formatter format;
        //Задаем формат из аргумента
        switch (args[0]) {
            case ("JSON"):
                format = new JSONFormatterImpl();
                break;
            case ("XML"):
                format = new XMLFormatterImpl();
                break;
            default:
                System.out.println("Invalid argument!");
                return;
        }
        System.out.println(args[0]);
        //вводим значение из консоли
        Scanner in;


        while (1 == 1) {

            in = new Scanner(System.in);
            System.out.print("Введите информацию о книге: ");
            String str = in.nextLine();
            //создаем store, который сохранит книгу в нужном формате
            if (str.matches("\\d{4},[a-яА-Яa-zA-Z\\s]+,[a-яА-Яa-zA-Z\\s\\d\\-]+") == true) {
                new BookStoreImpl(format).store(new Book(str));
            } else {
                System.out.println("Invalid value!");
                break;
            }
        }
        in.close();
    }


}
