package exampl;
import static exampl.Phonebook.showBook;

public class Main {
    public static void main(String[] args) {
        Phonebook book = new Phonebook();
        Phonebook.add("Nadin", "89201989898");
        Phonebook.add("Nadin", "89201934568");
        Phonebook.add("Axel", "89202342334");
        Phonebook.add("Axel", "89202456734");
        Phonebook.add("Stiv", "89203898989");
        Phonebook.add("Nadin", "89102324556");
        Phonebook.add("Stiv", "89264443322");
        Phonebook.add("Nadin", "89106785423");
        Phonebook.add("Olga", "89202964745");
        Phonebook.add("Stiv", "89203123456");

        System.out.println("Выполнение запроса номеров по имени -->");
        System.out.println("-".repeat(60));
        System.out.println(book.get("Nadin"));
        System.out.println(book.get("Axel"));
        System.out.println(book.get("Olga"));
        System.out.println("-".repeat(60));

        System.out.println("Вывод отсортирован по убыванию числа телефонов -->");
        System.out.println("-".repeat(60));
        showBook();
        System.out.println("-".repeat(60));
    }
}
