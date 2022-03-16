package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamCar implements IIceCreamSeller{


    private PriceList priceList;
    private Stock stock;
    private double profit;

    public IceCreamCar() {
    }

    public IceCreamCar(PriceList priceList,Stock stock) {
        this.priceList = priceList;
        this.stock=stock;
    }


    @Override
    public IEatable orderCone(Flavor[] flavors) {
        return null;

    }

    @Override
    public IceRocket orderIceRocket() {
        return null;
    }

    @Override
    public Magnum orderMagnum(MagnumType magnumType) {
        return null;
    }

    @Override
    public void getProfit(double Profit) {



    }

    @Override
    public double getProfit() {
        return 0;
    }
}
