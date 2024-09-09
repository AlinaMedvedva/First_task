package book_and_student;

import java.util.ArrayList;

public class Student {
    private String surname, name;
    private ArrayList<Book> books;




    public Student(String surname, String name) {
        this.surname = surname;
        this.name = name;
        books = new ArrayList<Book>();
    }




    public void giveBook(Book book){
        books.add(book);
    }




    public String allBook(){
        String s = "";
        for(Book book: books){
            s += book.toString() +"\n";
        }
        if(s.length() == 0)
            s = "Нет книг ";
        s += "у студента по имени " + name + " " + surname;
        return s;
    }




    @Override
    public String toString() {
        return surname + " " + name + " взял: " + books.size() + " книг.";
    }




    public String indexOfBooks(int index){
        int i = 0;
        for(Book book: books){
            if(i == index)
                return book.toString();
            i++;
        }
        return "Not found";
    }

}
