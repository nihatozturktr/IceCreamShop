package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public interface IIceCreamSeller extends IProfitable {

   Cone orderCone(Flavor[] balls) throws NoMoreIceCreamException;

   IceRocket orderIceRocket() throws NoMoreIceCreamException;

   Magnum orderMagnum(MagnumType type) throws NoMoreIceCreamException;



}
