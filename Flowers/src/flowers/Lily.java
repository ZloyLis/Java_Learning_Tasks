package flowers;

public class Lily extends Flower {
    public Lily(String importingCountry, int cost, int sellBy) {
        super(importingCountry, cost, sellBy);
    }

    @Override
    public String getName() {
        return "Лилия";
    }
}
