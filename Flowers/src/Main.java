import flowers.*;

public class Main {
    public static void main(String[] args) {
        Rose rose = new Rose("Russia", 15, 15);
        Tulip tulip = new Tulip("Russia", 7, 5);
        Chrysanthemum chrysanthemum = new Chrysanthemum("Russia", 12, 7);
        Lily lily = new Lily("Russia", 10, 4);

        Bouquet bouquet = new Bouquet();
        Bouquet bouquet2 = new Bouquet();
        bouquet.addFlower(rose, tulip, tulip, rose, lily, lily, chrysanthemum);
        bouquet2.addFlower(rose, rose, rose, rose, rose, tulip, chrysanthemum, chrysanthemum);

        bouquet.showBouquet();
        bouquet2.showBouquet();
        Flower.getTotalSales();
    }
}

