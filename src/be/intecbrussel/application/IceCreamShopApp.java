package be.intecbrussel.application;


import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.IEatable;
import be.intecbrussel.eatables.MagnumType;
import be.intecbrussel.sellers.IIceCreamSeller;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.NoMoreIceCreamException;
import be.intecbrussel.sellers.PriceList;

public class  IceCreamShopApp {
    public static void main(String[] args) throws NoMoreIceCreamException {
        PriceList priceList = new PriceList(0.7, 1.4, 2.1);
        IIceCreamSeller iceCreamSeller = new IceCreamSalon(priceList);

        IEatable[] eatables = {
                iceCreamSeller.orderMagnum(MagnumType.ROMANTICS_STRAWBERRIES),
                iceCreamSeller.orderMagnum(MagnumType.ALPINE_NUTS),
                iceCreamSeller.orderMagnum(MagnumType.BLACK_CHOCOLATE),
                iceCreamSeller.orderMagnum(MagnumType.ROMANTICS_STRAWBERRIES),
                iceCreamSeller.orderMagnum(MagnumType.MILK_CHOCOLATE),
                iceCreamSeller.orderMagnum(MagnumType.WHITE_CHOCOLATE),

                iceCreamSeller.orderIceRocket(),

                iceCreamSeller.orderCone(new Flavor[]{Flavor.CHOCOLATE, Flavor.VANILLA, Flavor.BANANA})};

        for (IEatable iceSalon: eatables) {

            iceSalon.eat();
        }


        System.out.println("The profit is: " + iceCreamSeller.getProfit());
    }










    }

