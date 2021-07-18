package main.ulam;

public abstract class KnapsackCalc {
    
    public static UlamArray KnapsackAlgo(UlamArray ulam, double budget) {
        String[] ingredient = new String[ulam.getAllIngredients().length];
        String[] unit = new String[ulam.getAllIngredients().length];
        double[] price =  new double[ulam.getAllIngredients().length];
        double[] weight = new double[ulam.getAllIngredients().length];
        for(int i = 0; i < ulam.getAllIngredients().length; i++) {
            price[i] = 0;
            weight[i] = 0;
        }
        double totPrice = 0;
        int i = 0;
        while(budget > ulam.getPrices(i)) {
            ingredient[i] = ulam.getIngredients(i);
            price[i] += ulam.getPrices(i);
            weight[i] += ulam.getWeight(i);
            unit[i] = ulam.getUnit(i);
            budget -= ulam.getPrices(i);
            i++;
            i %= ulam.getAllIngredients().length; // for relooping
        }
        price[i] += budget;
        weight[i] += (budget / ulam.getPrices(i)) * ulam.getWeight(i);
        ingredient[i]= ulam.getIngredients(i);
        unit[i] = ulam.getUnit(i);
        for(int j = 0; j < ingredient.length; j++)
            totPrice += price[i];
        UlamArray newUlam = new UlamArray(ulam.getTitle(), totPrice, ingredient, price, weight, unit);
        return newUlam;
    }

}
