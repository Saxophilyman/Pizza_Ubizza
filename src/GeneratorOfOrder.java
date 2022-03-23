import java.util.Random;

public class GeneratorOfOrder implements Runnable {


    private void addOrderToQueue(){
    }

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

    }
}
    /*При совершении заказа выводить:
        Информацию о заказе в одну строку (порядковый номер, состав);
        Состояние очереди заказов (вывести в одну строку номера заказов через запятую)*/