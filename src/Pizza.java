public class Pizza {
    private SizeOfPizza sizeOfPizza;
    private TypeOfPizza typeOfPizza;

    public Pizza(SizeOfPizza sizeOfPizza, TypeOfPizza typeOfPizza) {
        this.sizeOfPizza = sizeOfPizza;
        this.typeOfPizza = typeOfPizza;
    }

    public SizeOfPizza getSizeOfPizza() {
        return sizeOfPizza;
    }

    public TypeOfPizza getTypeOfPizza() {
        return typeOfPizza;
    }
}
