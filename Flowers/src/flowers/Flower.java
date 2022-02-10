package flowers;

public abstract class Flower {
    private static int totalCountFlowers;

    public static int getTotalCountFlowers() {
        return totalCountFlowers;
    }

    private final String name;
    private final String importingCountry;
    private final int cost;
    private final int sellBy;

    public Flower(String importingCountry, int cost, int sellBy) {
        this.name = getName();
        this.importingCountry = importingCountry;
        this.cost = cost;
        this.sellBy = sellBy;
    }

    /***Getters & Setters***/
    public String getName() {
        return name;
    }

    public String getImportingCountry() {
        return importingCountry;
    }

    public int getCost() {
        return cost;
    }

    public int getSellBy() {
        return sellBy;
    }

    public static void getTotalSales() {
        System.out.printf("""
                Всего продано цветов:
                количество: %d шт.
                сумма: %d руб.
                %n""", Bouquet.getTotalCount(), Bouquet.getTotalCost());
    }

    @Override
    public String toString() {
        return """
                * Цветок: %s
                * Страна импортёр: %s
                * Срок реализации: %d дн.
                * Цена: %d руб.
                """.formatted(name, importingCountry, sellBy, cost);
    }
}
