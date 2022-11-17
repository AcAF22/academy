package jdbc.data;

import jdbc.entities.Customers;
import jdbc.entities.Order;

import java.util.Optional;

public interface OrderRepository {
    Iterable<Order> findByCustomerId(Customers customer) throws DataException;
}
