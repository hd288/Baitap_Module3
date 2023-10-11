package tonghop.business.service;

import tonghop.business.entity.Order;

public interface IOrderService extends IGeneric<Order, Integer> {
    Order findCartByUserId(int userid);

    int getNewId();
}
