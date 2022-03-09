public class FoodMaker {
    String nameOfFoodMaker;
    //Время приготовления для всех заказов одно и то же
    final int TIME_OF_COOKING;

    {
        TIME_OF_COOKING = 3000;
    }

    private boolean getOrderToCookingByFoodMaker(){
        if (/*для заказа хватает ингредиентов || заказ пролежал в очереди дольше N секунд (задаётся константой)*/){

        }
            else {/*Если ни одного заказа нет, то повар ждёт M секунд (константа) и проводит повторную проверку очереди*/}
    }

    private boolean makeEatByFoodMaker(){
        if (getOrderToCookingByFoodMaker()){
            /*Как только повар берёт заказ в работу, со склада списывается необходимое количество нужных ингредиентов*/
        }
    }

}
