package flowers;

public class Chrysanthemum extends Flower {
    public Chrysanthemum(String importingCountry, int cost, int sellBy) {
        super(importingCountry, cost, sellBy);
    }

    @Override
    public String getName() {
        return "Хризантема";
    }

}
