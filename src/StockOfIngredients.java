import java.util.HashMap;
import java.util.Map;

public class StockOfIngredients {
    public Map<Ingredients, Integer> listOfNumbersOfIngredients = new HashMap<>();

    public StockOfIngredients() {
        setListOfNumbersOfIngredients();
    }

    public Map<Ingredients, Integer> getListOfNumbersOfIngredients() {
        return listOfNumbersOfIngredients;
    }

    private void setListOfNumbersOfIngredients() {
        listOfNumbersOfIngredients.put(Ingredients.DOUGH, 15);
        listOfNumbersOfIngredients.put(Ingredients.CHEESES, 15);
        listOfNumbersOfIngredients.put(Ingredients.MEAT, 15);
        listOfNumbersOfIngredients.put(Ingredients.TOMATOES, 15);
    }


}





