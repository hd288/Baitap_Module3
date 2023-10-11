package tonghop.business.service;

import tonghop.business.entity.OrderDetail;

import java.util.List;

public interface ICartService extends IGeneric<OrderDetail, Integer> {
    List<OrderDetail> getCartByUserLogin();

    int getNewId();

    OrderDetail findByProductId(int productId);

    void clear();

    void checkOut(IFoodService foodService);
}
