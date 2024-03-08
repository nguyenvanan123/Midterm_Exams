package ExcerciseBooks;

public class Book {
    private String title;
    private String author;
    private String publisher;

    public Book ( String title, String author, String publisher ) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    // Phương thức lấy thông tin sách
    public String getInfo () {
        return "Title: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher;
    }

    // Phương thức tìm kiếm sách
    public boolean search ( String keyword ) {

        return title.contains ( keyword ) || author.contains ( keyword ) || publisher.contains ( keyword );
    }
}
