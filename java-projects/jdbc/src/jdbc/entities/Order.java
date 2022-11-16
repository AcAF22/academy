package jdbc.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private int custId;
    private LocalDate orderDate;
    private List<OrderLine> lines;

    public Order(int orderId, int custId, LocalDate orderDate) {
        this.orderId = orderId;
        this.custId = custId;
        this.orderDate = orderDate;
        lines = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public int getCustId() {
        return custId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<OrderLine> getLines() {
        return lines;
    }
}
