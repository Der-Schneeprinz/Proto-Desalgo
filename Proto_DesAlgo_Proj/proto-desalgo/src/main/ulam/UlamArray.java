package main.ulam;

public class UlamArray extends UlamAbstract {

    int ctr;

    public UlamArray(String title, double presyo, String[] ingredients, double[] prices, double[] weight, String[] units) {
        
        super(title, presyo, ingredients, prices, weight, units);

    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public double getPresyo() {
        return presyo;
    }

    @Override
    public String getIngredients(int ctr) {
        return ingredients[ctr];
    }

    @Override
    public double getPrices(int ctr) {
        return prices[ctr];
    }

    @Override
    public double getWeight(int ctr) {
        return weight[ctr];
    }

    @Override
    public int getLength() {
        return ingredients.length;
    }
}
