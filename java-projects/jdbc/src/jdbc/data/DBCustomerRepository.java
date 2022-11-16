package jdbc.data;

import jdbc.entities.Customers;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class DBCustomerRepository implements CustomerRepository {
    final static String URL = "jdbc:postgresql://localhost:5432/student?user=postgresMaster&password=goPostgresGo";
    final static String ALL_CUSTOMERS = "SELECT custid AS customer_id, companyname, city";
    final static String FIND_BY_ID = "SELECT custid AS customer_id, companyname, city FROM customers WHERE custid = ?";
    final static String DELETE_BY_ID = "DELETE FROM customers WHERE custid = ?";
    final static String UPDATE_BY_ID = "UPDATE customers SET companyname=?, city=? WHERE custid = ?";
    final static String INSERT = "INSERT INTO customers(companyname,city) VALUES(?,?)";


    @Override
    public Iterable<Customers> getAll() throws DataException {
        try (Connection c = DriverManager.getConnection(URL);
             Statement st = c.createStatement(); //factory method pattern
             ResultSet rs = st.executeQuery(ALL_CUSTOMERS); //factory method pattern
        ) {
            Collection<Customers> custs = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("custid");
                String cn = rs.getString("companyname");
                String city = rs.getString("city");
                Customers customer = new Customers(id, cn, city);
                custs.add(customer);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new DataException(e.getMessage(), e);
        }
        return null;
    }

    @Override
    public Optional<Customers> findById(int id) throws DataException {
        try (Connection c = DriverManager.getConnection(URL);
             PreparedStatement st = c.prepareStatement(FIND_BY_ID); //factory method pattern
        ) {
            st.setInt(1, id);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    int custId = rs.getInt("custid");
                    String cn = rs.getString("companyname");
                    String city = rs.getString("city");
                    Customers customer = new Customers(id, cn, city);
                    return Optional.of(customer);
                } else {
                    return Optional.empty();
                }
            }
        } catch (SQLException e) {
            throw new DataException(e.getMessage(), e);
        }
    }

    @Override
    public boolean deleteById(int id) throws DataException {
        try (Connection c = DriverManager.getConnection(URL);
             PreparedStatement st = c.prepareStatement(DELETE_BY_ID); //factory method pattern
        ) {
            st.setInt(1, id);
            int row = st.executeUpdate();
            return row == 1;
        } catch (SQLException e) {
            throw new DataException(e.getMessage(), e);
        }
    }

    @Override
    public boolean updateCustomer(Customers customer) throws DataException {
        try(Connection c = DriverManager.getConnection(URL);
            PreparedStatement st = c.prepareStatement(UPDATE_BY_ID);
        ){
            st.setString(1,customer.getCompanyname());
            st.setString(2,customer.getCity());
            st.setInt(1, customer.getCustid());
            int row = st.executeUpdate();
            return row == 1;
        }catch(SQLException e){
            throw new DataException(e.getMessage(), e);
        }
    }

    @Override
    public void insert(Customers customer) throws DataException {
        try(Connection c = DriverManager.getConnection(URL);
            PreparedStatement st = c.prepareStatement(INSERT);
        ){
            st.setString(1,customer.getCompanyname());
            st.setString(2,customer.getCity());
            st.execute();
        }catch(SQLException e){
            throw new DataException(e.getMessage(), e);
        }
    }
}
