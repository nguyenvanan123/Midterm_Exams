package ExcerciseBooks;

public class MainExercise4 {
    public static void main ( String[] args ) {
        FictionBook fictionBook = new FictionBook ( "Harry Potter", "J.K. Rowling", "Bloomsbury" );
        NonFictionBook nonFictionBook = new NonFictionBook ( "Sapiens", "Yuval Noah Harari", "Harper" );
        ScienceBook scienceBook = new ScienceBook ( "Cosmos", "Carl Sagan", "Random House" );

        System.out.println ( "Fiction Book Info:" );
        System.out.println ( fictionBook.getInfo ( ) );

        System.out.println ( "\nNon-Fiction Book Info:" );
        System.out.println ( nonFictionBook.getInfo ( ) );

        System.out.println ( "\nScience Book Info:" );
        System.out.println ( scienceBook.getInfo ( ) );

        // Tìm kiếm sách có từ "Potter"
        String keyword = "Potter";
        System.out.println ( "\nSearch for '" + keyword + "':" );
        System.out.println ( "Found in Fiction Book: " + fictionBook.search ( keyword ) );
        System.out.println ( "Found in Non-Fiction Book: " + nonFictionBook.search ( keyword ) );
        System.out.println ( "Found in Science Book: " + scienceBook.search ( keyword ) );
    }
}
