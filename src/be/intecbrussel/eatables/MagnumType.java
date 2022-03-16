package be.intecbrussel.eatables;

public enum MagnumType {
    MILK_CHOCOLATE(0.75),
    WHITE_CHOCOLATE(1),
    BLACK_CHOCOLATE(1.5),
    ALPINE_NUTS(1.5),
    ROMANTICS_STRAWBERRIES(1.75);
private double value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    MagnumType(double value) {
        this.value = value;


    }
}
