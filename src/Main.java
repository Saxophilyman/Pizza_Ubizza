import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        /*Программа должна корректно завершаться после обработки N заказов
         (N получать в виде параметра командной строки, 10 <= N <= 1000).*/
        StockOfIngredients stockOfIngredients = new StockOfIngredients();
        AutoFullOfIngredients autoFullOfIngredients = new AutoFullOfIngredients(stockOfIngredients);

    }
}
