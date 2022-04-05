public enum Ingredients {
    DOUGH(15), CHEESES(15), MEAT(15), TOMATOES(15);

    Ingredients(int valueOfIngredient) {
        this.valueOfIngredient = valueOfIngredient;
    }

    private int valueOfIngredient;

    public int getValueOfIngredient() {
        return valueOfIngredient;
    }
}
