package book_and_student;


public class Main {
    public static void main(String[] args) {
        Student stud [] = {new Student("Иванов", "Иван"), new Student("Петров", "Петр")};
        Book books [] = {new Book("1984", "Оруэлл", 1949), new Book("Муму", "Тургенев", 1854)};
        Magazine mag = new Magazine("Комсомолец", null, 1930, "Партия");


        System.out.println(stud[0].allBook());
        stud[0].giveBook(books[0]);
        stud[0].giveBook(mag);
        stud[1].giveBook(books[1]);


        stud[0].toString();
        System.out.println(stud[0].allBook());
        System.out.println();
        stud[1].toString();
        System.out.println(stud[1].allBook());
        System.out.println();
        Book b = stud[0].indexOfBooks(0);
        System.out.println(b.toString());
        b = stud[0].indexOfBooks(2);
        if(b == null)
            System.out.println("Not found");

    }
}
