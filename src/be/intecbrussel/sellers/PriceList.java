package be.intecbrussel.sellers;

import be.intecbrussel.eatables.IEatable;
import be.intecbrussel.eatables.MagnumType;

public class PriceList implements IEatable {
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    public PriceList(){

    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice){
        setBallPrice(ballPrice);
        setRocketPrice(rocketPrice);
        setMagnumStandardPrice(magnumStandardPrice);
    }

    public void setBallPrice(double ballPrice) {
        if (ballPrice < 0.7){
            System.out.println("Price is wrong");
        }
        this.ballPrice = ballPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        if (rocketPrice < 1.4){
            System.out.println("Price is wrong");
        }
        this.rocketPrice = rocketPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        if (magnumStandardPrice < 2.1){
            System.out.println("Price is wrong");
        }
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public double getMagnumPrice(MagnumType type) {
        switch (type) {
            case ALPINE_NUTS:
                return magnumStandardPrice * 2.1;
            case ROMANTICS_STRAWBERRIES:
                return magnumStandardPrice * 2.8;
            default:
                return magnumStandardPrice;
        }
    }

    @Override
    public void eat() {

    }
}
