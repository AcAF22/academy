package jdbc.data;

import jdbc.entities.Customers;

import java.sql.SQLException;
import java.util.Optional;

public interface CustomerRepository {
    Iterable<Customers> getAll() throws Exception;
    Optional<Customers> findById(int id) throws DataException;
    boolean deleteById(int id) throws DataException;
    boolean updateCustomer(Customers c) throws DataException;
    void insert(Customers c) throws DataException;
}
