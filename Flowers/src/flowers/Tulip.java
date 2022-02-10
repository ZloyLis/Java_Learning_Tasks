package flowers;

public class Tulip extends Flower {

    public Tulip(String importingCountry, int cost, int sellBy) {
        super(importingCountry, cost, sellBy);
    }

    @Override
    public String getName() {
        return "Тюльпан";
    }
}
