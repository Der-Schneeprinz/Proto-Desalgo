package main.ulam;

public abstract class UlamAbstract {

    protected String title;
    protected String[] ingredients;
    protected double[] prices;
    protected double[] weight;
    protected double presyo;
    protected String[] units;


    public UlamAbstract(String title, double presyo, String[] ingredients, double[] prices, double[] weight, String[] units) {
        
        this.title = title;
        this.presyo = presyo;
        this.ingredients = ingredients;
        this.prices = prices;
        this.weight = weight;
        this.units = units;

    }

    public String getTitle() {
        return title;
    }

    public double getPresyo() {
        return presyo;
    }

    public String getIngredients(int ctr) {
        return ingredients[ctr];
    }


    public double getPrices(int ctr) {
        return prices[ctr];
    }

    public double getWeight(int ctr) {
        return weight[ctr];
    }

    public int getLength() {
        return ingredients.length;
    }

}
