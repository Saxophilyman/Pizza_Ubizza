import java.util.ArrayList;
import java.util.Random;
//Integer,String,String
public class GeneratorOfOrder implements Runnable {
    ArrayList<Pizza> listInformationOfOrder = new ArrayList();

    //временная переменная
    private int countForDelete = 100;
    //Программа должна корректно завершаться после обработки N заказов
    //(N получать в виде параметра командной строки, 10 <= N <= 1000).

    private void addOrderToQueue(){
        listInformationOfOrder.add((new Pizza(getRandomSizeOfPizza(),getRandomTypeOfPizza()));
    }
//добавить порядковый номер, возможно через Map
    private  TypeOfPizza getRandomTypeOfPizza(){
        Random random = new Random();
        return TypeOfPizza.values()[random.nextInt(TypeOfPizza.values().length)];
    }

    private SizeOfPizza getRandomSizeOfPizza(){
        Random random = new Random();
        return SizeOfPizza.values()[random.nextInt(SizeOfPizza.values().length)];
    }

    @Override
    public void run() {
        int countForStopGeneratorOfOrder = 0; //или порядковый номер заказа
        while (countForStopGeneratorOfOrder<countForDelete){
        //Случайное время
        addOrderToQueue();
        countForStopGeneratorOfOrder++;
        }
    }
}
    /*При совершении заказа выводить:
        Информацию о заказе в одну строку (порядковый номер, состав);
        Состояние очереди заказов (вывести в одну строку номера заказов через запятую)*/