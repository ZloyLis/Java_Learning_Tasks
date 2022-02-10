package Books;


import Books.src.Book;

public class Main {
    public static void main(String[] args) {
        Book.getBooksSale();

        Book book = new Book("Rikki-Tikki-Tavi", "R.Kipling", 50, 10);

        Book.getBooksSale();

        book.bookInfo();
    }
}
