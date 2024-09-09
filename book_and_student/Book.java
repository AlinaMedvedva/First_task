package book_and_student;

class Book {
    private String name;
    private String author;
    private int year;


    public Book(String name, String author, int year) {
        this.name = name;
        this.year = year;
        if (author == null) {
            this.author = "Без автора";
        } else this.author = author;
    }

    @Override
    public String toString() {
        return "'" + name + "', " + author + ", " + year;
    }


    public String getName() {
        return name;
    }


    public String getAuthor() {
        return author;
    }


    public int getYear() {
        return year;
    }

}
