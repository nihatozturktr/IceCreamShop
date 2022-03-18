package be.intecbrussel.application;

import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.IEatable;
import be.intecbrussel.eatables.MagnumType;
import be.intecbrussel.sellers.*;

public class IceCreamShopAppV2 {

    public static void main(String[] args) {

    PriceList priceList = new PriceList(0.7, 1.4, 2.1);

    Stock stock = new Stock(6, 8, 9, 9);
    IIceCreamSeller iceCreamSeller = new IceCreamCar(priceList, stock);

        IEatable[] eatables = new IEatable[0];

        try {
            eatables = new IEatable[] {
                    iceCreamSeller.orderMagnum(MagnumType.MILK_CHOCOLATE),
                    iceCreamSeller.orderIceRocket(),
                    iceCreamSeller.orderIceRocket(),
                    iceCreamSeller.orderCone(new Flavor[]{Flavor.BANANA, Flavor.MOKKA})};
            for (IEatable iceCar : eatables){
                iceCar.eat();
            }
            System.out.println("The profit is: " + iceCreamSeller.getProfit());

        } catch (NoMoreIceCreamException nm) {
            System.out.println(nm.getMessage());
        }


    }
}
