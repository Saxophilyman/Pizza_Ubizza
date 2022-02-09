public class Pizzeria {
    final static int TIME_OF_WAITING_QUEUE_FOR_ORDER = 20;
    final static int TIME_OF_WAITING_FOR_FOOD_MAKER = 20;
    final static int MINIMUM_OF_INGREDIENTS = 10;
    final static int TIME_OF_COOKING_ORDER = 10;

    private String messageInformationAboutOrder(int numberOfOrder, String ingredients){ //возможно не строкой, а массивом // порядковый номер, состав
        return numberOfOrder + ingredients;
    }

    private void messageInformationAboutQueue(){ //в одну строку номера заказов через запятую
    }

    private String messageInformationAboutNameOfFoodMaker(String nameOfFoodMaker) {
        return nameOfFoodMaker;
    }

    private void messageWarningOfIncompleteOrder () { //заказ будет неполным, выводить сколько фактически ингридиентов уйдёт на заказ
    }

    private void messageInformationAboutReserveIngredients () { //состояние запасов ингридиентов (за вычетом тех, которые потрачены на этот заказ)
    }

    private void outputOnDisplay (){
        System.out.println(System.currentTimeMillis() + "message");
    }
}
