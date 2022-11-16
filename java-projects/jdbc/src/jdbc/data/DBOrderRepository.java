package jdbc.data;

import jdbc.entities.Order;

public class DBOrderRepository implements OrderRepository{
    final static ;
    @Override
    //al max 2 query uno per customer ed una tra order e line order
    public Iterable<Order> findByCustomerId(int custId) {
        return null;
    }
}
