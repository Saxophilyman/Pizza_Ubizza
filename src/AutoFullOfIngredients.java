import java.util.HashMap;
import java.util.Map;

public class AutoFullOfIngredients implements Runnable {
    int minimumVolumeOfIngredients = 15;
    private Map<Ingredients, Integer> listOfNumbersOfIngredientsUsingInAutoFull;


    public AutoFullOfIngredients(StockOfIngredients stockOfIngredientsConstructor) {
        this.listOfNumbersOfIngredientsUsingInAutoFull = stockOfIngredientsConstructor.getListOfNumbersOfIngredients();
    }


    @Override
    public void run() {
        for (Map.Entry<Ingredients, Integer> entry : listOfNumbersOfIngredientsUsingInAutoFull.entrySet()) {
            if (entry.getValue() < minimumVolumeOfIngredients) {
                entry.setValue(entry.getValue() + minimumVolumeOfIngredients);
            }
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

    /*Время от времени запасы ингредиентов на складе пополняются
    Для каждого ингредиента задан нижний порог его количества на складе
            (этот порог может быть одинаковым для всех ингредиентов).
    Если при проверке выясняется, что количество некоторого ингредиента ниже порогового значения,
    то запасы ингредиента на складе пополняются. Объём пополнения запасов равен нижнему порогу количества данного ингредиента.
        Например, пусть нижний порог равен 10 единицам, а на складе осталось 7 единиц,
    тогда при следующем пополнении количество ингредиента увеличится до 17 единиц.
*/

}
