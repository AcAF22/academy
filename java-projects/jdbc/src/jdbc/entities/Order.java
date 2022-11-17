package jdbc.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private Customers customer;
    private LocalDate orderDate;
    private List<OrderLine> lines;

    public Order(int orderId, Customers customer, LocalDate orderDate) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderDate = orderDate;
        lines = new ArrayList<>();
    }

    public int addLine(OrderLine ol){
        lines.add(ol);
        return lines.size();
    }

    public int getOrderId() {
        return orderId;
    }

    public Customers getCustId() {
        return customer;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<OrderLine> getLines() {
        return lines;
    }
}
