package jdbc.data;

import jdbc.entities.Customers;
import jdbc.entities.Order;
import jdbc.entities.OrderLine;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

//scrive e legge i dati
public class DBOrderRepository implements OrderRepository {
    final static String URL = "jdbc:postgresql://localhost:5432/student?user=postgresMaster&password=goPostgresGo";
    final static String CUSTOMERS_ORDERS_ORDER_DETAILS = "SELECT O.orderid, O.orderdate, OD.productid, OD.unitprice, OD.qty, OD.discount FROM orders AS O JOIN orderdetails AS OD ON O.orderid=OD.orderid WHERE O.custid = ? ORDER BY o.orderid";

    @Override
    public Iterable<Order> findByCustomerId(Customers customer) throws DataException {

        try (Connection c = DriverManager.getConnection(URL);
             PreparedStatement st = c.prepareStatement(CUSTOMERS_ORDERS_ORDER_DETAILS);/*Factory method pattern*/
        ) {
            st.setInt(1, customer.getCustid());
            try (ResultSet rs = st.executeQuery()) {
                Collection<Order> ords = new ArrayList<>();
                int previousId = -1;
                Order current = null;
                while (rs.next()) {
                    int orderId = rs.getInt("orderid");
                    if(orderId!=previousId){
                        LocalDate orderDate = rs.getObject("orderdate", LocalDate.class);
                        current = new Order(orderId, customer, orderDate);
                        ords.add(current);
                        previousId = orderId;
                    }
                    int productId = rs.getInt("productid");
                    double unitprice = rs.getInt("unitprice");
                    int qty = rs.getInt("qty");
                    double discount = rs.getInt("discount");
                    OrderLine ol = new OrderLine(orderId,productId,unitprice,qty,discount);
                    current.addLine(ol);
                }
                return ords;
            }
        } catch (SQLException e) {
            throw new DataException(e.getMessage(), e);
        }
    }
}
