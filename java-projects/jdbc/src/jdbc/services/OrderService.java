package jdbc.services;

import jdbc.data.*;
import jdbc.entities.Customers;
import jdbc.entities.Order;

import java.util.ArrayList;
import java.util.Optional;

public class OrderService { //emette le regole ex: cosa fare se non c'è un risultato
    private CustomerRepository custRepo;
    private OrderRepository orderRepo;

    public OrderService(CustomerRepository custRepo, OrderRepository orderRepo){
        this.custRepo = custRepo;
        this.orderRepo = orderRepo;
    }

    public Iterable<Order> findByCustomerId(int custId) throws DataException {
        Optional<Customers> oc = custRepo.findById(custId);
        if (oc.isEmpty())
            return new ArrayList<Order>();
        Customers cust = oc.get();
        return orderRepo.findByCustomerId(cust);
    }
}
