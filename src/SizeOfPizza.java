public enum SizeOfPizza {
    SMALL(1), MIDDLE(2), BIG(3);

    private int valueSizeOfPizza;

    SizeOfPizza(int valueSizeOfPizza) {
        this.valueSizeOfPizza = valueSizeOfPizza;
    }



    public int getValueSizeOfPizza() {
        return valueSizeOfPizza;
    }
}
