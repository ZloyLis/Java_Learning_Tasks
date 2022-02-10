package flowers;

public class Rose extends Flower{

    public Rose(String importingCountry, int cost, int sellBy) {
        super(importingCountry, cost, sellBy);
    }

    @Override
    public String getName() {
        return "Роза";
    }

}
