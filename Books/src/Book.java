package Books.src;

public class Book {
    private static int counterBooksSales;
    private static int totalBookCounter;
    private int noticeCounter;
    private int checkForSale;

    private String author = "Нет автора";
    private String tittle = "Без названия";
    private int pages;
    private int cost;


    public Book(String tittle, String author, int pages, int cost) {
        noticeCounter = 0;
        checkForSale = 0;
        totalBookCounter += 1;

        setAuthor(author);
        setTittle(tittle);
        setPages(pages);
        setCost(cost);
        bookSale();
    }

    public void bookInfo() {
        System.out.printf("""
                Информация о книге:
                Название: %s
                Автор: %s
                Кол-во страниц: %d
                Цена: %d
                """, tittle, author, cost, pages);
        System.out.println();
    }

    private void bookSale() {
        if (checkForSale == 4) {
            counterBooksSales += 1;
            System.out.printf("""
                    %d) Книга "%s" продана!
                    """, totalBookCounter, tittle);
            System.out.println();
        } else {
            System.out.println();
        }
    }

    public static void getBooksSale() {
        System.out.printf("""
                Книг продано: %d шт.
                %n""", counterBooksSales);
    }

    private void warning(String notice) {
        if (noticeCounter == 0) {
            System.out.printf("""
                    %d) Книга не продана! Причины:
                    """,totalBookCounter);
        }
        System.out.println("* " + notice);
        noticeCounter += 1;
    }

    private void setTittle(String tittle) {
        if (tittle.length() > 0) {
            checkForSale += 1;
            this.tittle = tittle;
        } else {
            warning("Введите название книги!");
        }
    }

    private void setAuthor(String author) {
        if (author.length() > 0) {
            checkForSale += 1;
            this.author = author;
        } else {
            warning("У книги должен быть автор!");
        }
    }

    private void setPages(int pages) {
        if (pages > 0) {
            checkForSale += 1;
            this.pages = pages;
        } else {
            warning("В книге не может быть менее одной страницы");
        }
    }

    private void setCost(int cost) {
        if (cost >= 0) {
            checkForSale += 1;
            this.cost = cost;
        } else {
            warning("Вам не заплатят!");
        }
    }

    public String getAuthor() {
        return author;
    }

    public String getTittle() {
        return tittle;
    }

    public int getPages() {
        return pages;
    }

    public int getCost() {
        return cost;
    }
}
