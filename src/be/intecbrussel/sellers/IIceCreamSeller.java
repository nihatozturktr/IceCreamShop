package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public interface IIceCreamSeller extends IProfitable {

   IEatable orderCone(Flavor [] flavors);
   IceRocket orderIceRocket();
   Magnum orderMagnum(MagnumType magnumType);




}
