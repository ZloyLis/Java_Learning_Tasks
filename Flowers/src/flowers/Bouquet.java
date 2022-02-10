package flowers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bouquet {
    private static int totalCost;
    private static int totalCount;

    List<Flower> bouquet = new ArrayList<>();

    public void addFlower(Flower... flowers) {
        bouquet.addAll(Arrays.asList(flowers));
        calculateTotalCost();
        calculateTotalCount();
    }

    public void showBouquet() {
        int costFlower = 0;
        int flowerCounterInBouquet = 0;
        System.out.println("***Букет цветов***");

        for (Flower flower : bouquet) {
            System.out.println("***");
            System.out.print(flower);
            costFlower += flower.getCost();
            flowerCounterInBouquet++;
        }

        System.out.println("***");
        System.out.printf("""
                Кол-во цветов в букете: %d шт.
                Стоимость букета: %d руб.
                %n""", flowerCounterInBouquet, costFlower);
    }

    private void calculateTotalCost() {
        for (Flower flower : bouquet) {
            totalCost += flower.getCost();
        }
    }

    private void calculateTotalCount() {
        for (int i = 0; i < bouquet.size(); i++) {
            totalCount++;
        }
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public static int getTotalCost() {
        return totalCost;
    }

}
