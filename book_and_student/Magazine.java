package book_and_student;

public class Magazine extends Book{
    private String theme;


    public Magazine(String name, String author, int year, String theme) {
        super(name, author, year);
        this.theme = theme;
    }




    @Override
    public String toString() {
        return "Главный редактор: " + getAuthor() + ", год издания: " + getYear() + ", тема: "
                + theme + ", название статьи: " + getName();
    }
}
